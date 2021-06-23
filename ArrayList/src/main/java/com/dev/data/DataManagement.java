package com.dev.data;

import java.util.ArrayList;
import java.util.List;

import com.dev.data.enums.CompanyNames;
import com.dev.data.utils.Utils;

public class DataManagement implements Data {

	private static DataManagement dataManagement;
	private List<Property> listOfProperties;
	private List<Company> listOfCompanies;
	
	private DataManagement() {
		listOfProperties = new ArrayList<>();
		listOfCompanies = new ArrayList<>();
		addCompanies();
	}
	
	public static DataManagement getInstance() {
		return (dataManagement == null) ? new DataManagement() : dataManagement;
	}
	
	public int getNumberOfProperties() {
		return listOfProperties.size();
	}
	
	public List<Company> getListOfCompanies() {
		return listOfCompanies;
	}
	
	public void getAll() {
		for(Property p : listOfProperties) {
			System.out.println("=================");
			System.out.println(p);
			System.out.println("=================");
		}
			
	}
	
	@Override
	public void add(Property property) {
		listOfProperties.add(property);
	}

	@Override
	public Property get(int index) {
		int indexOf = -1;
		for(Property p : listOfProperties)
			if(p.getIndex() == index)
				indexOf = listOfProperties.indexOf(p);
		
		if(indexOf == -1)
			return null;
		
		return listOfProperties.get(indexOf);
	}

	@Override
	public void update(int index, Property property) {
		listOfProperties.set(listOfProperties.indexOf(get(index)), property);
	}

	@Override
	public void delete(int index) {
		listOfProperties.remove(get(index));
	}

	@Override
	public boolean companyExists(String name) {
		Company temp = new Company(name, -1);
		return listOfCompanies.contains(temp);
	}

	private void addCompanies() {
		Company temp;
		
		for(int i=0; i<CompanyNames.values().length; i++) {
			temp = new Company(CompanyNames.values()[i].toString(), Utils.getRandomPhoneNumber());
			listOfCompanies.add(temp);
		}		
	}
}
