package com.batalha.pokemon.Models;

import com.batalha.pokemon.Enums.Efeito;
import com.batalha.pokemon.Enums.TipoPokemon;

public class PokemonEletrico extends Pokemon {
	
	public PokemonEletrico(String nome, Efeito especial) {
		super(nome, TipoPokemon.ELETRICO, TipoPokemon.AGUA, 800, 300, especial);
	}
	
}
