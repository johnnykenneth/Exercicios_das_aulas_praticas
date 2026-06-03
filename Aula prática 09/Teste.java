import java.util.ArrayList;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        
    }
    public static void menuLogin() {
        ArrayList<Funcionario> Gerente= new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        int escolha;
        do {
        System.out.println("Escolha uma opcao:");
        System.out.println("1 - Adicionar atendente");
        System.out.println("2 - Adicionar gerente");
        System.out.println("3- Listar todos os funcionários");
        System.out.println("0 - Encerrar programa");
        escolha= scanner.nextInt();
        scanner.nextLine();
            switch (escolha) {
                case 1 -> cadastrarAtendente();
                case 2 -> cadastrarGerentes();
                case 0 -> System.out.println("Encerrando programa");
                default -> System.out.println("Opção inválida!");
            }
        }
    }
    
}
