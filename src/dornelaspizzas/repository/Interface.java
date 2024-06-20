package dornelaspizzas.repository;
import dornelaspizzas.model.ProdutosDornelas;
public interface Interface {
	
	void cadastro (ProdutosDornelas cadastro);
	void atualizar (ProdutosDornelas cadastro);
	void listarPizzas ();
	void apagar (int numero);
	
	  
}
