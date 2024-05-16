package br.com.fiap.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class RepositorioMensagem {

	private List<Mensagem> mensagens;
	
	public RepositorioMensagem() {
		this.mensagens = new ArrayList<>();
		
		carregamentoMensagens(mensagens);
	}
	
	private void carregamentoMensagens(List<Mensagem> dados) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:/dados.csv"));
			String linha = br.readLine();
			linha = br.readLine();
			while(linha !=null) {
				String[] campus = linha.split(";");
				Mensagem m = new Mensagem();
				m.setAssunto(campus[0]);
				m.setConteudo(campus[1]);
				m.setDestinatario(campus[2]);
				m.setRemetente(campus[3]);
				dados.add(m);
				
				linha = br.readLine();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
