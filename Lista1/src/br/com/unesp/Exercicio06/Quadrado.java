package br.com.unesp.Exercicio06;

public class Quadrado implements Geometria {

	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double definirArea() {
		return getLado()*getLado();
	}

	@Override
	public double definirPerimetro() {
		return 4*getLado();
	}
	
	@Override
	public String toString() {
		return "Quadrado, Area: " + definirArea() + ", Perimetro: " + definirPerimetro();
	}
	
	public double getLado() {
		return lado;
	}
}
