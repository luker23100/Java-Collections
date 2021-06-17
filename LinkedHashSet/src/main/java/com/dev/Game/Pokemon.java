package com.dev.Game;

public enum Pokemon {
	A(10),
	B(10),
	C(10),
	D(5),
	E(5),
	F(5),
	G(1),
	H(1),
	I(1),
	J(1),
	K(1),
	L(1),
	M(1),
	N(1);
	
	private int points;
	Pokemon(int points){
		this.points = points;
	}
	
	public int getPoints() {
		return points;
	}
}
