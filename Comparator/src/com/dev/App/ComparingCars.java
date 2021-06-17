package com.dev.App;

import java.util.Scanner;

public class ComparingCars {

	private static Car bestCar = null;
	private static CarComparator comparator = new CarComparator();

	public static void provideCar() {
		Scanner skaner = new Scanner(System.in);
		int index = 0;
		int lever = 0;

		while (true) {
			index++;
			lever = (lever == 0) ? 1 : 0;

			System.out.println("------------- CAR " + index + " ------------");
			System.out.print("Set price: ");
			int price = skaner.nextInt();

			System.out.print("Set consumption: ");
			int consumption = skaner.nextInt();

			System.out.print("Set capacity: ");
			double capacity = skaner.nextDouble();

			Car car = new Car(price, consumption, capacity);

			if (bestCar == null) {
				bestCar = car;
				continue;
			}

			switch (lever) {
			case 0 -> {
				if (bestCar.compareTo(car) < 0) {
					bestCar = car;
					System.out.println("Found new best car");
				}
			}
			case 1 -> {
				if (comparator.compare(bestCar, car) < 0) {
					bestCar = car;
					System.out.println("Found new best car");
				}
			}
			}

			System.out.println("-------------------------------");
		}
	}

}
