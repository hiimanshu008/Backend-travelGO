package com.Travellgo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Travellgo.Entity.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer>{

}
