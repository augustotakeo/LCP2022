package br.com.unesp.Exercicio05;

public class LivroGratuito extends Livro {

	public LivroGratuito(String titulo) {
		setTitulo(titulo);
	}
	
	@Override
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public String toString() {
		return "Livro Gratuito, Titulo: " + this.titulo;
	}
}
