package br.com.unesp.Exercicio04;

public class Passaro extends Animal {
	String som;
	
	public Passaro(String nome, int idade) {
		super(nome, idade);
		this.som = "Piu";
	}

	@Override
	public String getSom() {
		return this.som;
	}
}
