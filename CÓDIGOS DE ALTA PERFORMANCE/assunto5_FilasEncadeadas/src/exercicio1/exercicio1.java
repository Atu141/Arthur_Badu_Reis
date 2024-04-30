package exercicio1;

import java.util.Scanner;

import filas.FilaInt;


public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner le = new Scanner(System.in);
		FilaInt fila = new FilaInt();
		int valor;
		System.out.println("Digite valor interiro positivo para inserir na fila e valor negativo para sair");
		valor = le.nextInt();
		
		while(valor>=0){
			fila.enqueue(valor);
			System.out.println("Digite valor interiro positivo para inserir na fila e valor negativo para sair");
			valor = le.nextInt();
		}
		while(!fila.isEmpty()) {
			System.out.println("Valor retirado: " + fila.dequeue());
		}
		le.close();
	}

}
