package light;

import java.util.Scanner;

public class free {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int num[][] = new int [5][2];
		double val[][] = new double [5][2];
		double totalGeral = 0;
		
		for(int i=0;i<5;i++) {
			System.out.println("Digite o Codigo:");
			num[i][0]=entrada.nextInt();
			
			System.out.println("Digite o Preço:");
			val[i][1]=entrada.nextDouble();
			
			System.out.println("Digite a QTD:");
			num[i][1]=entrada.nextInt();
			
			val[i][1]=val[i][0]*num[i][1];
			totalGeral+=val[i][1];
			}
		System.out.println(" ");
		System.out.println("Lista de Produtos");
		for(int i=0;i<5;i++) {
			System.out.println(num[i][0]+" - "+val[i][1]+" - "+num[i][1]+" - "+val[i][1]);
		}
		System.out.println("");
		System.out.println("Total Geral: "+totalGeral);
	}

}
