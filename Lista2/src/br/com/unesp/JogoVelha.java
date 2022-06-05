package br.com.unesp;

import java.util.Scanner;

public class JogoVelha {
	
	public static void main(String[] args) {
		
		char[][] jogo = initialize();
		Scanner scan = new Scanner(System.in);
		
		print(jogo);
		
		String winner = "";
		for(int k=0; winner.equals(""); k++) {
			String line = scan.nextLine();
			int i = Integer.parseInt(line.substring(0, 1));
			int j = Integer.parseInt(line.substring(2, 3));
			
			if(i < 0 || i > 2 || j < 0 || j > 2 || jogo[i][j] != '_') {
				k--;
				continue;
			}
			
			if(k%2 == 0)
				jogo[i][j] = 'X';
			else
				jogo[i][j] = 'O';
			
			print(jogo);
			
			winner = result(jogo);
		}
		
		scan.close();
		
		System.out.println(winner);		
	}
	
	public static String result(char[][] jogo) {
		
		if(jogo[0][0] == jogo[0][1] && jogo[0][0] == jogo[0][2] && jogo[0][0] != '_' ||
		   jogo[0][0] == jogo[1][0] && jogo[0][0] == jogo[2][0] && jogo[0][0] != '_')
			if(jogo[0][0] == 'X')
				return "Jogador 1";
			else
				return "Jogador 2";
			
		if(jogo[1][1] == jogo[1][0] && jogo[1][1] == jogo[1][2] && jogo[1][1] != '_' ||
		   jogo[1][1] == jogo[0][1] && jogo[1][1] == jogo[2][1] && jogo[1][1] != '_')
			if(jogo[1][1] == 'X')
				return "Jogador 1";
			else
				return "Jogador 2";
		
		if(jogo[2][2] == jogo[2][0] && jogo[2][2] == jogo[2][1] && jogo[2][2] != '_' ||
		   jogo[2][2] == jogo[0][2] && jogo[2][2] == jogo[1][2] && jogo[2][2] != '_')
			if(jogo[2][2] == 'X')
				return "Jogador 1";
			else
				return "Jogador 2";
		
		if(jogo[0][0] == jogo[1][1] && jogo[0][0] == jogo[2][2] && jogo[0][0] != '_' ||
		   jogo[0][2] == jogo[1][1] && jogo[0][2] == jogo[2][0] && jogo[0][2] != '_')
			if(jogo[1][1] == 'X')
				return "Jogador 1";
			else
				return "Jogador 2";
		
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++)
				if(jogo[i][j] == '_')
					return "";
		
		return "Empate";
	}
	
	public static void print(char[][] jogo) {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++)
				System.out.print(jogo[i][j] + " ");
			
			System.out.println();
		}
	}
	
	public static char[][] initialize() {
		
		char[][] jogo = new char[3][3];
		
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++)
				jogo[i][j] = '_';
		
		return jogo;
	}

}
