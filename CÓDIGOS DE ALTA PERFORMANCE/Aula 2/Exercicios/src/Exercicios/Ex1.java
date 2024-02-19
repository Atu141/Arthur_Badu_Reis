package Exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		final int N = 30;
		int nAp=0;
		int n;
		do {
		System.out.println("Informe a quantidade de Alunos Maximo "+N);
		n = entrada.nextInt();
		}while(n<=0 || n> 30 );
		int [] rm = new int[n]; 
		double [] nota1 = new double [n];
		double [] nota2 = new double [n];
		double [] md = new double [n];
		int aprovados[] = new int[n];
		
		for(int i = 0; i<n; i++) {
			System.out.println("Informe o RM do Aluno "+(i+1)+"°: ");
			rm[i] = entrada.nextInt();
			System.out.println("Informe a Primeria nota:");
			nota1[i] = entrada.nextDouble();
			System.out.println("Informe a Segunda nota:");
			nota2[i]= entrada.nextDouble();
			md[i] = (nota1[i] + nota2[i])/2;
		}
		
		for(int i = 0; i<n; i++) {
			if(md[i] >= 6.0) {
				aprovados[nAp] = rm[i];
				nAp++;
			}
		}
		System.out.println(" ");
		System.out.println("===================================");
		System.out.println("-----Alunos Aprovados-----");
		System.out.println("===================================");
		System.out.println(" ");
		for(int i=0;i<nAp;i++) {
			System.out.println("RM aprovados: "+aprovados[i]+" com a Media :"+md[i]);
		}
		
	}

}
