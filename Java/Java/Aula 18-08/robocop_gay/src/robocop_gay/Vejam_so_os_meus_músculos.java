package robocop_gay;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Vejam_so_os_meus_músculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		DecimalFormat numF = new DecimalFormat("#,##0.00");
		
		String [] loja = new String[] {"A", "B", "C", "D", "E", "F", "G", "H"};
		String [] produto = new String[] {"W", "X", "Y", "Z"};
		double [][] preco = new double [4][8];
		
		
		
		for(int i=0;i<4;i++) {
			System.out.println("PRODUTOS:"+produto[i]);
			for(int j=0;j<4;j++) {
				System.out.println("Informe o preço do Porudto"+produto[i]+" na loja"+loja[j]+":");
				//preco[i][j]=entrada.nextDouble();
				preco[i][j] = (double) (Math.random()*190);
			}
		}
		System.out.println("");
		System.out.println("----------MATRIZ PREÇOS----------");
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.println(numF.format(preco[i][j])+"\t");
			}
			System.out.println("");
		}
		System.out.println("----------LISTA DE PREÇOS INFERIORES A 120R$----------");
		for(int i=0; i<4;i++) {
			System.out.println(produto[i]);
			for(int j=0; j<8;j++) {
				if(preco[i][j]<120) {
					System.out.println("----------Loja:"+loja[j]+" Preço: "+numF.format(preco[i][j])+"----------");
				}
			}
		}
		
		
		
		
		
	}

}
