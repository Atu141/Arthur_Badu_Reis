package vetor_e_matriz2;

import java.util.Scanner;

public class ex2 {

	static String [] linhaProd = new String [] {"Computador","Notebook","Tablet"};
	static String [] meses = new String [] {"Jan","Fev","Mar"};
	static Scanner entrada = new Scanner(System.in);
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A)
		int[][] produtos = carregar();
		//B)
		int [] somaProd = somaLinhaProd(produtos);
		//C)
		int [] somaMes =  somaMeses(produtos);
		//D)
		relatorio(somaProd,somaMes);
	}

	//A) Função carregar Matriz
	public static int[][] carregar(){
		
		int[][] produtos = new int [3][3];
		
		for(int i =0;i<3;i++) {
			System.out.println("Produto - "+linhaProd[i]);
			for(int j = 0;j<3;j++) {
				System.out.print(meses[j]+" :");
				produtos[i][j]=entrada.nextInt();
			}
		}
		return produtos;
	}

	//B)
	public static int [] somaLinhaProd(int [][]produtos) {

		int [] somaProd = new int[3];
		
		for(int i = 0;i<3;i++) {
			for(int j =0;j<3;j++) {
				somaProd[i]+=produtos[i][j];
			}
		}
		
		return somaProd;
	}
	
	//C)
	public static int[] somaMeses(int [][]produtos) {
		int [] somaMes = new int[3];
		
		for(int i =0;i<3;i++) {
			for(int j=0;j<3;j++) {
				somaMes[i]+=produtos[j][i];
			}
		}
		
		return somaMes;
	}
	
	//D
	public static void relatorio(int[] somaProd,int[] somaMes) {
		
		System.out.println("");
		System.out.println("Relatorio");
		System.out.println("");
		System.out.println("Soma de Produtos");
		for(int i=0;i<3;i++) {
			System.out.println(linhaProd[i]+" - "+somaProd[i]);
		}
		System.out.println("");
		for(int i=0;i<3;i++) {
			System.out.println(meses[i]+" - "+somaMes[i]);
		}
	}
}
