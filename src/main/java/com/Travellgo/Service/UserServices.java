package com.Travellgo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Travellgo.Entity.Booking;
import com.Travellgo.Entity.Bus;
import com.Travellgo.Entity.Customer;
import com.Travellgo.Entity.Feedback;
import com.Travellgo.Entity.Hotel;
import com.Travellgo.Entity.Packages;
import com.Travellgo.Entity.Route;
import com.Travellgo.Entity.Ticket;
import com.Travellgo.Exception.NotFoundException;
import com.Travellgo.Exception.TravellgoException;

@Service
public interface UserServices {

	public Customer userSignup(Customer customer) throws TravellgoException;
	
	public Customer userLogin(String email, String password) throws NotFoundException, TravellgoException;
	
	public List<Packages> viewAllPackages();
	
	public List<Hotel> viewAllHotels();
	
	public List<Bus> viewAllBus();
	
	public List<Ticket> viewYourTickets(int customerId);
	
    public List<Booking> viewYourBookings(int customerId);
    
    public Booking bookHotel(int customerId, int HotelId);
    
    public Booking bookPackage(int customerId, int PackageId);
    
    public Ticket bookBus(int customerId, int routeId, int BusId);
    
    public Feedback addFeedback(int customerId, Feedback feedback);
    
    public void cancelHotelBooking(int BookingId);
    
    public void cancelPackageBooking(int BookingId);
    
    public void cancelTicket(int ticketId);
    
    public Route route(Route route);
    
    public List<Hotel> searchFunction(String name) throws NotFoundException;
    
    public List<Bus> searchBus(String name) throws NotFoundException;
}
