package com.Travellgo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Travellgo.Entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{

	public Optional<Customer> findByEmail(String email);
	
}
