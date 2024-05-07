package br.com.fiap.model;

public class Veiculo {
	
	private String placa;
	private String modelo;
	private String montadora;
	private int ano;
	
	public Veiculo() {
		
	}

	public Veiculo(String placa, String modelo, String montadora, int ano) {
		this.placa = placa;
		this.modelo = modelo;
		this.montadora = montadora;
		this.ano = ano;
	}

	public String toString() {
		return placa + " " + modelo + " " + montadora + " " + ano;
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMontadora() {
		return montadora;
	}

	public void setMontadora(String montadora) {
		this.montadora = montadora;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	

}
