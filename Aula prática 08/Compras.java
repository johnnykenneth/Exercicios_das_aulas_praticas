import java.util.ArrayList;
import java.util.Scanner;

public class Compras{

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n======= MENU =======");
            System.out.println("1 - Adicionar item");
            System.out.println("2 - Listar itens");
            System.out.println("3 - Remover item");
            System.out.println("0 - Sair");
            System.out.println("====================\n");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o item: ");
                    String item = scanner.nextLine();
                    lista.add(item);
                    break;

                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("Lista vazia.");
                    } else {
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println(i + " - " + lista.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o índice para remover: ");
                    int indice = scanner.nextInt();

                    if (indice >= 0 && indice < lista.size()) {
                        lista.remove(indice);
                        System.out.println("Item removido.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}