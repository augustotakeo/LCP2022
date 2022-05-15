package br.com.unesp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio08 implements IExercicio {

	@Override
	public void executa(Scanner scanner) {
		
		int n = scanner.nextInt();
		
		if(n < 0) {
			System.out.println("Número deve ser positivo");
			return;
		}
		
		List<Integer> digitos = new ArrayList<Integer>();
		
		int n1 = n;
		while(n1 != 0) {
			digitos.add(n1%10);
			n1 = n1/10;
		}
		
		int numDigitos = digitos.size();
		
		int soma = 0;
		for(int digito : digitos)
			soma += Math.pow(digito, numDigitos);
		
		System.out.println(soma == n);
	}
	
}
