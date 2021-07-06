package com.dev.App;

import java.util.Scanner;

public class Utils {
	static Scanner scan = new Scanner(System.in);
	
	public static int optionChooser(int from, int to) {
		int option = -1;
		
		while(option < from || option > to) {
			try {
				System.out.print("Wybierz opcje: ");
				option = scan.nextInt();
			}catch(Exception e) {}
			finally {
				scan.nextLine();
			}
		}
		
		return option;
	}
}
