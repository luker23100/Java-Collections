package com.dev.App;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Data {
	private static Data dataClass;
	private LinkedHashMap<String, ArrayList<Person>> data;
	
	private Data() {
		data = new LinkedHashMap<>();
	}
	
	public static Data getInstance() {
		if(dataClass == null)
			dataClass = new Data();
		
		return dataClass;
	}
	
	public void addNewGroup(String groupName) {
		data.put(groupName, new ArrayList<>());
	}
	
	public void readAll() {
		var iterator = data.entrySet().iterator();
		
		System.out.println("Lista Grup: ");
		
		while(iterator.hasNext()) {
			Map.Entry<String, ArrayList<Person>> entry = iterator.next();
			System.out.println(entry.getKey());
			
			for(Person p : entry.getValue())
				System.out.println(" - " + p);
		}
	}
	
	public void addPersonToSpecificGroup(String groupName, Person person) {
		ArrayList<Person> list = data.get(groupName);
		list.add(person);
	}
	
	public String[] getKeys() {
		String[] keys = new String[data.size()];
		
		var iterator = data.entrySet().iterator();
		
		for(int i=0; i<data.size(); i++)
			keys[i] = iterator.next().getKey();
		
		return keys;
	}
	
	public void readGroupMembers(String groupKey) {
		for(Person p : data.get(groupKey))
			System.out.println(" -" + p);
	}
	
	public void removeGroupMember(String groupKey, String personName) {
		data.get(groupKey).removeIf(person -> person.getName().equalsIgnoreCase(personName));
	}
}
