package com.dev.App;

public class Car implements Comparable<Car>{
	private int price;
	private int consumption;
	private double capacity;

	public Car(int price, int consumption, double capacity) {
		this.price = price;
		this.consumption = consumption;
		this.capacity = capacity;
	}

	public int getPrice() {
		return price;
	}

	public int getConsumption() {
		return consumption;
	}

	public double getCapacity() {
		return capacity;
	}

	@Override
	public int compareTo(Car c) {
		int pointsOfCar1 = 0;
		int pointsOfCar2 = 0;
		
		if(this.getPrice() < c.getPrice())
			pointsOfCar1 ++;
		else
			pointsOfCar2 ++;
		
		if(this.getConsumption() < c.getConsumption())
			pointsOfCar1 ++;
		else
			pointsOfCar2 ++;
		
		if(this.getCapacity() > c.getCapacity())
			pointsOfCar1 ++;
		else
			pointsOfCar2 ++;
		
		if(pointsOfCar1 < pointsOfCar2)
			return -1;
		else if(pointsOfCar1 == pointsOfCar2)
			return 0;
		else
			return 1;
	}

}
