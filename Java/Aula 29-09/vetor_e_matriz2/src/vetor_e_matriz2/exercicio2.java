package vetor_e_matriz2;

import java.util.Scanner;

public class exercicio2 {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] chamado = capitacao();
		
	}
	public static int[][] capitacao(){
		int [][] chamado = new int [5][3];
		for(int i=0;i<5;i++) {
			System.out.println("Identificação do Funcionario");
			chamado[i][0]=entrada.nextInt();
			System.out.println("Informe o codigo do Erro");
			chamado[i][1]=entrada.nextInt();
			System.out.println("Informe o Criterio do Chamado");
			chamado[i][2]=entrada.nextInt();
		}
		
		
		return chamado;
	}
}
