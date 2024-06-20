package projeto_final_bloco_01;
import java.util.*;

import dornelaspizzas.controller.DornelasController;
import dornelaspizzas.model.pizzasDoces;
import dornelaspizzas.model.pizzasSalgadas;
public class MenuPizza {

 public static void exibirMenu() {
 System.out.println("+=====================Dornelas Pizza's  ====================+");
        System.out.println("+=========================== Menu ==========================+");
        System.out.println("  1. Listar Pizzas                                          +");
        System.out.println("  2. Adicionar Pizza                                        +");
        System.out.println("  3. Excluir Pizza                                          +");
        System.out.println("  4. Atualizar Pizzas                                       +");
        System.out.println("  5. Sair                                                   +");
        System.out.println("+===========================================================+");
        System.out.print("Escolha uma opção: ");

    }
public static void main(String[] args) {
 Scanner leia = new Scanner(System.in);
        int opcao, tipo, numero = 0;
        String tamanho, sabor;
        DornelasController cadastro = new DornelasController();

        while (true) {
            exibirMenu();
            try {
                opcao = leia.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nDigite Numeros de 1 a 4! ");
                leia.nextLine();
                opcao = 0;
            }

            if (opcao == 5) {
                System.out.println("Saindo do sistema... Dornelas pizza's melhor que pizza hut!");
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    System.out.println("Listar Pizzas:");
                    cadastro.listarPizzas();
                    break;
                case 2:
                    System.out.println("Adicionar Pizza:");
                    System.out.println("digite o tipo de pizza que você deseja 1- DOCE 2-SALGADA");
                    tipo = leia.nextInt();
                    System.out.println("digite o tamanho:");
                    tamanho = leia.nextLine();
                    switch(tipo) {
                    case 1:
                    	System.out.println("qual o sabor da sua pizza doce: ");
                    	sabor = leia.nextLine();
                    	cadastro.cadastro(new pizzasDoces(tipo, tamanho, sabor, numero)); 
                    	break;
                    case 2:
                    	System.out.println("qual o sabor da sua pizza salgada: ");
                    	sabor = leia.nextLine();
                    	cadastro.cadastro(new pizzasSalgadas(tipo, tamanho, sabor, numero)); 
                    	break;
                    
                    }
                    
                    break;
                case 3:
                	
                    System.out.println("Excluir Pizza :");
                    System.out.println("digite o numero da sua pizza" );
                    numero = leia.nextInt();
                    cadastro.apagar(numero);
                    break;
                case 4:
                    System.out.println("Atualizar pizza :");    
                    System.out.println("digite o numero da pizza :");
                    numero = leia.nextInt();
                    var buscarCadastro = cadastro.buscarNaLista(numero);
                    if(buscarCadastro != null) {
                    	tipo = buscarCadastro.getTipo();
                    	System.out.println("digite o tamanho da sua pizza: ");
                    	tamanho = leia.nextLine();
                    
                    	switch (tipo) {
                    	case 1:
                    		System.out.println("qual o sabor da sua pizza doce: ");
                        	sabor = leia.nextLine();
                        	cadastro.cadastro(new pizzasDoces(tipo, tamanho, sabor, numero)); 
                        	break;
                        case 2:
                        	System.out.println("qual o sabor da sua pizza salgada: ");
                        	sabor = leia.nextLine();
                        	cadastro.cadastro(new pizzasSalgadas(tipo, tamanho, sabor, numero)); 
                        	break;
                    	}
                    	
                    }
               
                    break;
                 
                default:
                    System.out.println("Opção Inválida");
            }
        }
    }
}
