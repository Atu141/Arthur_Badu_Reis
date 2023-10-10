package light;

import java.util.Scanner;

public class day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int[][] numeros = new int[4][4];
		int somalinha = 0, somacoluna = 0, somatotal = 0;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("linha:" + i + " - coluna:" + j + ":");
				numeros[i][j] = entrada.nextInt();
				somatotal+=numeros[i][j];
			}
		}
		System.out.println(" ");
		// Exibir Matriz
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(numeros[i][j] + "\t");
			}
			System.out.println(" ");
		}

		// Soma de Matriz
		for (int i = 0; i < 4; i++) {
			somalinha=0;
			somacoluna=0;
			for (int j = 0; j < 4; j++) {
				somalinha += numeros[i][j];
				somacoluna += numeros[j][i];
			}
			System.out.println("Soma Linha "+i+":"+somalinha);
			System.out.println("Soma Coluna "+i+":"+somacoluna);
			System.out.println("");
		}
		System.out.println("Soma Total:"+somatotal);
	}	

}
