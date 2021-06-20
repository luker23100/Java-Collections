package com.dev.App;

import java.util.Random;
import java.util.TreeSet;

public class Main {

	private static TreeSet<Car> cars = new TreeSet<>();
	
	public static void main(String[] args) {
		
		for(int i=0; i<100; i++) {
			int price = getRandomNumber(50000, 500000);
			int consumption = getRandomNumber(5, 25);
			int capacity = getRandomNumber(1, 8);
			
			
			cars.add(new Car(i, price, consumption, capacity));
		}
		
		cars.forEach(car -> System.out.println(car));
	}
	
	private static int getRandomNumber(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(max - min) + min;
	}

}
