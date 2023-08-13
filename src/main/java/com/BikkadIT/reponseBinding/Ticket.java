package com.BikkadIT.reponseBinding;

public class Ticket {

	private String pnr;
	
	private String ticketStatus;
	
	private Double ticketPrice;

	@Override
	public String toString() {
		return "Ticket [pnr=" + pnr + ", ticketStatus=" + ticketStatus + ", ticketPrice=" + ticketPrice + "]";
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public Double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
}
