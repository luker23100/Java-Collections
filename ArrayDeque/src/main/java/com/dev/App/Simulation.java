package com.dev.App;

import java.util.ArrayDeque;
import java.util.Queue;

public class Simulation {
	private Queue<Cup> orders;
	
	public Simulation() {
		orders = new ArrayDeque();
		addExampleOrders();
		receiveOrders();
	}
	
	private void addExampleOrders() {
		for(int i=1; i<=30; i++) {
			orders.offer(new Cup(i, "TestExample " + i));
		}
	}
	
	private void receiveOrders() {
		while(orders.size() > 0) {
			System.out.println(orders.poll());
		}
	}
}
