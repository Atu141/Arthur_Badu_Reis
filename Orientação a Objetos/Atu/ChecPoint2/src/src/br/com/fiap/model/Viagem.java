package br.com.fiap.model;

import java.time.LocalDate;

public class Viagem {

	private LocalDate data;
	private double valor;
	private String origem;
	private String destino;
	private String formaPagamento;
	private String cliente;
	
	public Viagem() {
		
	}
	
	public Viagem(LocalDate data, double valor, String origem, String destino, String formaPagamento, String cliente) {
		this.data = data;
		this.valor = valor;
		this.origem = origem;
		this.destino = destino;
		this.formaPagamento = formaPagamento;
		this.cliente = cliente;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	
	
}
