package projeto_final_bloco_01;
import java.util.*;
public class MenuPizza {
	
	 public static void exibirMenu() {
		 	System.out.println("+=====================Dornelas Pizza's  ====================+");
	        System.out.println("+=========================== Menu ==========================+");
	        System.out.println("  1. Cadastrar Produto                                      +");
	        System.out.println("  2. Listar todas os Produtos                               +");
	        System.out.println("  3. Buscar Produto por Numero                              +");
	        System.out.println("  4. Atualizar Produtos                                     +");
	        System.out.println("  5. Apagar Produto                                         +");
	        System.out.println("  6. Sair                                                   +");
	        System.out.println("+===========================================================+");
	        System.out.print("Escolha uma opção: ");

	    }
	public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);
	        int opcao;

	        while (true) {
	            exibirMenu();
	            try {
	                opcao = leia.nextInt();
	            } catch (InputMismatchException e) {
	                System.out.println("\nDigite Numeros de 1 a 6! ");
	                leia.nextLine();
	                opcao = 0;
	            }

	            if (opcao == 6) {
	                System.out.println("Saindo do sistema... Dornelas pizza's melhor que pizza hut!");
	                leia.close();
	                System.exit(0);
	            }

	            switch (opcao) {
	                case 1:
	                    System.out.println("Cadastrar Produto:");
	                    break;
	                case 2:
	                    System.out.println("Listar todas os Produtos:");
	                    break;
	                case 3:
	                    System.out.println("Buscar Produto por Numero:");
	                    break;
	                case 4:
	                    System.out.println("Atualizar Produtos:");
	                    break;
	                case 5:
	                    System.out.println("Apagar Produto:");
	                    break;
	                	default:
	                    System.out.println("Opção Inválida");
	            }
	        }
	    }
	}

