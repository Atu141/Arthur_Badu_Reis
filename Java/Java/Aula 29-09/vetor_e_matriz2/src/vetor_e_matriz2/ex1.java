package vetor_e_matriz2;

import java.util.Scanner;

public class ex1 {
	
	static Scanner entrada = new Scanner(System.in);
	static int [] idade = new int[4];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] nomes = new String[4];
		
		for(int i=0;i<4;i++) {
			System.out.println("Digite o "+(i+1)+"° Nome");
			nomes[i]=entrada.next();
			System.out.println("Digite o "+(i+1)+"° Idade");
			idade[i]=entrada.nextInt();
		}
		String [] verifica = analise(nomes);
		
		relatorio(nomes, verifica);
		
	}//main
	
	public static String [] analise(String[] nomes) {
		
		String [] verifica = new String[4];
		
		
		for(int i = 0;i<4;i++) {
			if(idade[i]>=18) {
				verifica[i]="Permitida";
			}else {
				verifica[i]="Negada";
			}
		}
		
		return verifica;
				
	}

	public static void relatorio(String [] nomes,String [] verifica) {
		System.out.println("");
		System.out.println("Relatorio");
		for(int i =0;i<4;i++) {
			System.out.println(nomes[i]+" - "+idade[i]+" - "+verifica[i]);
		}
	}
}
