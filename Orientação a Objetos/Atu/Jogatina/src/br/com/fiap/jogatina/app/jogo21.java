package br.com.fiap.jogatina.app;

import br.com.fiap.jogatina.model.Baralho;
import br.com.fiap.jogatina.model.Carta;

public class jogo21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Baralho b = new Baralho();
		b.embaralhar();
		
		Jogador j1 = new Jogador(b.comprar(), b.comprar());
		JogadorCPU j2 = new JogadorCPU(b.comprar(), b.comprar());
		
		while(j1.querCarta()) {
			Carta c = b.comprar();
			j1.recebeCarta(c);
		}
		while(j2.querCarta()) {
			Carta c = b.comprar();
			j2.recebeCarta(c);
		}
		
		System.out.println("Pontos J1 " + j1.getPontos());
		System.out.println("Pontos J2 " + j2.getPontos());
	}

}
