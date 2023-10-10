package sla;

import java.util.Scanner;

public class sla2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		String produtos [] = new String [] {"Camisa","Blusa","Calça","Vestido","Meia"};
		double custo [] = new double [] {10,15,20,10,5};

		double precos[][] = new double [5][4];
		double imposto[][] = new double [5][4];

		double precoFinal = 0;
		
		
		
		for(int linha =0;linha<5;linha++) {
			System.out.println("Informe o preço do produto:"+produtos[linha]);
			for(int coluna=0;coluna<4;coluna++) {
				System.out.println("Prelo do produto na loja "+(coluna+1)+":");
				precos[linha][coluna]= entrada.nextDouble();
				
				if(precos[linha][coluna]<=50) {
					imposto[linha][coluna]=precos[linha][coluna]*0.05;
				}else if((precos[linha][coluna]>50)&&(precos[linha][coluna]<=100)) {
					imposto[linha][coluna]=precos[linha][coluna]*0.10;
				}else {
					imposto[linha][coluna]=precos[linha][coluna]*0.20;
				}
			}
		}
		System.out.println("");
		System.out.println("==============RELATÓRIO==============");
		for(int linha=0;linha<5;linha++) {
			System.out.println("Nome do Produto:"+produtos[linha]+"custo transp:"+custo[linha]);
			for(int coluna=0;coluna<4;coluna++) {
				System.out.println("Loja:"+(coluna+1));
				System.out.println("Imposto:"+imposto[linha][coluna]);
				System.out.println("Preço:"+precos[linha][coluna]);
				precoFinal=precos[linha][coluna]+imposto[linha][coluna]+custo[linha];
				System.out.println("Preço Final"+precoFinal);
			}
			System.out.println("");
		}
	}
	

}
