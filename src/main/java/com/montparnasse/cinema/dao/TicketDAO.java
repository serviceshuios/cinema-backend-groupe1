package com.montparnasse.cinema.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.montparnasse.cinema.domaine.Ticket;

@Component
@Repository
@Transactional
public interface TicketDAO  extends JpaRepository<Ticket, Long>{
	

}
