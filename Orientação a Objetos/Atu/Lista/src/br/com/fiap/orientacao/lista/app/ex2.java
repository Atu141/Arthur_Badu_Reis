package br.com.fiap.orientacao.lista.app;

import br.com.fiap.orientacao.lista.model.Endereco;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Endereco um = new Endereco(03555024, "São Paulo", 1245, "Paulista");
		Endereco dois = new Endereco(1250084, "Piaui", 256, "Capão Redondo");
		Endereco tres = new Endereco(6985005, "New York", 1109, "New York");
		
		System.out.println("Endereço um: " + um.getCep() +" "+ um.getBairro() + " "+ um.getNumero() + " "+ um.getCidade());
		System.out.println("Endereço dois: " + dois.getCep() +" "+ dois.getBairro() + " "+ dois.getNumero() + " "+ dois.getCidade());
		System.out.println("Endereço tres: " + tres.getCep() +" "+ tres.getBairro() + " "+ tres.getNumero() + " "+ tres.getCidade());
		
	}

}
