package aplicacao;

import java.util.Scanner;

import arvores.ABBINT;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		ABBINT abb = new ABBINT();
		int opcao;
		do {
			System.out.println("0 - Sair");
			System.out.println("1 - Inserir");
			System.out.println("2 - Apresentar ABB");
			System.out.println("3 - Apresentar a Quantidade de NOS na ABB");
			opcao = le.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Encerrado o programa!");
				break;
			case 1:
				System.out.print("Valor a ser inserido: ");
				int valor = le.nextInt();
				abb.root = abb.inserir(abb.root, valor);
				break;
			case 2:
				System.out.println("\n *** Apresentacao da ABB em ordem crescente ***");
				abb.show(abb.root);
				System.out.println("\n");
				break;
			case 3:
				int n = abb.contaNos(abb.root, 0);
				System.out.println("A quantidade de nos na ABB = "+ n);
				break;
			default:
				System.out.println("Opcao invalida");
			}
		} while (opcao != 0);

		le.close();

	}

}
