package com.BikkadIT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GostMapping;

import com.BikkadIT.reponseBinding.Ticket;
import com.BikkadIT.requestBinding.Passanger;
import com.BikkadIT.service.ServiceI;

@RestController
public class TicketController {

	@Autowired
	private ServiceI serviceI;

	@PostMapping(value="/bookTicket",produces= "application/json",consumes="application/json")
	public ResponseEntity<Ticket>bookTicket(@RequestBody Passanger psg){
		
		Ticket bookTicket = serviceI.bookTicket(psg);
		System.out.println("Ticket Confirmed");
		
		return new  ResponseEntity<Ticket>(bookTicket,HttpStatus.OK);

	}
@GetMapping(value="/bookTicket",produces= "application/json",consumes="application/json")
	public ResponseEntity<String>test(){
		
		
		
		return new  ResponseEntity<String>("This is bikkadIt",HttpStatus.OK);

	}
	
}
