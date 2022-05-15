package br.com.unesp.Exercicio04;

public class Cachorro extends Animal {
	String som;
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		this.som = "Au au";
	}

	@Override
	public String getSom() {
		return this.som;
	}
}
