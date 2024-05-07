package br.com.fiap.app;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

import br.com.fiap.model.Motorista;
import br.com.fiap.model.Veiculo;
import br.com.fiap.model.Viagem;

public class Aplicacao {

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);

//Arthur Badu Reis RM - 99831
//Rafael Jun Miura RM - 98845
		Veiculo [] automovel = new Veiculo[5];
		Motorista  [] piloto = new Motorista[5];
		Viagem jornada = new Viagem();
		
		automovel[0] = new Veiculo("ABC1234", "Jetta", "Volkswagen", 2024);
		automovel[1] = new Veiculo("DEF5678", "Uno", "Fiat", 2018);
		automovel[2] = new Veiculo("GHI9012", "Kicks", "Nissan", 2022);
		automovel[3] = new Veiculo("RJM2004", "Civic", "Honda", 2024);
		automovel[4] = new Veiculo("ABR2005", "Charger", "Dodge", 2023);
		
		piloto[0] = new Motorista("José", "001", 98746655, "5401", "B");
		piloto[1] = new Motorista("Eduardo", "005", 97321046, "0235", "B");
		piloto[2] = new Motorista("João", "888", 99875446, "6589", "AB");
		piloto[3] = new Motorista("Pelé", "1010", 95231694, "8710", "B");
		piloto[4] = new Motorista("Maradona", "0010", 98854475,"6895", "AB");
		
		
		System.out.println("Informe o nome do Passageiro: ");
		jornada.setCliente(e.nextLine());
		
		jornada.setData(LocalDate.now());
		
		System.out.println("Coloque o Ponto de Origem");
		jornada.setOrigem(e.nextLine());
		jornada.getOrigem();
		
		System.out.println("Coloque o Ponto de Destino: ");
		jornada.setDestino(e.nextLine());
		jornada.getDestino();
		
		

		System.out.println("Escolha a forma de Pagamento:");
		System.out.println("[1] Dinheiro  [2] Cartão  [3] Pix");
		int escolha = e.nextInt();
		
		if(escolha == 1) {
			jornada.setFormaPagamento("Dinheiro");
		}else if(escolha == 2) {
			jornada.setFormaPagamento("Cartão");
		}else if(escolha == 3) {
			jornada.setFormaPagamento("Pix");
		}
		
		double valor = Math.random() * 25;
		jornada.setValor(valor);
		System.out.println("O valor da Corrida ficou: " + jornada.getValor() );
		System.out.println("");
		System.out.println("Motoristas Disponiveis: ");
		for(int i = 0;i<5;i++) {
			System.out.println("Motorista "+" ["+(i+1)+"] " +" "+ piloto[i] + "\t" + automovel[i] );
			System.out.println("------------------------------------------------");
		}
		System.out.println(" ");
		System.out.println("Aperte o Número do Motorista: ");
		
		int aux = e.nextInt();
		System.out.println("");
		if(aux == 1) {
			System.out.println("Relatório da Viagem");
			System.out.println("Data da viagem " + jornada.getData());
			System.out.println("Origem da viagem " + jornada.getOrigem());
			System.out.println("Destino da viagem " + jornada.getDestino());
			System.out.println("Valor da viagem " + jornada.getValor());
			System.out.println("Forma de pagamento " + jornada.getFormaPagamento());
			System.out.println(automovel[0] + "\t" + piloto[0]);
			
		}else if(aux == 2) {
			System.out.println("Relatório da Viagem");
			System.out.println("Data da viagem " + jornada.getData());
			System.out.println("Origem da viagem " + jornada.getOrigem());
			System.out.println("Destino da viagem " + jornada.getDestino());
			System.out.println("Valor da viagem " + jornada.getValor());
			System.out.println("Forma de pagamento " + jornada.getFormaPagamento());
			System.out.println(automovel[1] + "\t" + piloto[1]);
		}else if(aux == 3) {
			System.out.println("Relatório da Viagem");
			System.out.println("Data da viagem " + jornada.getData());
			System.out.println("Origem da viagem " + jornada.getOrigem());
			System.out.println("Destino da viagem " + jornada.getDestino());
			System.out.println("Valor da viagem " + jornada.getValor());
			System.out.println("Forma de pagamento " + jornada.getFormaPagamento());
			System.out.println(automovel[2] + "\t" + piloto[2]);
		}else if(aux == 4) {
			System.out.println("Relatório da Viagem");
			System.out.println("Data da viagem " + jornada.getData());
			System.out.println("Origem da viagem " + jornada.getOrigem());
			System.out.println("Destino da viagem " + jornada.getDestino());
			System.out.println("Valor da viagem " + jornada.getValor());
			System.out.println("Forma de pagamento " + jornada.getFormaPagamento());
			System.out.println(automovel[3] + "\t" + piloto[3]);
		}else if(aux == 5) {
			System.out.println("Relatório da Viagem");
			System.out.println("Data da viagem " + jornada.getData());
			System.out.println("Origem da viagem " + jornada.getOrigem());
			System.out.println("Destino da viagem " + jornada.getDestino());
			System.out.println("Valor da viagem " + jornada.getValor());
			System.out.println("Forma de pagamento " + jornada.getFormaPagamento());
			System.out.println(automovel[5] + "\t" + piloto[5]);
		}
	}

}
