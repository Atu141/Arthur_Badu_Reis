package light;

import java.util.Scanner;

public class light {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner(System.in);
		
		
		int j=0;
		
		int[] Vetor1 = new int[] {3, 5, 4, 2, 2, 5, 3, 2, 5, 9};
		int[] Vetor2 = new int[] {7, 15, 20, 0, 18, 4, 53, 23, 8, 6};
		int[] Resultante = new int[20];
		
		for(int i=0; i<10;i++) {
			
			Resultante[j] = Vetor1[i];
			System.out.println("Vetor Resultante - posição " +(j+1)+" - valor: " + Resultante[j]);
			j++;
			
			Resultante[j] = Vetor2[i];
			System.out.println("Vetor Resultante - posição " +(j+1)+" - valor: " + Resultante[j]);
			j++;
		
		}

	}

}
