package projeto.controller;

import java.util.ArrayList;

import projeto.model.Pedido;
import projeto.repository.ProdutoRepository;

public class ProjetoController implements ProdutoRepository{
	
	private ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();
	
	int numero = 0;
	
	//metodo da interface
	@Override
	public void procurarPorNumero(int numero) {
		var pedido = buscarNaCollection(numero);
		
		if(pedido != null)
			pedido.visualizar();
		else
			System.out.println("\nA Pedido número: "+numero+" nao foi encontrada!");
	}
	
	@Override
	public void listarTodos() {
		for(var pedido : listaPedidos) {
			pedido.visualizar();
		}
	}
	
	@Override
	public void atualizar(Pedido pedido) {
		var buscaPedido = buscarNaCollection(pedido.getNumero());
		
		if (buscaPedido != null) {
			listaPedidos.set(listaPedidos.indexOf(buscaPedido), pedido);
			System.out.println("\nO pedido número: "+pedido.getNumero()+" foi atualizada com sucesso!");
		} else
			System.out.println("\nO pedido numero: "+pedido.getNumero()+" nao foi encontrada!");
	}
	
	@Override
	public void deletar(int numero) {
		var pedido = buscarNaCollection(numero);
		
		if(pedido != null) {
			if(listaPedidos.remove(pedido) == true)
				System.out.println("\nO pedido numero: "+numero+" foi deletada com sucesso!");
		}else
			System.out.println("\nO pedido numero: "+numero+" nao foi encontrada!");
		
	}
	
	//metodo auxiliar
	public int gerarNumero() {
		return ++ numero;
	}
	
	public Pedido buscarNaCollection(int numero) {
		for(var pedido : listaPedidos) {
			if (pedido.getCodigo() == numero) {
				return pedido;
			}
		}
		return null;
	}
		

}






