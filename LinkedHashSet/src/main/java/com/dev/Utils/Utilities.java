package com.dev.Utils;

import java.util.Random;

public class Utilities {
	
	public static int getRandomInt(int min, int max) {
		Random rand = new Random();
		return rand.nextInt(max - min) + min;
	}
	
}
