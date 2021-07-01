package com.dev.App;

public final class Package {
	private String packageIdentity;
	private int priority;

	public Package(String packageIdentity, int priority) {
		this.packageIdentity = packageIdentity;
		this.priority = priority;
	}

	public String getPackageIdentity() {
		return packageIdentity;
	}

	public int getPriority() {
		return priority;
	}

	@Override
	public String toString() {
		return "Package: " + packageIdentity + ", " + "Priority: " + Priorities.values()[priority];
	}

}
