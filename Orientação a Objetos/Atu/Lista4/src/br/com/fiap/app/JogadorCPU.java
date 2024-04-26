package br.com.fiap.app;

import br.com.fiap.model.Carta;

public class JogadorCPU extends Jogador {

	public JogadorCPU(Carta c1, Carta c2) {
		super(c1, c2);
	}
	
	
	public boolean querCarta() {
		if(getPontos()>16) {
			return false;
		}else
			return true;
	}
}
