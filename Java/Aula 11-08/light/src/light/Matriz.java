package light;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		//criar matriz
		int [][] numeros = new int[3][3];
		
		//Carregar a Matriz
		
		//O primeiro "For" está fixando a Linha o sehungo "For" está movimentando a Coluna 
		for(int linha=0; linha<3; linha++) {
			for(int coluna=0; coluna<3; coluna++) {
				System.out.print("Informe o elemento da Matriz agora - linha:"+linha+" - coluna:"+coluna+":" );
				numeros[linha][coluna]= entrada.nextInt();
			}
		}
		System.out.println(" ");
		//Exibir Matriz
		for(int l=0;l<3;l++) {
			for(int c=0; c<3;c++) {
				System.out.print(numeros[l][c]+"\t");
			}
			System.out.println(" ");
		}
		
		
	}

}
