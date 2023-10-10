package light;

import java.util.Scanner;

public class night {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double[][] notas = new double [3][4];
		
		for(int a=0; a<3; a++) {
			for(int n =0; n<3; n++) {
				System.out.println("Informe as notas dos alunos");
				System.out.println("Digite a "+(n+1)+"Nota:");
				notas[a][n] = entrada.nextDouble();
				notas[a][3] += notas[a][n]; 
			}
			notas[a][3] = notas[a][3]/3;
		}
		//Print
		System.out.println(" ");
		System.out.println("-----LISTA MÉDIA DOS ALUNOS-----");
		for(int a=0;a<3;a++) {
			for(int n=0;n<4;n++) {
				System.out.print(notas[a][n]+"\t");
			}
			System.out.println("");
		}
	}

}
