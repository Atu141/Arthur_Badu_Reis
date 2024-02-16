package Aula02.jogatina.model;

public class Carta {

	private int valor;
	private char naipe;
	
	//Construtor
	public Carta( int v, char n) {
		if(v<1||v>13) {
			System.out.println("PASSOU DO LIMITE");
			System.exit(69);
		}
		valor = v;
		naipe = n;
	}
	
	public String toString(){
		if(valor==1) {
			return "A" + naipe;
		}else
			return valor + "" + naipe;
	}

}
