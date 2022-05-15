package br.com.unesp.Exercicio06;

public class Circulo implements Geometria {

	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double definirArea() {
		return Math.PI*getRaio()*getRaio();
	}

	@Override
	public double definirPerimetro() {
		return 2*Math.PI*getRaio();
	}
	
	public double getRaio() {
		return raio;
	}
	
	@Override
	public String toString() {
		return "Circulo, Area: " + definirArea() + ", Perimetro: " + definirPerimetro();
	}
}