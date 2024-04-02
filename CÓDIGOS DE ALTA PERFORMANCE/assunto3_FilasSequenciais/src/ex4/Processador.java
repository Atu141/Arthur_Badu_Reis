package ex4;

import java.util.Scanner;

import filas.FilaInt;

public class Processador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner le = new Scanner(System.in);
		
		FilaInt filaProcessos = new FilaInt();
		filaProcessos.init();
		
		int opcao = 0;
		do {
			System.out.println("============================================");
			System.out.println(" 1 - Submete Processo");
			System.out.println(" 2 - Executa processo (ocupa processador)");
			System.out.println(" 3 - Shutdown");
			System.out.println("============================================");
			
			opcao = le.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("PID: ");
				int pid = le.nextInt();
				filaProcessos.enqueue(pid);
				break;
			case 2:
				if(!filaProcessos.isEmpty()) {
					pid = filaProcessos.dequeue();
					System.out.println("Processo em execução agora: " + pid);
					System.out.println("Processo "+ pid + "Foi concluido? (1 - Sim)");
					int resp = le.nextInt();
					if(resp == 1)
						System.out.println("Processo "+ pid + " Foi concluido");
				}else
					System.out.println("Não ha Processos para Atender");
				break;
			case 3:
				if(!filaProcessos.isEmpty()) {
					System.out.println("Ainda ha processos na fila");
					System.out.println("Deseja Encerrar todos os Processos? (1 - Sim):");
					int resp = le.nextInt();
					if (resp == 1) {
						while (!filaProcessos.isEmpty()) {
							System.out.println("Encerrando o Processo" + filaProcessos.dequeue());
						}
					}else
					opcao = 0;
				}
				break;
			default:
				System.out.println("Opção Invalida");
			}
		}while(opcao != 3);
		System.out.println("Shutdown ...");
	}

}
