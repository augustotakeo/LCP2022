package br.com.unesp.Exercicio07;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List<Aluno> alunos = new LinkedList<Aluno>();
		
		while(true) {
			System.out.print("Adicionar(A) ou Remover(R): ");
			String op= scan.nextLine();
			if(op.equals("A"))
				alunos.add(readAluno(scan));
			else if(op.equals("R")) {
				System.out.print("RA: ");
				String RA = scan.nextLine();
				removeAluno(alunos, RA);
			}
			
		}		
	}
	
	public static void removeAluno(List<Aluno> alunos, String RA){
		Aluno removido = null;
		
		for(Aluno aluno : alunos) {
			if(aluno.RA.equals(RA)) {
				removido = aluno;
				break;
			}
		}
		
		if(removido == null) {
			System.out.println("RA não existente");
			return;
		}
		
		alunos.removeIf(x -> x.RA.equals(RA));
		
		return;
	}
	
	public static Aluno readAluno(Scanner scan) {
		Aluno aluno = new Aluno();
		System.out.print("Nome: ");
		aluno.Nome = scan.nextLine();
		System.out.print("RA: ");
		aluno.RA = scan.nextLine();
		System.out.print("Idade: ");
		aluno.Idade = Integer.parseInt(scan.nextLine());
		System.out.print("Curso: ");
		aluno.Curso = scan.nextLine();
		
		return aluno;
	}
	
}
