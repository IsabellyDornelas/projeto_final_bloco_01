package dornelaspizzas.model;

public abstract class ProdutosDornelas {
	private int tipo,numero;
	private String tamanho;
	
	public ProdutosDornelas(int tipo, String tamanho, int numero) {
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.numero = numero;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void visualizar() {
		System.out.println("a pizza" + tipo);
		System.out.println("o tamanho" + this.tamanho);
		
	}
	
	
}
