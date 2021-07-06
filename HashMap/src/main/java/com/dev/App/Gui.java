package com.dev.App;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gui {
	private Map<String, String> environmentVariables;
	private Scanner scan = new Scanner(System.in);
	
	public Gui() {
		environmentVariables = new HashMap<>();
		showGui();
		
	}
	
	private void showGui() {
		String[] options = {"[1] Add new variable",
				"[2] Get variable by name", "[3] Exit"};
		
		for(String s : options) {
			System.out.println(s);
		}
		
		optionHandler(Utils.optionChooser(1, 3));
	}
	
	private void optionHandler(int option) {
		switch(option) {
		case 1 -> addNewVariable();
		case 2 -> getVariablePath();
		case 3 -> System.exit(0);
		default -> System.out.println("Error");
		}
		
		showGui();
	}
	
	private void addNewVariable() {
		System.out.print("Enter name: ");
		String varName = scan.nextLine();
		System.out.print("Enter path: ");
		String path = scan.nextLine();
		
		environmentVariables.put(varName, path);
	}
	
	private void getVariablePath() {
		System.out.print("Enter name: ");
		String varName = scan.nextLine();
		
		String result = environmentVariables.get(varName);
		
		if(result == null)
			System.out.println("No variable path at name: \"" + varName + "\" found");
		else
			System.out.println(result);
	}
}
