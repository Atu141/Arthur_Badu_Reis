package ex5;

import java.util.Scanner;

import filas.FilaString;

public class Consultorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner le = new Scanner(System.in);
		
		FilaString fila = new FilaString();
		fila.init();
		
		int opcao = 0;
		do {
			System.out.println(" 1 - inserir o Paciente na fila");
			System.out.println(" 2 - Atender o proximo da fila");
			System.out.println(" 3 - Encerrar Atendimento");
			
			opcao = le.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("Nome: ");
				le.nextLine();
				String nome = le.nextLine();
				break;
			case 2:
				if(!fila.isEmpty())
					System.out.println("Paciente a ser atendido agora "+ fila.dequeue());
				else
					System.out.println("Não ha Paciente para Atender");
				break;
			case 3:
				if(!fila.isEmpty())
					System.out.println("Encerrando Atendimento");
				else
					System.out.println("Ainda ha Pacientes para Atender");
				opcao = 0;
				break;
			default:
				System.out.println("Opção Invalida");
			}
		}while(opcao != 3);
	}

}
