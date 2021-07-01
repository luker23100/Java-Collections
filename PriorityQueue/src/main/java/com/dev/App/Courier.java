package com.dev.App;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Courier extends Person{
	private List<Package> packages;
	private final int capacity = 20;
	
	public Courier(String name) {
		super(name);
		packages = new ArrayList<>();
	}
	
	public void receivePackages(PriorityQueue<Package> packagesToReceive) {
		while(packages.size() < capacity || packagesToReceive.peek() != null) {
			packages.add(packagesToReceive.poll());
		}
	}
}
