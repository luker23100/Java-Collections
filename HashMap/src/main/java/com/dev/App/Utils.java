package com.dev.App;

import java.util.Scanner;

public class Utils {
	public static int optionChooser(int from, int to) {
		Scanner scan = new Scanner(System.in);
		
		int choosenOption = -1;
		while(choosenOption < from || choosenOption > to) {
			try {
				System.out.print("Choose an option: ");
				choosenOption = scan.nextInt();
			} catch(Exception e) {}
			finally {
				scan.nextLine();
			}
		}
		
		//scan.close();
		return choosenOption;
	}
}
