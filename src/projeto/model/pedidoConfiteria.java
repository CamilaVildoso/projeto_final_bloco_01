package projeto.model;

public class pedidoConfiteria extends Pedido {
	
	private String fitFood;

	//contructor
	public pedidoConfiteria(int numero, String cliente, int tipo, int codigo, int quantidade, int precoTotal, String fitFood) {
		super(numero, cliente, tipo, codigo, quantidade, precoTotal);
		this.fitFood = fitFood;
	}

	//getter y setter
	public String isFitFood() {
		return fitFood;
	}

	public void setFitFood(String fitFood) {
		this.fitFood = fitFood;
	}
	
	public void elegirProductoFit(boolean quiereProductoFit) {
	       if (quiereProductoFit) {
	           this.fitFood = "Sí";
	        }else {
	           this.fitFood = "No";
	       }
	   }

}
