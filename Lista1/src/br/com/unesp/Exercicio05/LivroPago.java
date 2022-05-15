package br.com.unesp.Exercicio05;

public class LivroPago extends Livro{

	private double valor;
	
	public LivroPago(String titulo, double valor) {
		setTitulo(titulo);
		setValor(valor);
	}
	
	@Override
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Livro Pago, Titulo: " + this.titulo + ", Valor: " + this.valor + "\n";
	}
}
