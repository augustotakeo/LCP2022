package br.com.unesp;

import java.util.Scanner;

public class Verifica {
	
	public static void main(String[] args) {
		
		String str = readStr();
		
		if(str.matches("[0-9]{2}.[0-9]{3}.[0-9]{3}-[0-9X]"))
			System.out.println("RG V�lido");
		else
			System.out.println("RG N�o V�lido");
		
	}
	
	public static String readStr() {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		scan.close();
		
		return str;
	}
	
}
