package com.dev.App;

public enum Priorities {
	Priority(1),
	Registered(2),
	Regular(3);

	private int priority;
	Priorities(int priority) {
		this.priority = priority;
	}
	
	public int getPriority() {
		return priority;
	}
}
