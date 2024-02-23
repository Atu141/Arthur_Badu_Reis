package Aula03.petshop.app;

import java.time.LocalDate;

import Aula03.petshop.model.Pessoa;

public class ExemploEncapsulamento {

	public static void main(String[] args) {
		Pessoa p = new Pessoa ("Margarida", LocalDate.of(1999, 10, 12));
		
		System.out.println(p.getNome());
		System.out.println(p.getIdade());
	}
}
