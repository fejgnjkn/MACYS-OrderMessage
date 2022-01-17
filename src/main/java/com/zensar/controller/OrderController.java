package com.zensar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.zensar.dto.OrderMessageRequest;
import com.zensar.services.OrderService;


public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@PutMapping(value="/{id}", consumes= {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public boolean updateOrder(@PathVariable("id") int id,@RequestBody OrderMessageRequest orserStatus) {
		return orderService.updateOderStatus(id,orserStatus);
	}
	
	

}
