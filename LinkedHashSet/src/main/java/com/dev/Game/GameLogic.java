package com.dev.Game;

import java.util.ArrayList;
import java.util.LinkedHashSet;

import com.dev.Utils.Utilities;

public class GameLogic {
	
	private ArrayList<Person> players = new ArrayList<>();
	private LinkedHashSet<Pokemon> allGatheredPokemons = new LinkedHashSet<>();
	private int numberOfGatheredPokemons = 0;
	private StringBuilder gameLog = new StringBuilder();
	
	public GameLogic() {
		setPlayers();
		startGame();
		endGame();
	}
	
	private void setPlayers() {
		for(int i=1; i<=5; i++) {
			players.add(new Person(i));
		}
	}
	
	private void refresh() {
		numberOfGatheredPokemons = allGatheredPokemons.size();
	}
	
	private void drawPokemon(Person player) {
		int choosenPokemonIndex = Utilities.getRandomInt(0, Pokemon.values().length-1);
		Pokemon choosenPokemon = Pokemon.values()[choosenPokemonIndex];
		
		String log = "Player " + player.getId() + " have found pokemon " + choosenPokemon;
		log  += " for " + choosenPokemon.getPoints() + " points";
		
		allGatheredPokemons.add(choosenPokemon);
		
		if(allGatheredPokemons.size() == numberOfGatheredPokemons) {
			log += ", unfortunately this pokemon has already been gathered";
		} else {
			player.addPickedPokemon(choosenPokemon);
		}
		
		log += "\n";
		gameLog.append(log);
		refresh();
	}
	
	private void startGame() {
		while(numberOfGatheredPokemons < 10) {
			gameLog.append("----------------------------" + "\n");
			for(Person player : players) {
				drawPokemon(player);
			}
			gameLog.append("----------------------------" + "\n");
		}
	}
	
	private void endGame() {
		System.out.println(gameLog + "\n");
		
		int points = 0;
		for(Pokemon pokemon : allGatheredPokemons)
			points += pokemon.getPoints();
		
		System.out.println("Game has ended with total points: " + points);
	}
	
}
