package br.com.unesp;

import java.util.Scanner;

public class Exercicio02 implements IExercicio {
	public void executa(Scanner scanner) {
		double n1 = scanner.nextDouble();
		double n2 = scanner.nextDouble();
		double n3 = scanner.nextDouble();
		
		scanner.close();
		
		double soma = n1 + n2 + n3;
		
		double produto = n1 * n2 * n3;
		
		double media = soma/3;
		
		double temp;
		if(n1 > n2) {
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		if(n1 > n3) {
			temp = n1;
			n1 = n3;
			n3 = temp;
		}
		
		if(n2 > n3) {
			temp = n2;
			n2 = n3;
			n3 = temp;
		}
		
		System.out.printf("A soma dos números é: %.2f\n", soma);
		System.out.printf("O produto dos números é: %.2f\n", produto);
		System.out.printf("A média dos números é: %.2f\n", media);
		System.out.printf("Os números ordenados são: %.2f %.2f %.2f\n", n1, n2, n3);
	}
}

















