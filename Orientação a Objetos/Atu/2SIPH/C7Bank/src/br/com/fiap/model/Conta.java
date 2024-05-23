package br.com.fiap.model;

public class Conta {

	private String cliente;
	private double saldo = 300;
	
	public void retirada(double valor) throws Exception {
		if(valor > saldo) {
			throw new Exception("Saldo insuficiente");
		}
		this.saldo = this.saldo - valor;
	}
	
	public void deposito(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public static void main(String[] args) {
		Conta c = new Conta();
		c.deposito(200);
		c.deposito(100);
		try {
			c.retirada(250);
			c.retirada(300);
			c.retirada(300);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Cliente não possui saldo para retirada");
		}
	}
}
