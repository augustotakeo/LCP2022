package br.com.unesp;

import java.util.Scanner;

public class Exercicio07 implements IExercicio {

	@Override
	public void executa(Scanner scanner) {
		
		int n = scanner.nextInt();
		
		if(n < 1 || n > 4) {
			System.out.println("Número deve estar entre 1 e 4");
			return;
		}
		
		double[] x = {0, 0, 0, 0};
		
		for(int i=0; i<n; i++)
			x[i] = scanner.nextDouble();
		
		double soma = 0;
		for(int i=1; i<=n; i++)
			soma += Math.pow(x[i-1], i);
		
		System.out.println(soma);
	}
	
}
