package com.batalha.pokemon.Models;

import com.batalha.pokemon.Enums.Efeito;
import com.batalha.pokemon.Enums.TipoPokemon;
import com.batalha.pokemon.Exceptions.AtaqueNegativoException;
import com.batalha.pokemon.Exceptions.VidaNegativaException;

public abstract class Pokemon {
	
	private String Nome;
	
	private TipoPokemon Tipo;
	
	private double Vida;
	
	private double Ataque;
	
	private double MultiplicadorAtaque = 1;
	
	private Efeito Especial;
	
	private boolean EspecialAnulado = false;
	
	private TipoPokemon Forte;
	
	public Pokemon(String nome, TipoPokemon tipo, TipoPokemon forte, double vida, double ataque, Efeito especial) {
		this.Nome = nome;
		this.Tipo = tipo;
		this.Forte = forte;
		this.Vida = vida;
		this.Ataque = ataque;
		this.Especial = especial;
	}
	
	public void RecebeAtaque(Pokemon pokemon) throws NullPointerException {
		
		if(pokemon == null)
			throw new NullPointerException();
		
		double ataque;
				
		try {
			ataque = pokemon.getAtaque();
		}catch (AtaqueNegativoException e) {
			System.out.println("Ataque negativo");
			return;
		}
		
		if(this.getTipo() == pokemon.getForte())
			ataque *= 1.3;
		
		if(this.getForte() == pokemon.getTipo())
			ataque *= 0.7;
		
		try {
			double vida = getVida() - ataque;
			if(vida < 0)
				vida = 0;
			this.setVida(vida);
		}catch (Exception e) {
			System.out.println("Vida negativa");
		}
	}
	
	public void RecebeEspecial(Pokemon pokemon) throws NullPointerException {
		
		if(pokemon == null)
			throw new NullPointerException();
		
		if(pokemon.getTipo() == this.getForte() || pokemon.getEspecial() == Efeito.ANULADO)
			return;
		
		if(pokemon.getEspecial() == Efeito.ESPECIAL) {
			this.EspecialAnulado = true;
			pokemon.AnulaEspecial();
		}else if(pokemon.getEspecial() == Efeito.ATAQUE) {
			this.MultiplicadorAtaque = 0.7;
		}else if(pokemon.getEspecial() == Efeito.VIDA) {
			double vidaRoubada = 0.15*this.getVida();
			
			
			try {
				double vida = this.getVida() - vidaRoubada;
				
				if(vida < 0)
					vida = 0;
				
				this.setVida(vida);
				
				vida = pokemon.getVida() + vidaRoubada;
				
				if(vida < 0)
				
				pokemon.setVida(vida);
			}catch(VidaNegativaException ex) {
				System.out.println("Vida negativa");
			}
			
			
		}
	}
	
	public void AnulaEspecial() {
		this.MultiplicadorAtaque = 1;
	}
	
	public String getNome() {
		return this.Nome;
	}
	
	public TipoPokemon getTipo() {
		return this.Tipo;
	}
	
	public double getVida() {
		return this.Vida;
	}
	
	public void setVida(double vida) throws VidaNegativaException {
		if(vida < 0)
			throw new VidaNegativaException();
		
		this.Vida = vida;
	}
	
	public double getAtaque() throws AtaqueNegativoException {
		
		if(this.MultiplicadorAtaque < 0)
			throw new AtaqueNegativoException();
		
		return this.MultiplicadorAtaque * this.Ataque;
	}
	
	public Efeito getEspecial() {
		
		if(this.EspecialAnulado)
			return Especial.ANULADO;
		
		return this.Especial;
	}
	
	public TipoPokemon getForte() {
		return this.Forte;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.Nome + "     Vida: " + this.Vida;
	}
}





