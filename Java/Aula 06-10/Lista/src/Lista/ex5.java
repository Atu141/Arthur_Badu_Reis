package Lista;

import java.util.Scanner;

public class ex5 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Carregar o Vetor
		int [] vetorA=carregar();
		// Ordernar o Vetor
		ordenacao(vetorA);
		for(int i =0;i<5;i++) {
			System.out.println(vetorA[i]);
		}
	}
	
	public static int [] carregar() {
		int [] vetorA = new int [5];
		
		for(int i =0;i<5;i++) {
			System.out.println("Digite o numero ["+i+"]:");
			vetorA[i]=entrada.nextInt();		
			}
		
		return vetorA;
	}

	public static int [] ordenacao(int []vetorA) {
		int aux = 0;
		
		for(int i =0;i<5;i++) {
			for(int j=0;j<4;j++) {
				if(vetorA[j]>vetorA[j+1]) {
					aux = vetorA[j];
					vetorA[j]=vetorA[j+1];
					vetorA[j+1]=aux;
				}
			}
		}
		
		
		
		return vetorA;
	}

}

