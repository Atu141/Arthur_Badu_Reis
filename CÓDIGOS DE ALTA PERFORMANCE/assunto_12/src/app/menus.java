package app;

import java.util.Scanner;

import arvores.AVLINT;

public class menus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner le = new Scanner(System.in);
		int opcao;
		AVLINT avl = new AVLINT();
		do {
			System.out.println("0 - Termina o Programa");
			System.out.println("1 - Inserie o valor denteo da AVL");
			System.out.println("2 - Apresenta o Valor do balancemanto da AVL");
			opcao = le.nextInt();
			switch(opcao) {
			case 0:
				System.out.println("Enserando o Progama");
				break;
			case 1:
				System.out.println("Informa valor do dado a ser inserido");
				int valor = le.nextInt();
				avl.root = avl.inserirH(avl.root, valor);
				break;
			case 2:
				System.out.println("\n*** Apresenta FB dps nos AVL");
				avl.mostraFB(avl.root);
				break;
			default:
				System.out.println("Opcao invalida");
			}
		}while(opcao != 0);
		le.close();
	}

}
