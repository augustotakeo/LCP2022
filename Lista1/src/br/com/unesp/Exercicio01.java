package br.com.unesp;

import java.util.Scanner;

public class Exercicio01 implements IExercicio {
	public void executa(Scanner scanner) {
		int n = scanner.nextInt();
		
		scanner.close();
		
		if(n < 1 || n > 20) {
			System.out.println("Número inválido, precisa estar entre 1 e 20");
			return;
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=0; j<i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
