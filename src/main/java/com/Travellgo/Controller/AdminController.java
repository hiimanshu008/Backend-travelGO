package com.Travellgo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Travellgo.Entity.Bus;
import com.Travellgo.Entity.Hotel;
import com.Travellgo.Entity.Packages;
import com.Travellgo.Exception.NotFoundException;
import com.Travellgo.Service.AdminServices;

@RestController
@CrossOrigin(origins = "*") 
public class AdminController {

	 @Autowired(required = false)
	 AdminServices adminServices;

	 
	 @PostMapping(value = "/addHotel")
	 public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel) {
		 Hotel hot = adminServices.addHotel(hotel);
		 return new ResponseEntity<Hotel>(hot, HttpStatus.ACCEPTED);
	 }
	 
	 @PostMapping(value = "/addPackage")
	 public ResponseEntity<Packages> addPackage(@RequestBody Packages pack){
		 Packages pkg = adminServices.addPackages(pack);
		 return new ResponseEntity<Packages>(pkg, HttpStatus.ACCEPTED);
	 }
	    
	 @PostMapping(value = "/addBus")
	 public ResponseEntity<Bus> addBus(@RequestBody Bus bus){
		 Bus b = adminServices.addBus(bus);
		 return new ResponseEntity<Bus>(b, HttpStatus.ACCEPTED);
	 }

	 @GetMapping(value = "/allBookings")
	 public ResponseEntity<List<Map<String, String>>> viewAllBooking() throws NotFoundException{
		 List<Map<String, String>> list = adminServices.viewAllBookings();
		 if(list.isEmpty()) {
			 throw new NotFoundException("No bookings");
		 }
		 return new ResponseEntity<List<Map<String, String>>>(list, HttpStatus.OK);
	 }
	 
}
