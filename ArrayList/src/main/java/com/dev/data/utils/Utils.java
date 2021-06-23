package com.dev.data.utils;

import java.util.Random;

public class Utils {
	public static int getRandomNumber(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(max - min) + min;
	}
	
	public static int getRandomPhoneNumber() {
		String phoneNumber = "";
		
		for(int i=0; i<9; i++)
			phoneNumber += String.valueOf(getRandomNumber(0, 9));
		return Integer.parseInt(phoneNumber);
	}
}
