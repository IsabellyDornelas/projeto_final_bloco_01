package dornelaspizzas.controller;

import java.util.ArrayList;

import dornelaspizzas.model.ProdutosDornelas;
import dornelaspizzas.repository.Interface;

public class DornelasController implements Interface {
	private ArrayList <ProdutosDornelas> listaDePizzas = new ArrayList <>();
	int numero = 0;
	@Override
	public void cadastro(ProdutosDornelas cadastro) {
		listaDePizzas.add(cadastro);
		System.out.println("a pizza numero:" + cadastro.getNumero() + " foi criada com sucesso!");
		
	}

	@Override
	public void atualizar(ProdutosDornelas cadastro) {
		var buscarCadastro = buscarNaLista(cadastro.getNumero());
		if (buscarCadastro != null) {
			listaDePizzas.set(listaDePizzas.indexOf(buscarCadastro), cadastro);
			System.out.println("a pizza numero: " + cadastro.getNumero()+ "foi atualizado com sucesso!");	
		} else {
			System.out.println("a pizza numero: " + cadastro.getNumero()+ "não foi encontrado!");
		}
		
		
	}

	@Override
	public void listarPizzas() {
		for (var cadastro : listaDePizzas ) {
			cadastro.visualizar();
		}
		
	}

	@Override
	public void apagar(int numero) {
		var cadastro = buscarNaLista(numero);
		if (cadastro != null ) {
			if (listaDePizzas.remove(cadastro)) {
				System.out.println("a pizza numero" + cadastro.getNumero()+ " foi excluido com sucesso!");
			}
		}else {
			System.out.println("a pizza numero" + cadastro.getNumero()+ " não foi encontrado!");
		}
		
	}
	public ProdutosDornelas buscarNaLista(int numero) {
		for (var cadastro: listaDePizzas) {
			if (cadastro.getNumero() == numero) {
				return cadastro;
				
			}
		}
		return null;
	
	}
	public int GerarNumero() {
		return ++ numero;
		
	}
}
