package com.Travellgo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Travellgo.Entity.Booking;

public interface BookingRepo extends JpaRepository<Booking, Integer>{

}
