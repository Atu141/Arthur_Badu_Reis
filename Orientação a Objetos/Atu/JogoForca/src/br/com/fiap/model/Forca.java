package br.com.fiap.model;

public class Forca {

	private String palavra;
	private int maxErro;
	private int erro;
	
	public void Forca() {
		maxErro = 6;
		
		Dicionario aurelio = new Dicionario();
		
		palavra = aurelio.getPalavra();
		
		
	}

	public void chuta(char letra) {
		if(letra != palavra.charAt(0)) {
			erro++;
		}
	}
	
	public boolean enforcou() {
		if (maxErro == erro) {
			return true;			
		}else {
			return false;
		}
	}
	
	public boolean acertou() {
		return true;
	}
	
	public String getPalavraAberta() {
		System.out.println("================");
		System.out.println("Parabens Acertou");
		System.out.println("================");
		return palavra;
	}
	
	public String getPalavraFechada() {
		System.out.println("==================");
		System.out.println("Que pena Errou :( ");
		System.out.println("==================");

		return palavra;
	}

	public int getErro() {
		return erro;
	}
	
	
	
}
