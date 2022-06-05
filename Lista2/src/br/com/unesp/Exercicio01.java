package br.com.unesp;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		String[] uglyNameBroken = readName().split(" ");
		
		String beautifulName = "";
		
		for(String name : uglyNameBroken) {
			beautifulName += capitalizedName(name) + " ";
		}
		
		System.out.println(beautifulName);
	}
	
	public static String readName() {
		Scanner scan = new Scanner(System.in);
		
		String uglyName = scan.nextLine();
		
		scan.close();
		
		return uglyName;
	}
	
	public static String capitalizedName(String name) {
		
		String lowerName = name.toLowerCase();
		
		if(lowerName.equals("de") || lowerName.equals("do") || lowerName.equals("da"))
			return lowerName;
		
		String lowerPart = lowerName.substring(1);
		String upperPart = name.substring(0, 1).toUpperCase();
		return upperPart + lowerPart;
		
	}
	
}
