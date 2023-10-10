package sla;

import java.util.Scanner;

public class sla3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		double dist[][] = new double[5][5]; 
		String cidades [] = new String [] {"Campinas","Bauru","Sorocaba","Atibaia","Santos"};
		
		double consumoVeiculo=0,qtdCombustivel=0;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				
				if(i==j){
					dist[i][j]=0;
				}else {
					System.out.print("Informe a Distancia entre a Cidade ("+cidades[i]+") e ("+cidades[j]+"):");
					dist[i][j]=entrada.nextDouble();
				}
			}
		}
		
		System.out.println("");
		System.out.println("Consimo de Combustivel");
		System.out.println("Informe o Consumo do Veículo");
		consumoVeiculo=entrada.nextDouble();
		
		
		System.out.println("");
		System.out.println("Percursos Menores que 250KM");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(dist[i][j]<250) {
					System.out.println("Distancia:"+dist[i][j]+"\t km - entre cidades ("+ cidades[i]+") e ("+cidades[j]+")");
				}
			}
		}
		
	}
	
	
	

}
