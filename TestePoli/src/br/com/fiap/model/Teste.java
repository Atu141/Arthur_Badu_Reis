package br.com.fiap.model;

import java.time.LocalDate;

public class Teste {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Mariana", LocalDate.of(2024, 4, 25), "24234",1);
		
		Object o = p;
		
		System.out.println(p);
		System.out.println(o);

	}

}
