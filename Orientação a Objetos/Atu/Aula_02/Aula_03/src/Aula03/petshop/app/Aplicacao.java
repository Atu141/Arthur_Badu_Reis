package Aula03.petshop.app;

import Aula03.petshop.model.Cachorro;

public class Aplicacao {

	public static void main(String[] args) {
		
		Cachorro cao = new Cachorro("médio", "pastor", "Urso");
		Cachorro pet;
		
		pet = new Cachorro("pequeno","maltês", "Montanha");
		
		System.out.println(cao);
		System.out.println(pet);
		
		cao = pet;
		
		System.out.println(cao);
	}
	
}
