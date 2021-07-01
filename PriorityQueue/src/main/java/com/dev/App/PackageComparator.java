package com.dev.App;

import java.util.Comparator;

public class PackageComparator implements Comparator<Package> {

	@Override
	public int compare(Package o1, Package o2) {
		if(o1.getPriority() > o2.getPriority())
			return -1;
		else if(o1.getPriority() == o2.getPriority())
			return 0;
		else
			return 1;
	}

}
