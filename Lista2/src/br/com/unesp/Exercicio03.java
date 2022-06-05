package br.com.unesp;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		String str = readStr();
		
		System.out.println(isPalindrome(str));
		
	}
	
	public static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		
		
		boolean isPalin = true;
		for(; i<j; i++, j--) {
			if(str.charAt(i) != str.charAt(j)) {
				isPalin = false;
				break;
			}
		}
		
		return isPalin;
	}
	
	public static String readStr() {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		scan.close();
		
		return str;
	}
}
