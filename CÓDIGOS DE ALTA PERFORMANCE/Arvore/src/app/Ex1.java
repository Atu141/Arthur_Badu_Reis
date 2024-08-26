package app;

import java.util.Scanner;

import arvore.ABBINT;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner le = new Scanner(System.in);
		ABBINT abb = new ABBINT();
		int opcao;
		do {
			System.out.println("0 - Sair");
			System.out.println("1 - Inserir");
			System.out.println("2 - Apresentar ABB");
			opcao = le.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Sair do Programa");
				break;
			case 1:
				System.out.println("Valor a Ser Inserirdo");
				int valor = le.nextInt();
				abb.root = abb.inserir(abb.root, valor);
				break;
			case 2:
				System.out.println("\n ****** Apresentação da ABB em ordem Crescente ******");
				abb.show(abb.root);
				System.out.println("\n");
				break;
			default:
				System.out.println("Opção Invalida");
			}
		}while (opcao != 0 );
		
		le.close();
	}

}
