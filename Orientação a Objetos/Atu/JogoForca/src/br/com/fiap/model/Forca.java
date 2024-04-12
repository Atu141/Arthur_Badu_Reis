package br.com.fiap.model;
/**
 * 
 * @author Arthur Badu Reis 2SIPH
 * Classe responsavel pela criacao do Jogo da Forca
 * Ela pega a palavra a ser descoberta da classe 
 * Dicionario
 *
 */
public class Forca {

	private String palavra;
	private int maxErro;
	private int erro;
	// controla se devemos apresenta a letra
	// ou _ na tela
	private boolean[] mostra;

	/**
	 * Cosntrutor da calsse forca
	 * Construtor inicializa a palavra pegando do Dicionario
	 * Coloca o numero maximo de erro como 6
	 */
	public Forca() {
		this.maxErro = 6;

		Dicionario aurelio = new Dicionario();
		this.palavra = aurelio.getPalavra();

		this.mostra = new boolean[this.palavra.length()];
		this.chuta(' ');
		this.erro = 0;
	}

	public void chuta(char letra) {
		boolean encontrei = false;
		String palMin = palavra.toLowerCase();

		for (int i = 0; i < mostra.length; i++) {
			if(palMin.charAt(i) == letra) {
				mostra[i]= true;
				encontrei = true;
			}
		}
		if(!encontrei)
			this.erro++;

	}


	/**
	 * 
	 * @return retorna true se o usuario esgotar as chancer e false caso o contrario
	 * retiorna false
	 */
	public boolean enforcou() {
		return erro >= maxErro;
		//if (erro >= maxErro) {
		//return true;			
		//}else {
		//	return false;
		//}
	}

	public boolean acertou() {
		for(boolean b: mostra) {
			if (b == false)
				return false;
		}
		return true;
	}

	public String getPalavraAberta() {
		return palavra;
	}

	public String getPalavraFechada() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < mostra.length; i++) {
			if(mostra[i]) {
				sb.append(palavra.charAt(i));
				sb.append(' ');
			}else
				sb.append("_ ");

		}

		return sb.toString();
	}
	/**
	 * @return retorna o numero de erros cometidos
	 */
	public int getErro() {
		return erro;
	}



}