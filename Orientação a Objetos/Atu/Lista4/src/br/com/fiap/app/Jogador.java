package br.com.fiap.app;

import java.util.Scanner;

import br.com.fiap.model.Carta;

public class Jogador {

	private Carta [] mao;
	private int pontos;
	private int topo;
	
	public Jogador(Carta c1, Carta c2) {
		pontos = 0;
		topo = 0;
		mao = new Carta[15];
		recebeCarta(c1);
		recebeCarta(c2);

	}

	
	public int getPontos() {
		return pontos;
	}
	
	public void recebeCarta(Carta c) {

		
		if(c.getValor() > 10) 
			pontos = pontos + 10;
		else 
			pontos = pontos + c.getValor();
		
		mao[topo] = c;
		topo++;
	}
	
	public boolean querCarta() {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Quer carta " + pontos + " (s/n)?");
		String resp = entrada.nextLine();
		if(resp.equals("s"))
			return true;
		else 
			return false;
		
		
		
		
	}
	
}
