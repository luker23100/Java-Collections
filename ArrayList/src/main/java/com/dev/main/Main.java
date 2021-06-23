package com.dev.main;

import com.dev.data.DataManagement;
import com.dev.data.Property;

public class Main {

	public static void main(String[] args) {
		DataManagement data = DataManagement.getInstance();

		data.add(new Property(1, 1));
		data.add(new Property(2, 3));
		
		data.get(2).setCompany(data.getListOfCompanies().get(2));
		
		data.getAll();
		
		System.out.println("Is arasaka existing ?");
		System.out.println(data.companyExists("Arasaka"));
	}

}
