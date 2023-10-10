package Lista;

import java.util.Scanner;

public class ex6 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] sexo = genero();
		char [] olho = cor();
		char [] cabelos = cabelo();
		int [] idade = idadeX();
		
		
		
		double medIdade = mediaIdade(olho,cabelos,idade);
		double maiorIdade = maiorIdade(idade);
		qtdIndF(sexo,olho,cabelos,idade);
	}
	
	public static char [] genero(){
		char [] sexo = new char[5];
		for(int i = 0;i<5;i++) {
			System.out.println("Informe o Genero do "+(i+1)+"° Habitante:");
			System.out.println("M - Masxulino --- F - Feminino:");
			sexo[i]=Character.toUpperCase(entrada.next().charAt(0));
			while((sexo[i] !='M')&&(sexo[i] !='F')) {
				System.out.println("Genero Incopativel. Informe a correta:");
				System.out.println("M - Masxulino --- F - Feminino:");
				sexo[i]=Character.toUpperCase(entrada.next().charAt(0));
			}
		}
		return sexo;
	
	}
	
	public static char [] cor() {
		char [] olho = new char[5];
		for(int i = 0;i<5;i++) {
			System.out.println("Informe a Cor do olho do "+(i+1)+"° Habitante:");
			System.out.println("A - Azul --- C - Castanho:");
			olho[i]=Character.toUpperCase(entrada.next().charAt(0));
			
			while((olho[i] !='A')&&(olho[i] !='C')) {
				System.out.println("Cor Incopativel. Informe a correta:");
				System.out.println("A - Azul --- C - Castanho:");
				olho[i]=Character.toUpperCase(entrada.next().charAt(0));
			}
		}
		return olho;
	}

	public static char [] cabelo() {
		char [] cabelos = new char[5];
		for(int i = 0;i<5;i++) {
			System.out.println("Informe a Cor dos Cabelos do "+(i+1)+"° Habitante:");
			System.out.println("L - Loiros --- P - Pretos --- C - Castanhos:");
			cabelos[i]=Character.toUpperCase(entrada.next().charAt(0));
			
			while((cabelos[i] !='L')&&(cabelos[i] !='P')&&(cabelos[i] !='C')) {
				System.out.println("Cor Incopativel. Informe a correta:");
				System.out.println("L - Loiros --- P - Pretos --- C - Castanhos:");
				cabelos[i]=Character.toUpperCase(entrada.next().charAt(0));
			}
		}
		return cabelos;
	}
	
	public static int [] idadeX() {
	
		int [] idade = new int [5];
		
		for(int i = 0;i<5;i++) {
			System.out.println("Informe a Idade do "+(i+1)+"° Habitante:");
			idade[i]=entrada.nextInt();
		}
		return idade;
	}

	public static double mediaIdade(char []olho, char[]cabelos, int [] idade) {
		double medIdade = 0;
		int ctl = 0;
		for(int i = 0;i<5;i++) {
			if(cabelos[i] == 'P' && olho[i] == 'C' ) {
				medIdade += idade[i];
				ctl++;
			}
		medIdade = medIdade/ctl;	
		}
		
		return medIdade;
	}

	public static double maiorIdade(int [] idade){
		double maiorIdade =0;
		for(int i=0;i<5;i++) {
			if(idade[i]<0) {
				maiorIdade = idade[i];
			}else if(idade[i]>maiorIdade) {
				maiorIdade = idade[i];
			}
		}
		
		return maiorIdade;
	}

	public static int qtdIndF(char[]sexo,char[]olho,char[]cabelos,int[]idades) {
		int qtdF =0;
		
		for(int i=0;i<5;i++) {
			if(sexo[i] == 'F' && olho[i] == 'A' && cabelos[i] =='l' && (idades[i]>18||idades[i]<35)) {
				qtdF++;
			}
		}
		return qtdF;
	}
}