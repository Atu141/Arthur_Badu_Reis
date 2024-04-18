package br.com.fiap.app;

import javax.swing.JOptionPane;

import br.com.fiap.model.Forca;

public class JogoGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Forca f = new Forca();
		
		while(!f.acertou() && !f.enforcou()) {
		String msg = f.getPalavraFechada() + "\nErros: " + f.getErro();
				String s = JOptionPane.showInputDialog(null, msg,
					"Jogo da Forca", JOptionPane.INFORMATION_MESSAGE);
				f.chuta(s.toLowerCase().charAt(0));
		}
		if(f.acertou()) {
			JOptionPane.showMessageDialog(null, "Parabens, a palavre era: "+ f.getPalavraAberta());
		}else {
			JOptionPane.showMessageDialog(null, "Errou, a palavre era: "+ f.getPalavraAberta());
		}
	
	
	}
		

}
