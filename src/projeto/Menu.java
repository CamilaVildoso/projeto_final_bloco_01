package projeto;

import java.util.Scanner;
import projeto.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
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
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     "+ Cores.TEXT_RESET);

			opcao = leia.nextInt();
			
			if (opcao == 7) {
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

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD+"\nBuscar produto por número:\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD+"\nAtualizar pedido:\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD+"\nApagar pedido:\n\n");

				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD+"\nPreco total:\n\n");

				break;
			
			default:
				System.out.println(Cores.TEXT_WHITE_BOLD+"\nOpção Inválida!\n");
				break;
		    }
	     }

     }

}
