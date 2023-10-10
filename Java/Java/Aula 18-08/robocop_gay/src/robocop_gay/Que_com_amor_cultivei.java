package robocop_gay;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Que_com_amor_cultivei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		DecimalFormat numF = new DecimalFormat("#,##0.00");

		String[] produtos = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "J", "L", "M" };
		String[] loja = new String[] { "LojaA", "LojaB", "LojaC", "LojaD", "LojaE" };
		double[][] preco = new double[12][5];
		double maiorValor = 0, menorValor = 0;
		int maiorProduto = 0, menorProduto = 0, maiorLoja = 0, menorLoja = 0;

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 5; j++) {
				preco[i][j] = (double) (Math.random() * 200);
				if (i == 0 && j == 0) {

					maiorValor = preco[i][j];
					maiorProduto = i;
					maiorLoja = j;

					menorValor = preco[i][j];
					menorProduto = i;
					menorLoja = j;

				} else {
					if (preco[i][j] > maiorValor) {
						maiorValor = preco[i][j];
						maiorProduto = i;
						maiorLoja = j;
					}
					if (preco[i][j] < menorValor) {
						menorValor = preco[i][j];
						menorProduto = i;
						menorLoja = j;
					}

				}
			}
		}

		System.out.println("");
		System.out.println("Matriz Preços");
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(numF.format(preco[i][j]) + "\t");
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("Maior e menor Valor");
		System.out.println("");
		System.out.println("Produto mais Barato: "+produtos[menorProduto]);
		System.out.println("Loja: "+loja[menorLoja]);
		System.out.println("Preço: "+numF.format(menorValor));
		System.out.println("");
		System.out.println("Produto mais Barato: "+produtos[maiorProduto]);
		System.out.println("Loja: "+loja[maiorLoja]);
		System.out.println("Preço: "+numF.format(menorLoja));
		
		
		
		

	}

}
