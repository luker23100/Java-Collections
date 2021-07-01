package com.dev.App;

import java.util.PriorityQueue;
import java.util.Queue;

public class Simulation {
	private Queue<Package> sortedPackages;
	
	public Simulation() {
		//sortedPackages = new PriorityQueue<>(new PackageComparator());
		sortedPackages = new PriorityQueue<>((p1, p2) -> p1.getPriority() - p2.getPriority());
		randomizePackages();
		viewAll();
	}
	
	private void randomizePackages() {
		for(int i=0; i<300; i++) {
			sortedPackages.offer(new Package(i + "[P]", Utils.getRandomInt(0, 3)));
		}
	}
	
	private void viewAll() {
		while(sortedPackages.size() > 0) {
			System.out.println(sortedPackages.poll());
		}
	}
}
