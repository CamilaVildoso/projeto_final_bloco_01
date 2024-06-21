package projeto;
import java.util.Scanner;
import projeto.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
=======
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import projeto.controller.ProjetoController;
import projeto.model.Pedido;
import projeto.model.pedidoConfiteria;
import projeto.model.pedidoPadaria;
import projeto.util.Cores;


public class Menu {

	public static void main(String[] args, int numero) {
		
		Scanner leia = new Scanner(System.in);
		String cliente, tipoDeSacola;
		int opcao = 0, setor, tipo, quantidade = 0,codigo = 0, precoTotal = 0, preco;
		String fitFood;
		
		List<Pedido> listaProdutos = new ArrayList<>();
		int[] precosPadaria = {1, 2, 2}; 
        int[] precosConfeitaria = {80, 60, 2};
        
		ProjetoController pedido = new ProjetoController();
		
        Pedido p1 = new pedidoPadaria (pedido.gerarNumero(),"Camila", 1, 1, 10, 10, "papel");
        Pedido p2 = new pedidoConfiteria (pedido.gerarNumero(),"Thiago", 2, 3, 2, 10, "si");
        
        
>>>>>>> Model_Repository
		while (true) {

			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_WHITE_BACKGROUND +"*****************************************************");
			System.out.println("                                                     ");
			System.out.println("             PADARIA & CONFEITARIA L'DOCE            ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar pedido online                  ");
			System.out.println("            2 - Listar os produtos                   ");
			System.out.println("            3 - Buscar produto por numero            ");
			System.out.println("            4 - Atualizar pedido                     ");
			System.out.println("            5 - Apagar pedido                        ");
			System.out.println("            6 - preco total                          ");
			System.out.println("            7 - Sair                                 ");
			System.out.println("            4 - Atualizar pedido                    ");
			System.out.println("            5 - Apagar pedido                        ");
			System.out.println("            6 - Sair                                 ");
>>>>>>> Model_Repository
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     "+ Cores.TEXT_RESET);

			opcao = leia.nextInt();
			
			if (opcao == 7) {
			try {
				opcao = leia.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			
			
			if (opcao == 6) {
>>>>>>> Model_Repository
				System.out.println(Cores.TEXT_WHITE_BOLD+"\nPADARIA & CONFEITARIA L'DOCE- Com cada mordida um pedacinho do céu...");
				
                 leia.close();
				System.exit(0);
			}
			

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD+"\nCriar pedido:\n\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD+"\nListar os produtos:\n\n");
			//As opcoes de meu Menu
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD+"\n\n***********************************************************");
				System.out.println("Dados do Pedido:");
				System.out.println("\n\n***********************************************************");
				System.out.println("Digite o nome do cliente: ");
				leia.skip("\\R?");
				cliente = leia.nextLine();
				
				do {
				System.out.println("Digite o tipo de Setor (1-Padaria ou 2-Confiteria: ");
				setor = leia.nextInt();
				}while(setor < 1 && setor > 2);
				
				
				if (setor == 1) {
                  System.out.println("\n\t\tProdutos da Padaria:");
                  System.out.println("\n1- Pão integral");
                  System.out.println("\n2- Pão de queijo");
                  System.out.println("\n3- Pão branco");
	              }else {
	                  System.out.println("\n\t\tProdutos da Confeitaria:");
	                  System.out.println("\n4- Bolo de chocolate");
	                  System.out.println("\n5- Bolo de laranja");
	                  System.out.println("\n6- Brigadeiros");
	              }
	
                System.out.print("\nCódigo do produto: ");
                codigo = leia.nextInt();
                System.out.print("\nDigite a quantidade: ");
                quantidade = leia.nextInt();
                
                
                
                if (setor == 1) {
                    if (codigo >= 1 && codigo <= 3) {
                        preco = precosPadaria[codigo - 1];
                    } else {
                        System.out.println("Código do produto inválido!");
                        return;
                    }
                } else {
                    if (codigo >= 4 && codigo <= 6) {
                        preco = precosConfeitaria[codigo - 1];
                    } else {
                        System.out.println("Código do produto inválido!");
                        return;
                    }
                }
                
                precoTotal = quantidade*preco;
                System.out.printf("O total a pagar é: "+precoTotal);
                
                if(setor == 1) {
                	System.out.println("\nEscolha tipo de sacola: ");
            		System.out.println("\nPapel");
            		System.out.println("\nBiodegradável");
            		tipoDeSacola = leia.nextLine();
            		
            		if(tipoDeSacola.equals("biodegradável")){
            			System.out.println("\nSeu sacola é "+tipoDeSacola+", Obrigado por cuidar do planeta");
            		}else {
            			System.out.println("\nSeu sacola é "+tipoDeSacola);
            		}
                }else {
                	System.out.println("\nDeseja um produto fit? ");
                	fitFood = leia.nextLine();
                	if(fitFood.equals("Si")){
            			System.out.println("\nSeu produto é fit");
            		}else {
            			System.out.println("\nSeu produto não é fit ");
                }
                	}
				
				keyPress();
				break;
				
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD+"\nListar os produtos:\n\n");

				pedido.listarTodos();
				keyPress();
>>>>>>> Model_Repository
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD+"\nBuscar produto por número:\n\n");


				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD+"\nAtualizar pedido:\n\n");

				System.out.println("Digite o número de produto: ");
				codigo = leia.nextInt();
				
				pedido.procurarPorNumero(codigo);
				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD+"\nAtualizar pedido:\n\n");
				System.out.println("Digite o número da conta: ");
				numero = leia.nextInt();
				
				var buscaPedido = pedido.buscarNaCollection(numero);
				
				if (buscaPedido != null) {

					System.out.println("Digite o Nome do Cliente: ");
					leia.skip("\\R?");
					cliente = leia.nextLine();

					tipo = buscaPedido.getTipo();

					switch (tipo) {
						case 1 -> {
							System.out.println("Digite seu tipo de sacola: ");
							tipoDeSacola = leia.nextLine();
							pedido.atualizar(new pedidoPadaria(numero, cliente, tipo, codigo, quantidade, precoTotal, tipoDeSacola));
						}
						case 2 -> {
							System.out.println("Digit se deseja que seu produto seja Fit: ");
							fitFood = leia.nextLine();
							pedido.atualizar(new pedidoConfiteria(numero, cliente, tipo, codigo, quantidade, precoTotal,fitFood));
						}
						default -> {
							System.out.println("Opção inválida!");
						}
					}

				} else
					System.out.println("\nPedido não encontrado!");
				
				keyPress();
>>>>>>> Model_Repository
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD+"\nApagar pedido:\n\n");


				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD+"\nPreco total:\n\n");

				System.out.println("Digite o Numero de Pedido: ");
				numero = leia.nextInt();
				
				pedido.deletar(numero);
				keyPress();
>>>>>>> Model_Repository
				break;
			
			default:
				System.out.println(Cores.TEXT_WHITE_BOLD+"\nOpção Inválida!\n");

				break;
		    }
	     }

     }

				
				keyPress();
				break;
		    }
	     }
		
	}

     
	
	public static void keyPress(){
		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
>>>>>>> Model_Repository

}
