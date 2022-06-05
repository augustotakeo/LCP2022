package br.com.unesp;

import java.util.Scanner;

public class Telefone {
	public static void main(String[] args) {
		
		String str = readStr();
		
		if(str.length() == 15)
			str = str.substring(1, 3) + str.substring(4, 10) + str.substring(11);
		else
			str = str.substring(1, 3) + str.substring(4, 9) + str.substring(10);
		
		String[] strs = str.split(" ");
		
		if(strs[1].length() == 9)
			System.out.println("Telefone Celular");
		else
			System.out.println("Telefone Residencial");
		
		System.out.println("O DDD é " + strs[0] + " e o Telefone é " + strs[1]);
	}
	
	public static String readStr() {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		scan.close();
		
		return str;
	}
}
