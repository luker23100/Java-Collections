package com.dev.Game;

import java.util.LinkedHashSet;

public class Person {
	private int id;
	private LinkedHashSet<Pokemon> pickedPokemons = new LinkedHashSet<>();
	
	public Person(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void addPickedPokemon(Pokemon pokemon) {
		pickedPokemons.add(pokemon);
	}
	
	public LinkedHashSet<Pokemon> getPickedPokemons() {
		return pickedPokemons;
	}
}
