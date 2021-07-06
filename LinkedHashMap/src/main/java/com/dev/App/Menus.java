package com.dev.App;

public class Menus {
	private static Data data = Data.getInstance();
	
	public static void mainMenu() {
		System.out.println("===========================");
		String[] menu = {"[1] - Dodaj grupe",
				"[2] - Wyœwietl wszystkich",
				"[3] - Otwórz grupe",
				"[4] - Wyjœcie"};
		
		for(String s : menu)
			System.out.println(s);
		System.out.println("===========================");
	}
	
	public static String groupMenu() {
		String[] keys = data.getKeys();
		
		for(int i=1; i<=keys.length; i++)
			System.out.println("[" + i + "]" + " " + keys[i-1]);
		
		int option = Utils.optionChooser(1, keys.length);
		return keys[option-1];
	}
	
	public static void membersMenu() {
		String[] menu = {"[1] Add new member",
				"[2] Remove member", 
				"[3] Return"};
		
		for(String s : menu)
			System.out.println(s);
	}
}
