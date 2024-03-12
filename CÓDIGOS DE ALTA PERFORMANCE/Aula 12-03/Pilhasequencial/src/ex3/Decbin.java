package ex3;

import java.util.Scanner;

import pilhas.Pilhasint;

public class Decbin {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		Pilhasint pilha = new Pilhasint();
		
		pilha.init();
		System.out.println("Informe o valor decimal");
		int decimal = le.nextInt();
		int resto;
		
		while(decimal != 0) {
			resto = decimal%2;
			pilha.push(resto);
			decimal = decimal / 2;
		}
		
		System.out.print("Binario: ");
		pilha.esvazia();
	}

}
