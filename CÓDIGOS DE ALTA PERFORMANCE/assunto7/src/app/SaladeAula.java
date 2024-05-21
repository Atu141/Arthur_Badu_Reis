package app;

import java.util.Scanner;

import entidades.Aluno;
import listas.ListaAlunos;

public class SaladeAula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner le = new Scanner(System.in);
		int opcao;
		ListaAlunos turma = new ListaAlunos();
		
		do {
			System.out.println("0 - sair");
			System.out.println("1 - inserir");
			System.out.println("2 - remover");
			opcao = le.nextInt();
			switch(opcao) {
			case 1:
				System.out.println("RM: ");
				int rm = le.nextInt();
				System.out.println("Média: ");
				double media = le.nextDouble();
				Aluno aluno = new Aluno(rm, media);
				turma.add(aluno);
				System.out.println("-----------------------");
				turma.show();
				System.out.println("-----------------------");
				break;
			case 2:
				System.out.println("Informe o Rm do Aluno a ser Removido: ");
				rm = le.nextInt();
				turma.remove(rm);
				System.out.println("-----------------------");
				turma.show();
				System.out.println("-----------------------");
				break;
			default:
				System.out.println("Opcao invalida");
			}
		}while(opcao !=0);
	}

}
