package com.dev.App;

import java.util.HashSet;

import com.dev.enums.ReturnStates;

public class PointChecker {
	
	private static HashSet<Point> points = new HashSet<>();
	
	public static ReturnStates addNewPoint(Point point) {
		int pointsLength = points.size();
		points.add(point);
		
		if(points.size() != pointsLength)
			return ReturnStates.Success;
		else
			return ReturnStates.PointAlreadyUsed;
	}
	
	public static int numberOfPoints() {
		return points.size();
	}
	
}
