package dornelaspizzas.model;

public class pizzasDoces extends ProdutosDornelas {
	String sabor;
	public pizzasDoces (int tipo, String tamanho, String sabor, int numero) {
		super(tipo, tamanho, numero);
		this.sabor = sabor;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	@Override
	public void visualizar() {
		System.out.println("o sabor é" + this.sabor);
		
		
}
}
