package com.dev.data;

public class Property {
	private int index;
	private int floor;
	private Company company;
	
	public Property(int index, int floor) {
		this.index = index;
		this.floor = floor;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		String desc = "Index - " + index + "\n"
				+ "Floor - " + floor + "\n"
				+ "Company: " + "\n";
		
		if(company != null)
			desc += " - " + company.getName();
		else
			desc += "Not set";
		
		return desc;
	}
}
