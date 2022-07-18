package com.batalha.pokemon.Models;

import com.batalha.pokemon.Enums.Efeito;
import com.batalha.pokemon.Enums.TipoPokemon;

public class PokemonFolha extends Pokemon {
	public PokemonFolha(String nome, Efeito especial) {
		super(nome, TipoPokemon.FOLHA, TipoPokemon.TERRA, 1100, 120, especial);
	}
}
