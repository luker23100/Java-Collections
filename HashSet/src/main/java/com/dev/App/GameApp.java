package com.dev.App;

import java.util.Scanner;

import com.dev.enums.ReturnStates;

public class GameApp {
	
	public GameApp() {
		runTheGame();
	}
	
	private void runTheGame() {
		Scanner skan = new Scanner(System.in);
		boolean gameEnd = false;
		
		while(!gameEnd) {
			try {
				System.out.println("Add new Point: ");
				System.out.print("X: ");
				int x = skan.nextInt();
				System.out.print("Y: ");
				int y = skan.nextInt();
				
				Point point = new Point(x, y);
				
				if(PointChecker.addNewPoint(point).equals(ReturnStates.PointAlreadyUsed))
					System.out.println(ReturnStates.PointAlreadyUsed);
				else
					System.out.println("Added new point");
				
				System.out.println("Points added: " + PointChecker.numberOfPoints());
				System.out.println();
			} catch(Exception e) {
				System.out.println("Must be an Integer");
			} finally {
				skan.nextLine();
			}
		}
		
		skan.close();
	}
	
}
