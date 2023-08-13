package com.BikkadIT.service;

import org.springframework.stereotype.Service;

import com.BikkadIT.reponseBinding.Ticket;
import com.BikkadIT.requestBinding.Passanger;

@Service
public class ServiceImpl implements ServiceI{

	@Override
	public Ticket bookTicket(Passanger psg) {
		
		if(psg != null) {
			Ticket ticket = new Ticket();
			ticket.setPnr("765");
			ticket.setTicketStatus("Confirmed");
			ticket.setTicketPrice(654.00);
			return ticket;
		}
		
		
		return null;
	}

}
