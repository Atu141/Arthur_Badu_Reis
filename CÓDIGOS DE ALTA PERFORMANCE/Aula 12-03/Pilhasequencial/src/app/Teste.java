package app;

import pilhas.Pilhasint;

public class Teste {

	public static void main(String[] args) {
		Pilhasint pilha = new Pilhasint();
		pilha.init();
		
		pilha.push(11);
		pilha.push(22);
		pilha.push(33);
		pilha.push(44);
		pilha.push(55);
		pilha.push(66);
		pilha.push(77);
		
	
		if(!pilha.isEmpty()) {
			System.out.println("Valor que está no topo da Pilha: " + pilha.top());
		}else {
			System.out.println("Pilha vazia");
		}
		pilha.esvazia();
	}

}
