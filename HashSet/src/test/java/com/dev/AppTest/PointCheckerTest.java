package com.dev.AppTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.dev.App.Point;
import com.dev.App.PointChecker;
import com.dev.enums.ReturnStates;

public class PointCheckerTest {
	
	@Test
	void testIfDetectsTheSamePoints() {
		//given
		Point examplePoint = new Point(5, 5);
		
		//when
		PointChecker.addNewPoint(examplePoint);
		
		//then
		assertEquals(ReturnStates.PointAlreadyUsed, PointChecker.addNewPoint(examplePoint));
	}
	
}
