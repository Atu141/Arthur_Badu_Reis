package metodo;

import java.util.Scanner;

public class met6 {

	static Scanner entrada = new Scanner(System.in);

	static String nome;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dados();
	}// main

	public static void dados() {
		double nota1 = 0, nota2 = 0;
		System.out.println("Procedimento Dados");
		System.out.println("Digite o Nome:");
		nome = entrada.next();
		System.out.println("Nota 1:");
		nota1 = entrada.nextDouble();
		System.out.println("Nota 2:");
		nota2 = entrada.nextDouble();
		double media = media(nota1, nota2);
		System.out.println("Media:" + media);
	}// dados

	public static double media(double nota1, double nota2) {
		double media = 0;
		media = (nota1 + nota2) / 2;
		analise(media);
		return media;
	}// media

	public static void analise(double media) {
		System.out.println("Procedimento Analise");
		if (media >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
	}
}
