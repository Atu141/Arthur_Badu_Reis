package br.com.fiap.model;

public class Motorista {

	private String nome;
	private String cpf;
	private int celular;
	private String habilitacao;
	private String categoria;
	
	
	public Motorista() {
		
	}

	public Motorista(String nome, String cpf, int celular, String habilitacao, String categoria) {
		this.nome = nome;
		this.cpf = cpf;
		this.celular = celular;
		this.habilitacao = habilitacao;
		this.categoria = categoria;
	}
	
	public String toString() {
		return nome + " " + cpf + " " + celular + " " + habilitacao + " " + categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public String getHabilitacao() {
		return habilitacao;
	}

	public void setHabilitacao(String habilitacao) {
		this.habilitacao = habilitacao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	
}
