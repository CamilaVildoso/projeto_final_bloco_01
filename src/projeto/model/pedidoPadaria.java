package projeto.model;

import java.util.Scanner;

public class pedidoPadaria extends Pedido{
	
	private String tipoDeSacola;
	
	Scanner leia = new Scanner(System.in);

	//contructor
	public pedidoPadaria(int numero, String cliente, int tipo,int codigo, int quantidade, int precoTotal, String tipoDeSacola) {
		super(numero, cliente, tipo, codigo, quantidade, precoTotal);
		this.tipoDeSacola = tipoDeSacola;
	}

	public String getTipoDeSacola() {
		return tipoDeSacola;
	}

	public void setTipoDeSacola(String tipoDeSacola) {
		this.tipoDeSacola = tipoDeSacola;
	}
	
	public void escolher() {
		
		System.out.println("\nEscolha tipo de sacola: ");
		System.out.println("\nPapel");
		System.out.println("\nBiodegradável");
		tipoDeSacola = leia.nextLine();
		
		if(tipoDeSacola.equals("biodegradável")){
			System.out.println("\nSeu sacola é "+tipoDeSacola+", Obrigado por cuidar do planeta");
		}else {
			System.out.println("\nSeu sacola é "+tipoDeSacola);
		}
	}
	
	

}
