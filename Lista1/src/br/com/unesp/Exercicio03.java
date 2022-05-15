package br.com.unesp;

public class Exercicio03 {
	
	public static void main(String[] args) {
		Exercicio03 faixa30 = new Exercicio03("Augusto", 25, 2000);
		Exercicio03 faixa40 = new Exercicio03("Augusto", 35, 3000);
		Exercicio03 faixa50 = new Exercicio03("Augusto", 45, 4000);
		Exercicio03 faixa60 = new Exercicio03("Augusto", 55, 5000);
		Exercicio03 faixa60Mais = new Exercicio03("Augusto", 65, 6000);
		
		System.out.println(faixa30);
		System.out.println(faixa40);
		System.out.println(faixa50);
		System.out.println(faixa60);
		System.out.println(faixa60Mais);
	}
	
	private String nome;
	private int idade;
	private double salario;
	private double salarioTributado;
	private double salarioLiquido;
	private double contribuicaoFuncionario;
	private double contribuicaoEmpresa;
	
	public Exercicio03(String nome, int idade, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.salarioTributado = calculaSalarioTributado();
		this.contribuicaoFuncionario = calculaContribuicaoFuncionario();
		this.contribuicaoEmpresa = calculaContribuicaoEmpresa();
		this.salarioLiquido = calculaSalarioLiquido();
	}
	
	public double calculaSalarioLiquido() {
		return getSalario() - calculaContribuicaoFuncionario();
	}

	public double calculaContribuicaoFuncionario() {
		if(getIdade() <= 30)
			return getSalarioTributado()*0.2;
		
		if(getIdade() <= 40)
			return getSalarioTributado()*0.18;
		
		if(getIdade() <= 50)
			return getSalarioTributado()*0.12;
		
		if(getIdade() <= 60)
			return getSalarioTributado()*0.07;
		
		return getSalarioTributado()*0.04;
	}
	
	public double calculaContribuicaoEmpresa() {
		if(getIdade() <= 30)
			return getSalarioTributado()*0.18;
		
		if(getIdade() <= 40)
			return getSalarioTributado()*0.15;
		
		if(getIdade() <= 50)
			return getSalarioTributado()*0.15;
		
		if(getIdade() <= 60)
			return getSalarioTributado()*0.10;
		
		return getSalarioTributado()*0.04;
	}
	
	private double calculaSalarioTributado() {
		if(getSalario() > 5000)
			return 5000;
		
		return getSalario();
	}
	
	public double getSalarioTributado() {
		return salarioTributado;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getContribuicaoFuncionario() {
		return contribuicaoFuncionario;
	}
	
	public double getContribuicaoEmpresa() {
		return contribuicaoEmpresa;
	}
	
	public double getSalarioLiquido() {
		return salarioLiquido;
	}
	
	@Override
	public String toString() {
		String obj = "Nome: " + this.nome + ", Idade: " + this.idade + ", Salario: " + this.salario
				   + "\nContribuição do Funcionário: " + this.contribuicaoFuncionario
				   + "\nContribuição da Empresa: " + this.contribuicaoEmpresa
				   + "\nSalário Líquido: " + this.salarioLiquido + "\n\n";
		return obj;
	}
}






