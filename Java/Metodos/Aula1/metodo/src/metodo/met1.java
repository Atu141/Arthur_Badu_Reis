package metodo;

import java.util.Scanner;

public class met1 {

	//Global
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Charmar procedimento
		operacao();
		
		
	}//Main
	
	//METODOS
	
	//PROCEDIMENTO SEM RETORNO
	public static void operacao() {
		//VAR Local
		int num=0;
		System.out.println("Digite um numero");
		num=entrada.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		
	}//Main

}
