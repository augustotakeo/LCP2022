package br.com.unesp.Exercicio06;

public class Triangulo implements Geometria {
	
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo(double lado1, double lado2, double lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	public double definirArea() {
		double p = (getLado1() + getLado2() + getLado3())/2;
		return Math.sqrt(p*(p-getLado1())*(p-getLado2())*(p-getLado3()));
	}

	@Override
	public double definirPerimetro() {
		return getLado1() + getLado2() + getLado3();
	}
	
	@Override
	public String toString() {
		return "Triangulo, Area: " + definirArea() + ", Perimetro: " + definirPerimetro();
	}
	
	public double getLado1() {
		return lado1;
	}
	
	public double getLado2() {
		return lado2;
	}
	
	public double getLado3() {
		return lado3;
	}
}
