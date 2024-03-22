package br.com.fiap.model;

public class CaixaSupermercado {

	private long id;
	private String cpf;
	private double imposto;
	private double total;
	private int quantidade;
	
	private String cuponFiscal;
	
	public void adiciona(int qtd, double valorUnitario, String produto) {
		this.quantidade = this.quantidade + qtd;
		this.total =  this.total +  (qtd * valorUnitario);
		
		String linha = String.format("%s \t %d X %.2f \t %.2f", produto, qtd, valorUnitario, qtd*valorUnitario);
		this.cuponFiscal = this.cuponFiscal +"\n" + linha;
	
	}
	
	public void adiciona(int qtd, double valorUnitario, String produto, String clasificacao) {
		this.adiciona(qtd, valorUnitario, produto);
		
		double aux = qtd* valorUnitario;
		double aliquota = 0;
		
		if(clasificacao.equals("alimento")) {
			aliquota = 3;
		}else if(clasificacao.equals("limpeza")) {
			aliquota = 5;
		}else if(clasificacao.equals("higiene")) {
			aliquota = 4;
		}else if(clasificacao.equals("fumo")) {
			aliquota = 9;
		}else if(clasificacao.equals("bebidas")) {
			aliquota = 8;
		}else if(clasificacao.equals("outros")) {
			aliquota = 10;
		}
		
		this.imposto = this.imposto + aux * aliquota /100;
	}
	
	public long getId() {
		return id;
	}

	public String getCuponFiscal() {
		return cuponFiscal;
	}

	public CaixaSupermercado(String cpf) {
		this.cpf = cpf;
		this.imposto =0;
		this.total = 0;
		this.quantidade = 0;
		this.cuponFiscal = "Super Fiap";
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getImposto() {
		return imposto;
	}
	public double getTotal() {
		return total;
	}
	public int getQuantidade() {
		return quantidade;
	}
	
	
}
