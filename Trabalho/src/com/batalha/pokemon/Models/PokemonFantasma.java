package com.batalha.pokemon.Models;

import com.batalha.pokemon.Enums.Efeito;
import com.batalha.pokemon.Enums.TipoPokemon;

public class PokemonFantasma extends Pokemon {
	public PokemonFantasma(String nome, Efeito especial) {
		super(nome, TipoPokemon.FANTASMA, TipoPokemon.ELETRICO, 1500, 80, especial);
	}
}
