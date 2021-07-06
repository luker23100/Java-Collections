package com.dev.App;

public class App {
	
	private Data data;
	
	public App() {
		data = Data.getInstance();
		start();
	}
	
	private void start() {
		Menus.mainMenu();
		controller(Utils.optionChooser(1, 4));
	}
	
	private void controller(int option) {
		switch(option) {
		case 1 -> data.addNewGroup(Utils.scan.nextLine());
		case 2 -> data.readAll();
		case 3 -> openSpecificGroup();
		case 4 -> System.exit(0);
		}
		
		start();
	}
	
	private void openSpecificGroup() {
		String groupKey = Menus.groupMenu();
		data.readGroupMembers(groupKey);
		Menus.membersMenu();
		groupController(Utils.optionChooser(1, 3), groupKey);
	}
	
	private void groupController(int option, String groupKey) {
		switch(option) {
		case 1 -> {
			System.out.print("Wprowadz imie: ");
			data.addPersonToSpecificGroup(groupKey, new Person(Utils.scan.nextLine()));
		}
		case 2 -> {
			System.out.print("Wprowadz imie osoby do usuniêcia: ");
			data.removeGroupMember(groupKey, Utils.scan.nextLine());
		}
		}
		
		if(option == 3)
			start();
		else {
			data.readGroupMembers(groupKey);
			groupController(Utils.optionChooser(1, 3), groupKey);
		}
			
	}
}
