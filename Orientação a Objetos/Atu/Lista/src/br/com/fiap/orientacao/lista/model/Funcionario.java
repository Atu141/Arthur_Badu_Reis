package br.com.fiap.orientacao.lista.model;

public class Funcionario {
// ex3 lista 2
	private String nome;
	private long matricula;
	private Profissao profissao;
	private double salario;
	
	public Funcionario(){
		
	}
	
	public Funcionario(long matricula){
		this.matricula = matricula;
	}

	public Funcionario(long matricula, String nome){
		this(matricula);
		this.nome = nome;
	}
	
	public Funcionario(long matricula, String nome, Profissao profissao){
		this(matricula, nome);
		this.profissao = profissao;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome + "Matricula: " + matricula + "Profissão: " + profissao);
	}
	
	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}
	
}
