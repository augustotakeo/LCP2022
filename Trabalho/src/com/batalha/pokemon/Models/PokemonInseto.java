package com.batalha.pokemon.Models;

import com.batalha.pokemon.Enums.Efeito;
import com.batalha.pokemon.Enums.TipoPokemon;

public class PokemonInseto extends Pokemon {
	public PokemonInseto(String nome, Efeito especial) {
		super(nome, TipoPokemon.INSETO, TipoPokemon.FANTASMA, 2000, 60, especial);
	}
}
