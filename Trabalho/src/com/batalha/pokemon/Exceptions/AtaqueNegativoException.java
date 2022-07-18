package com.batalha.pokemon.Exceptions;

public class AtaqueNegativoException extends Exception {
	public AtaqueNegativoException() {
		super("Ataque não pode ser negativo");
	}
}
