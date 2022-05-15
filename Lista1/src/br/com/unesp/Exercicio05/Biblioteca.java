package br.com.unesp.Exercicio05;

public class Biblioteca {
	public static void main(String[] args) {
		LivroGratuito l1 = new LivroGratuito("Quadra");
		LivroPago l2 = new LivroPago("Quadra", 10);
		
		System.out.println(l1);
		System.out.println(l2);
	}
}
