package br.com.fiap.jogatina.model;

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
	
	public String toString(){
		//return valor + " " + naipe;
		String vL = Integer.toString(valor);
		switch (valor) {
		case 1: 
			vL = "A";
			break;
		case 11: 
			vL = "J";
			break;
		case 12:
			vL = "Q";
			break;
		case 13:
			vL = "K";
			break;
		}
		
		if(naipe == Naipe.OUROS)
			return vL +  " " + "♦";
		else if(naipe == Naipe.COPAS)
			return vL + " "  + "♥";
		else if(naipe == Naipe.ESPADAS)
			return vL + " " +  "♠";
		else
			return vL + " " + "♣";
	}


}
