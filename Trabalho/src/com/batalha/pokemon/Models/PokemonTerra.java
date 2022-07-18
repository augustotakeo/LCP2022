package com.batalha.pokemon.Models;

import com.batalha.pokemon.Enums.Efeito;
import com.batalha.pokemon.Enums.TipoPokemon;

public class PokemonTerra extends Pokemon {
	public PokemonTerra(String nome, Efeito especial) {
		super(nome, TipoPokemon.TERRA, TipoPokemon.INSETO, 700, 200, especial);
	}
}
