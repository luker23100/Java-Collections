package com.dev.dataTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.dev.data.Company;
import com.dev.data.DataManagement;
import com.dev.data.Property;

public class DataManagemetTest {
	
	DataManagement data;
	
	@BeforeEach
	void gettingInstance() {
		data = DataManagement.getInstance();
	}
	
	@Test
	void addTest() {
		//given
		int currentNumberOfProperties = data.getNumberOfProperties();
		
		//when
		data.add(new Property(0, 0));
		
		//then
		assertEquals(currentNumberOfProperties+1, data.getNumberOfProperties());
	}
	
	@Test
	void getTest() {
		//given
		int index = 5;
		
		//when
		data.add(new Property(index, 7));
		
		//then
		assertEquals(index, data.get(index).getIndex());
	}
	
	@Test
	void updateTest() {
		//given
		int index = 3;
		int newFloor = 9;
		
		//when
		data.add(new Property(index, 2));
		data.update(index, new Property(index, newFloor));
		
		//then
		assertEquals(newFloor, data.get(index).getFloor());
	}
	
	@Test
	void deleteTest() {
		//given
		int index = 4;
		int currentNumberOfProperties;
		
		//when
		data.add(new Property(index, 1));
		currentNumberOfProperties = data.getNumberOfProperties();
		data.delete(index);	
		
		//then
		assertEquals(currentNumberOfProperties-1, data.getNumberOfProperties());
	}
	
	@Test
	void companyExistsTest() {
		//given
		Company testCompany = new Company("Tester", 000000000);
		
		//when
		data.getListOfCompanies().add(testCompany);
		
		//then
		assertTrue(data.companyExists(testCompany.getName()));
	}
}
