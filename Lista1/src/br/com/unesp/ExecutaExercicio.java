package br.com.unesp;

import java.util.Scanner;

public class ExecutaExercicio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		IExercicio ex = new Exercicio08();
		
		ex.executa(scanner);
	}
}
