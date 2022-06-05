package br.com.unesp;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		
		scan.close();
		
		System.out.println(mergeStr(str1, str2));
		
	}
	
	public static String mergeStr(String str1, String str2) {
		
		String str = "";
		
		int i;
		for(i=0; i<str1.length(); i++) {
			str += str1.charAt(i);
			
			if(i < str2.length())
				str += str2.charAt(i);
		}
		
		if(i < str2.length())
			str += str2.substring(i);
		
		return str;
	}
}












