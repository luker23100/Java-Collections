package com.dev.App;

public class Cup {
	private int id;
	private String label;
	
	public Cup(int id, String label) {
		this.id = id;
		this.label = label;
	}
	
	@Override
	public String toString() {
		return "ID: " + id + " Text: " + label;
	}
}
