package br.com.fiap.model;

import java.time.LocalDate;

public class Pessoa {

	private String nome;
	private LocalDate nascimento;
	private String cpf;
	private long id;
	
	
	public Pessoa(String nome, LocalDate nascimento, String cpf, long id) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.cpf = cpf;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return nome + " " + nascimento + " " + cpf;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}
