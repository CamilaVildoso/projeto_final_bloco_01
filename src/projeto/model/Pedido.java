package projeto.model;

import java.util.Scanner;


public abstract class Pedido {
	
	private String cliente;
	private int tipo;
	private int quantidade;
	private int codigo;
	private int precoTotal;
	private int numero;

	Scanner leia = new Scanner(System.in);
	
	//contructor
	public Pedido(int numero,String cliente, int tipo, int codigo, int quantidade, int precoTotal) {
		this.cliente = cliente;
		this.tipo = tipo;
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.precoTotal = precoTotal;
		this.numero = numero;
	}


	//getter y setter

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public float getPrecoTotal() {
		return precoTotal;
	}


	public void setPrecoTotal(int precoTotal) {
		this.precoTotal = precoTotal;
	}	
	
	
	//metodo abstracto
	public void visualizar() {
			String tipo = "";
				
				switch(this.tipo) {
				case 1:
					tipo = "Padaria";
					break;
				
				case 2:
					tipo = "Confiteria";
					break;
					}
				System.out.println("\n\n***********************************************************");
				System.out.println("Dados do Pedido:");
				System.out.println("\n\n***********************************************************");
				System.out.println("Nome Cliente: " + this.cliente);
				System.out.println("Setor: " + tipo);
				System.out.println("\n\n***********************************************************");
				System.out.println("\n\t\tProdutos:");
				System.out.println("\n1- Bolo de chocolate");
				System.out.println("\n2- Bolo de laranja");
				System.out.println("\n3- Brigadeiros");
				System.out.println("\n4- Pão integral");
				System.out.println("\n5- Pão de queijo");
				System.out.println("\n6- Pão branco");
				System.out.print("\nCódigo do producto: ");
				codigo = leia.nextInt();
				
				System.out.print("\nDigite a quantidade : ");
			    quantidade = leia.nextInt();
			    
			    switch(codigo) {
				case 1:
					System.out.println("\nBolo de chocolate");
					precoTotal = quantidade*80;
					System.out.println("\nValor total: R$ "+precoTotal);
					break;
				case 2:
					System.out.println("\nBolo de laranja");
					precoTotal = quantidade*60;
					System.out.println("\nValor total: R$ "+precoTotal);
					break;
				case 3:
					System.out.println("\nBrigadeiros");
					precoTotal = quantidade*2;
					System.out.println("\nValor total: R$ "+precoTotal);
					break;
				case 4:
					System.out.println("\nPão integral");
					precoTotal = quantidade*1;
					System.out.println("\nValor total: R$ "+precoTotal);
					break;
				case 5:
					System.out.println("\nPão de queijo");
					precoTotal = quantidade*2;
					System.out.println("\nValor total: R$ "+precoTotal);
					break;
				case 6:
					System.out.println("\nPão branco");
					precoTotal = quantidade*2;
					System.out.println("\nValor total: R$ "+precoTotal);
					break;
				    default:
				    	System.out.println("\nOpcao Inválida!!!");
				
				}
				
	}


	public int getSetor() {
		return 0;
	}

}
