package br.com.fiap.orientacao.lista.app;

import br.com.fiap.orientacao.lista.model.Funcionario;
import br.com.fiap.orientacao.lista.model.Profissao;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario a = new Funcionario(99831, "Arthur");
		a.exibirDados();
		
		Profissao p = new Profissao(); 
		p.setNome("Estagiario");
		
		Funcionario g = new Funcionario(7264, "Patrik", p);
		g.exibirDados();
		
		
		
	}

}
