package br.com.fiap.orientacao.lista.model;

public class Endereco {

	private int cep;
	private String cidade;
	private int numero;
	private String bairro;
	
	
	public Endereco(int cep, String cidade, int numero, String bairro) {
		this.cep = cep;
		this.cidade = cidade;
		this.numero = numero;
		this.bairro = bairro;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
}
