package br.com.fiap.model;

public class Carta {

	private int valor;
	private Naipe naipe;
	
	public Carta(int valor, Naipe naipe) {
		//super();
		this.valor = valor;
		this.naipe = naipe;
	}

	public int getValor() {
		return valor;
	}

	public Naipe getNaipe() {
		return naipe;
	}	
	
	public String toString() {
		//return valor + " " + naipe;
		//alterar o valor para uma String
		String vl = Integer.toString(valor);
		switch (valor) {
		case 1: 
			vl = "A";
			break;
		
		case 11: 
			vl = "J";
			break;
		
		case 12: 
			vl = "Q";
			break;
		
		case 13: {
			vl = "K";
			break;	
		}
		}
		
		if(naipe == Naipe.OUROS)
			return vl + "♦"; //alt e 4
		else if (naipe == Naipe.ESPADAS)
			return vl + "♠"; //alt e 6
		else if(naipe == Naipe.COPAS)
			return vl + "♥";
		else 
			return vl + "♣"; //alt e 5
	}
	

}
