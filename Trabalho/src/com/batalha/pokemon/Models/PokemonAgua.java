package com.batalha.pokemon.Models;

import com.batalha.pokemon.Enums.Efeito;
import com.batalha.pokemon.Enums.TipoPokemon;

public class PokemonAgua extends Pokemon {
	
	public PokemonAgua(String nome, Efeito especial) {
		super(nome, TipoPokemon.AGUA, TipoPokemon.FOGO, 1000, 100, especial);
	}
	
}
