package projeto.repository;

import projeto.model.Pedido;

public interface ProdutoRepository {

	//CRUD 
	public void procurarPorNumero(int numero);
	public void listarTodos();
	public void atualizar(Pedido produto);
	public void deletar(int numero);
}
