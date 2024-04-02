package ex3;

import java.util.Scanner;

import filas.FilaInt;

public class AtendeDuvidas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner le = new Scanner(System.in);
		
		FilaInt fila = new FilaInt();
		fila.init();
		
		int opcao = 0;
		do {
			System.out.println(" 1 - inserir o aluno na fila");
			System.out.println(" 2 - Atender o proximo da fila");
			System.out.println(" 3 - Encerrar Atendimento");
			
			opcao = le.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("RM: ");
				int rm = le.nextInt();
				break;
			case 2:
				if(!fila.isEmpty())
					System.out.println("Aluno a ser atendido agora "+ fila.dequeue());
				else
					System.out.println("Não ha alunos para Atender");
				break;
			case 3:
				if(!fila.isEmpty())
					System.out.println("Encerrando Atendimento");
				else
					System.out.println("Ainda ha alunos para Atender");
				opcao = 0;
				break;
			default:
				System.out.println("Opção Invalida");
			}
		}while(opcao != 3);
	}

}
