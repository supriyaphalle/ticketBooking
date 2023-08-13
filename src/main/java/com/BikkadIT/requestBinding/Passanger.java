package com.BikkadIT.requestBinding;

public class Passanger {

	private String fname;
	
	private String lname;
	
	private String fromLocation;
	
	private String toLocation;
	
	private String doj;

	
	
	@Override
	public String toString() {
		return "Passanger [fname=" + fname + ", lname=" + lname + ", fromLocation=" + fromLocation + ", toLocation="
				+ toLocation + ", doj=" + doj + "]";
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}
	
	
	
}
