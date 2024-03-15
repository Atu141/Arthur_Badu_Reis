package br.com.fiap.jogatina.model;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class TesteImpressao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\uD83C\uDCA1");
		System.out.println("\uD83C\uDCA2");
		System.out.println("\uD83C\uDCAA");
		System.out.println("\uD83C\uDCAB");
		
		UIManager.put("OptionPane.menssageFont", new 
				FontUIResource(new Font("Consola 0",  Font.PLAIN,  60)));
		
		JOptionPane.showMessageDialog(null, "\uD83C\uDCA1" );
		
		
	}

}
