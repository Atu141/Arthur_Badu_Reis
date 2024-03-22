package br.com.fiap.app;

import br.com.fiap.model.CaixaSupermercado;

public class Supermercado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaixaSupermercado produto = new CaixaSupermercado("123.456.789-00");
		produto.adiciona(3, 9.75, "Oleo", "alimento");
		produto.adiciona(4, 8.50, "Feijão", "alimento");
		produto.adiciona(2, 24.99, "Arroz", "alimento");
		produto.adiciona(4, 4.68, "Sabonete", "higiene");
		produto.adiciona(12, 5.50, "Heineken", "bebidas");
		
		
		System.out.println(produto.getCuponFiscal());
		System.out.println("Total " + produto.getTotal());
		System.out.println("Imposto " + produto.getImposto());
	}

}
