package com.Travellgo.Service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.Travellgo.Entity.Bus;
import com.Travellgo.Entity.Hotel;
import com.Travellgo.Entity.Packages;

@Service
public interface AdminServices {

	public List<Packages> viewAllPackages();

	public List<Hotel> viewAllHotels();

	public List<Bus> viewAllBus();

	public Hotel addHotel(Hotel hotel);

	public Packages addPackages(Packages packages);

	public Bus addBus(Bus bus);
	
	public List<Map<String,String>> viewAllBookings();
}
