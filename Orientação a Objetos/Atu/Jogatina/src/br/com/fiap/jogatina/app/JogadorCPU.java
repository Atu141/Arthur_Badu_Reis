package br.com.fiap.jogatina.app;

import java.util.Scanner;

import br.com.fiap.jogatina.model.Carta;

public class JogadorCPU {
	
	private Carta[] mao;
	private int pontos;
	private int topo; 
	
	public JogadorCPU(Carta c1, Carta c2) {
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
		if (c.getValor() > 10 )
			pontos = pontos + 10;
		else
			pontos = pontos + c.getValor();
		mao[topo] = c;
		topo++;
	}
	public boolean querCarta() {
		if(pontos <16)
			return true;
		else
			return false;
	}
	
}
