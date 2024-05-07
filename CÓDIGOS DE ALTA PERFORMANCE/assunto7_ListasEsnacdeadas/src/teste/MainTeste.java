package teste;

import java.util.Scanner;

import listas.ListaCresenteInt;

public class MainTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner le = new Scanner(System.in);
		ListaCresenteInt lista = new ListaCresenteInt();
		int valor;
		System.out.println("Valor Positivo insere na Lista e Negativo Encerra:");
		valor = le.nextInt();
		while (valor >=0) {
			lista.add(valor);
			lista.show();
			System.out.println("Valor Positivo insere na Lista e Negativo Encerra:");
			valor = le.nextInt();
		}
		le.close();
	}

}
