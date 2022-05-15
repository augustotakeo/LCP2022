package br.com.unesp.Exercicio04;

public class Gato extends Animal {
	String som;
	
	public Gato(String nome, int idade) {
		super(nome, idade);
		this.som = "Miau";
	}

	@Override
	public String getSom() {
		return this.som;
	}
}
