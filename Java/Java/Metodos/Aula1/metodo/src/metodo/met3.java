package metodo;

import java.util.Scanner;

public class met3 {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double media = 0;
		String nomeAluno;
		
		System.out.println("Digite o Nome do Aluno:");
		nomeAluno=entrada.next();

		System.out.println("Digite a média");
		media=entrada.nextDouble();
		
		analise(nomeAluno,media);
		//Parametro Real
	}//main

	//Paremetro Formal
	public static void analise(String nomeAluno,double media) {
		
		if(media<=3) {
			System.out.println(nomeAluno+"Dp");
		} else if(media<6) {
			System.out.println(nomeAluno+"Exame");
		}else {
			System.out.println(nomeAluno+"Aprovado");
		}
		
	}
	
}
