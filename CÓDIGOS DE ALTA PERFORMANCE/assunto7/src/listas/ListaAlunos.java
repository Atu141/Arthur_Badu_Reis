package listas;

import entidades.Aluno;

public class ListaAlunos {

	private class NO {
		Aluno dado;
		NO prox;
	}

	public NO lista = null;

	public boolean isEmpty() {
		return (lista == null);
	}

	public void add(Aluno elem) {
		NO novo = new NO();
		novo.dado = elem;
		if (isEmpty()) {
			novo.prox = null;
			lista = novo;
		} else if (novo.dado.getRm() < lista.dado.getRm()) {
			novo.prox = lista;
			lista = novo;
		} else {
			NO aux = lista;
			boolean achou = false;
			while (aux.prox != null && !achou) {
				if (aux.prox.dado.getRm() < novo.dado.getRm())
					aux = aux.prox;
				else
					achou = true;
			}
			novo.prox = aux.prox;
			aux.prox = novo;
		}
	}

	public boolean remove(int valor) {
		boolean achou = false;
		if (!isEmpty()) {
			if (valor == lista.dado.getRm()) {
				lista = lista.prox;
				achou = true;
			} else {
				NO aux = lista;
				while (aux.prox != null && !achou) {
					if (aux.prox.dado.getRm() != valor)
						aux = aux.prox;
					else
						achou = true;
				}
				if (achou)
					aux.prox = aux.prox.prox;
			}
		}

		return achou;
	}

	public int contaNos() {
		int qtd = 0;
		NO aux = lista;
		while (aux != null) {
			qtd++;
			aux = aux.prox;
		}
		return qtd;
	}

	public void show() {
		NO aux = lista;
		System.out.println("********* Lista **********");
		while (aux != null) {
			System.out.println(aux.dado + "\t");
			aux = aux.prox;
		}
		System.out.println();
	}

	public void showGreaters(double limite) {
		NO aux = lista;
		System.out.println("********* Lista de Alunos com Media acima de " + limite + " **********");
		while (aux != null) {
			if (aux.dado.getMedia() > limite)
				System.out.print(aux.dado + "\t");
			aux = aux.prox;
		}
		System.out.println();
	}

}
