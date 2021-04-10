package com.example.springsql.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springsql.api.dao.TicketDao;
import com.example.springsql.api.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	
	@Autowired
	private TicketDao ticketDao;
	
	@PostMapping("/bookTicket")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		Ticket ticket2 = ticketDao.save(ticket);
		return ticket2;
	}
	
	@PostMapping("/bookTickets")
	public String createTicket(@RequestBody List<Ticket> tickets) {
		System.out.println("hello");
		ticketDao.saveAll(tickets);
		return "record created" + tickets.size();
	}

	@GetMapping("/getTickets")
	public List<Ticket> getAllTickets(){
		List<Ticket> list = (List<Ticket>) ticketDao.findAll();
		return list;
	}
	@GetMapping("/getTicket/{id}")
	public Ticket getTicket(@PathVariable int id){
		Optional<Ticket> tic =  ticketDao.findById(id);
		return tic.orElse(new Ticket());
	}
	
	@DeleteMapping("/deleteById/{id}")
	public void deleteById(@PathVariable int id) {
		ticketDao.deleteById(id);
	}
	
	@PutMapping("/updateTicket")
	public Ticket updateTicket(@RequestBody Ticket ticket) {
		return ticketDao.save(ticket);
	}
	
	public TicketDao getTicketDao() {
		return ticketDao;
	}

	public void setTicketDao(TicketDao ticketDao) {
		this.ticketDao = ticketDao;
	}

}
