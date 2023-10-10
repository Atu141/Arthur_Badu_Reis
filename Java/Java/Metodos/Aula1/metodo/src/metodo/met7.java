package metodo;

import java.util.Scanner;

public class met7 {

	static Scanner entrada = new Scanner(System.in);

	static String nome;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dados();

	}// main

	public static void dados() {
		int diarias = 0, tipo = 0;
		System.out.println("Informe o Nome do Hóspede");
		nome = entrada.next();
		System.out.println("Indorme a quantidade de Diarias");
		diarias = entrada.nextInt();
		System.out.println("Informe o Tipo de Acomodação");
		tipo = entrada.nextInt();
		while (tipo != 1 && tipo != 2 && tipo != 3) {
			System.out.println("Tipo não encontrado informe o certo");
			System.out.println("1 - Standard - R$ 380,00");
			System.out.println("2 - Luxo - R$ 450,00");
			System.out.println("3 - Super Luxo - R$ 560,00");
			System.out.println("Informe o Tipo de Acomodação");
			tipo = entrada.nextInt();
		}

		calculo(diarias, tipo);
	}

	public static void calculo(int diarias, int tipo) {
		int preco = 0, precofinal = 0;
		if (tipo == 1) {
			preco = 380;
		} else if (tipo == 2) {
			preco = 450;
		} else if (tipo == 3) {
			preco = 560;
		}

		precofinal = preco * diarias;

		pagamento(precofinal);

	}

	public static void pagamento(int precofinal) {

		String pagamento;
		double total = 0;
		System.out.println("Como sera o metodo de Pagamento");
		System.out.println("A vista tem 10% de Desconto");
		System.out.println("A prazo preco total - " + precofinal);
		System.out.println("");
		System.out.println("Como sera o Metodo de Pagamento A vista (V) ou A prazo (P)");
		pagamento = entrada.next().toUpperCase();

		if (pagamento.equalsIgnoreCase("V")) {
			total = precofinal * 0.10;
			System.out.println("");
			System.out.println(nome + "- Total a pagar - " + total);
		} else {
			System.out.println(nome + "- Total a pagar - " + total);
		}

	}

}
