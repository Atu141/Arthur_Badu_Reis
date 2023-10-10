package metodo;

import java.util.Scanner;

public class met5 {

	static Scanner entrada = new Scanner(System.in);
	//Var Global
	static String nome;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salario=0;
		int tempo=0;
		double reajuste=0,novoSalario=0;
		
		System.out.println("Digite o Nome: ");
		nome=entrada.next();
		System.out.println("Digite o Tempo de Empresa:");
		tempo=entrada.nextInt();
		System.out.println("Digite o Salario: ");
		salario=entrada.nextDouble();
		
		//Chamada Função
		reajuste=verifica(tempo,salario);
		
		novoSalario=calculo(reajuste,salario);
		System.out.println("Salario:"+salario+" - Salario Reajsutado: "+novoSalario);
		}//main
	
	public static double verifica(int tempo,double salario) {
		double reajuste=0;
		
		if(salario <500 && tempo>10) {
			reajuste=0.20;
		}else {
			reajuste=0.10;
		}
		
		return reajuste;
	}

	public static double calculo(double reajuste,double salario){

		double novoSalario=0;
		
		novoSalario=salario+(salario*reajuste);
		
		return novoSalario;
	}
}
