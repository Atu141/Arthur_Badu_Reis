package Aula03.petshop.model;

import java.time.LocalDate;

public class Pessoa {

	public String nome;
	public LocalDate nascimento;
	
	public Pessoa(String nome, LocalDate nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return LocalDate.now().getYear() - nascimento.getYear();
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
