package com.dev.App;

public class Client extends Person{
	private Package pack;
	
	public Client(String name) {
		super(name);
	}

	public void sendPackage(Package packageToSend) {
		pack = packageToSend;
	}
	
	public Package getPackage() {
		return pack;
	}
	
}
