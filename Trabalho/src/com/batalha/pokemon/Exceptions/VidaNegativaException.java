package com.batalha.pokemon.Exceptions;

public class VidaNegativaException extends Exception {
	public VidaNegativaException() {
		super("Vida n�o pode ser negativa");
	}
}
