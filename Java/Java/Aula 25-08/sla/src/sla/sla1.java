package sla;

import java.util.Scanner;

public class sla1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);

		
		int [][] sem1 = new int [5][3];
		int [][] sem2 = new int [5][3];
		int [][] ano = new int [5][3];
		int [] soma_ano = new int[3];
		int [] soma_curso = new int[5];
		int [] maior = new int[5];
		int curso = 1, unit = 1, indUni = 0;
		
		for(int j=0; j<5;j++) {
			for(int i=0; i<3;i++) {
				System.out.println("Informe a quantidade de Matriculas do "+curso+"° curso no Primeiro Semestre na unidade "+unit);
				sem1[j][i] = entrada.nextInt();
				
				unit++;
			}
			unit = 1;
			curso++;
		}
		curso = 1;
		for(int i=0; i<5;i++) {
			for(int j=0; j<3;j++) {
				System.out.println("Informe a quantidade de Matriculas do "+curso+"° curso no Segundo Semestre na unidade "+unit);
				sem2[i][j] = entrada.nextInt();
				
				unit++;
			}
			unit = 1;
			curso++;
		}
		
		for(int i=0; i<5;i++) {
			for(int j=0; j<3;j++) {
				ano[i][j] = sem1[i][j] + sem2[i][j];
				soma_ano[j] += ano[i][j];
				soma_curso[i] += ano[i][j];
			}
		}
		for(int i=0; i<5;i++) {
			indUni=0;
			for(int j=0; j<3;j++) {
				if(ano[i][j]>maior[i]) {
					maior[i] = ano[i][j];
					indUni = j;
				}
			}
		}
		System.out.println(" ");
		System.out.println("Matriculas Primeiro Semestre");
		for(int j=0; j<5;j++) {
			for(int i=0; i<3;i++) {
				System.out.print(sem1[j][i]+"\t");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println("Matriculas Segundo Semestre");
		for(int i=0; i<5;i++) {
			for(int j=0; j<3;j++) {
				System.out.print(sem2[i][j]+"\t");
				
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println("Soma Matriculas do Ano");
		for(int i=0; i<5;i++) {
			for(int j=0; j<3;j++) {
				System.out.print(ano[i][j]+"\t");
				
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println("Soma Matriculas do Ano por Unidade");
		for(int i=0; i<3;i++) {
			System.out.print(soma_ano[i]+"\t");
		}
		System.out.println(" ");
		
		System.out.println(" ");
		System.out.println("Soma Matriculas do Ano por Curso");
		for(int i=0; i<5;i++) {
			System.out.print(soma_curso[i]+"\t");
		}
		System.out.println(" ");
		
		System.out.println(" ");
		System.out.println("Maior Matriculas por Unidade");
		for(int i=0; i<5;i++) {
			System.out.print(maior[i]+"\t");
		}
		System.out.println(" ");
	}

}
