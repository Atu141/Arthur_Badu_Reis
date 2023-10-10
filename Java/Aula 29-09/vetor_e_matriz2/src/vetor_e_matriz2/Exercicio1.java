package vetor_e_matriz2;

import java.util.Scanner;

public class Exercicio1 {
	static Scanner entrada = new Scanner(System.in);
	
	static String [] nomes = new String [] {"A","B","C","D"};
	static int temp[] = new int[4];
	static Double sal[] = new Double[4];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<4;i++) {
			System.out.println("Informe o tempo de Trabalho do "+(i+1)+"° funcionario");
			temp[i]=entrada.nextInt();
			System.out.println("Informe o Salario do "+(i+1)+"° funcionario");
			sal[i]=entrada.nextDouble();
		}
		String analise[] = analise();
		relatorio(analise);
		
	}

	public static String [] analise() {
		String [] analise = new String[4];
		for(int i=0;i<4;i++) {
			if(temp [i]>3 || sal[i]<700) {
				analise[i]="Aumento Aprovado";
			}else {
				analise[i]="Aumento Negado";
			}
		}
		
		
		return analise;
	}

	public static void relatorio(String []analise) {
		System.out.println("");
		System.out.println("Relatorio");
		for(int i =0;i<4;i++) {
			System.out.println(nomes[i]+" - "+analise[i]);
		}
		
		
	}
}

