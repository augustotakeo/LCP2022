package br.com.unesp.Exercicio06;

public class Retangulo implements Geometria {
	
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double definirArea() {
		return getBase()*getAltura();
	}

	@Override
	public double definirPerimetro() {
		return 2*(getBase() + getAltura());
	}
	
	@Override
	public String toString() {
		return "Retangulo, Area: " + definirArea() + ", Perimetro: " + definirPerimetro();
	}
	
	public double getBase() {
		return base;
	}
	
	public double getAltura() {
		return altura;
	}
}
