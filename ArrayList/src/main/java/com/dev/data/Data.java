package com.dev.data;

public interface Data {
	public void add(Property property);
	public Property get(int index);
	public void update(int index, Property property);
	public void delete(int index);
	public boolean companyExists(String name);
}
