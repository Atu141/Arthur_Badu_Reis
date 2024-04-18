package br.com.fiap.app;

import java.util.Scanner;

import br.com.fiap.model.Forca;

public class jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tec = new Scanner(System.in);
		Forca f = new Forca();

		while(!f.enforcou() && !f.acertou()) {
			System.out.println(f.getPalavraFechada());
			System.out.print("Letra: ");
			char c = tec.nextLine().charAt(0);

			f.chuta(c);



		}

		if(f.enforcou()) {
			System.out.println("===============================");
			System.out.println("Perdeu: " + f.getPalavraAberta());
			System.out.println("===============================");
		}else {
			System.out.println("===============================");
			System.out.println("Parabéns você ganhou");
			System.out.println(f.getPalavraAberta());
			System.out.println("===============================");
		}
	}

}