package com.batalha.pokemon.Models;

import com.batalha.pokemon.Enums.Efeito;
import com.batalha.pokemon.Enums.TipoPokemon;

public class PokemonFogo extends Pokemon {
	
	public PokemonFogo(String nome, Efeito especial) {
		super(nome, TipoPokemon.FOGO, TipoPokemon.FOLHA, 1200, 90, especial);
	}
	
}
