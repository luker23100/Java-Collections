package com.dev.App;

public class Car implements Comparable<Car>{
	private int price;
	private int consumption;
	private double capacity;
	private int index;
	
	public Car(int index, int price, int consumption, double capacity) {
		this.index = index;
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
	public int compareTo(Car o) {
		int pointsOfThisCar = 0;
		int pointsOfComparedCar = 0;
		
		if(this.getPrice() < o.getPrice())
			pointsOfThisCar++;
		else
			pointsOfComparedCar++;
		
		if(this.getConsumption() < o.getConsumption())
			pointsOfThisCar++;
		else
			pointsOfComparedCar++;
		
		if(this.getCapacity() > o.getCapacity())
			pointsOfThisCar++;
		else
			pointsOfComparedCar++;
		
		if(pointsOfThisCar > pointsOfComparedCar)
			return 1;
		else if(pointsOfThisCar == pointsOfComparedCar)
			return 0;
		else
			return -1;
	}
	
	@Override
	public String toString() {
		return "Car: " + String.valueOf(index);
	}
}
