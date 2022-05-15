package br.com.unesp.Exercicio06;

public class TestaGeometria {
	public static void main(String[] args) {
		Quadrado q1 = new Quadrado(5);
		Quadrado q2 = new Quadrado(6.6);
		Retangulo r1 = new Retangulo(3, 4);
		Retangulo r2 = new Retangulo(5, 2);
		Triangulo t1 = new Triangulo(3, 4, 5);
		Triangulo t2 = new Triangulo(12, 5, 13);
		Circulo c1 = new Circulo(5);
		Circulo c2 = new Circulo(2);
		
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(c1);
		System.out.println(c2);
	}
}
