package Aula3.jogo.app;

import java.util.Scanner;

import Aula3.jogo.model.Adivinhar;

public class JogoAdivinhar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner tec = new Scanner(System.in); 
			Adivinhar jogo = new Adivinhar();
			int num;
			String resp;
			
			
		while(true) {
			System.out.println("Digite o numero: ");
			num = tec.nextInt();
			resp = jogo.chute(num);
			System.out.println(resp);
			if(resp.equalsIgnoreCase("Você acertou!")) {
				System.out.println(jogo.getTentativas() + " tentativas ");
				System.exit(0);
			}
			
			}
	}

}
