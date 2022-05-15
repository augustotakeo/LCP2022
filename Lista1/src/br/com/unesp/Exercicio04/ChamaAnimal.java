package br.com.unesp.Exercicio04;

public class ChamaAnimal {
	public static void main(String[] args) {
		Animal bixo = new Cachorro("Aquiles", 5);
		System.out.println(bixo.getSom());
		bixo = new Gato("Hagya", 5);
		System.out.println(bixo.getSom());
		bixo = new Passaro("Fenix", 5);
		System.out.println(bixo.getSom());
	}
}
