package robocop_gay;

import java.util.Scanner;

public class Um_tanto_quanto_masculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int[][] milhas = new int[4][5];
		int qtd = 1;

		for (int i = 0; i < 4; i++) {
			System.out.println("Informe o Codigo do" + qtd + "°cliente");
			milhas[i][0] = entrada.nextInt();
			System.out.println("Informe o Quantidade de Milhas");
			milhas[i][1] = entrada.nextInt();
			while ((milhas[i][2] != 1) && (milhas[i][2] != 2) && (milhas[i][2] != 3)) {
				System.out.println("Informe a categoraia 1/2/3");
				milhas[i][2] = entrada.nextInt();
			}
			if (milhas[i][2] == 1) {
				milhas[i][3] = 10000;
			} else {
				if (milhas[i][2] == 2) {
					milhas[i][3] = 5000;
				} else {
					if (milhas[i][2] == 3) {
						milhas[i][3] = 0;
					}
				}
			}

			milhas[i][4] = milhas[i][1] + milhas[i][3];
			qtd++;
		}
		for (int i = 0; i < 4; i++) {
			System.out.println("codigo " + milhas[i][0] + "\t Quantidade de Milhas" + milhas[i][1] + "\t Categoria"
					+ milhas[i][2] + "\t Bonus" + milhas[i][3] + "\t Milhagem Atual" + milhas[i][4]);
		}

	}

}
