package com.example.springsql.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.springsql.api.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer> {

}
