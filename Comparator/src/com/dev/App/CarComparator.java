package com.dev.App;

import java.util.Comparator;

public class CarComparator implements Comparator<Car>{

	@Override
	public int compare(Car c1, Car c2) {
		int pointsOfCar1 = 0;
		int pointsOfCar2 = 0;
		
		if(c1.getPrice() < c2.getPrice())
			pointsOfCar1 ++;
		else
			pointsOfCar2 ++;
		
		if(c1.getConsumption() < c2.getConsumption())
			pointsOfCar1 ++;
		else
			pointsOfCar2 ++;
		
		if(c1.getCapacity() > c2.getCapacity())
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
