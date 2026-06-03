import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {

        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar Gerente");
            System.out.println("2 - Adicionar Atendente");
            System.out.println("3 - Listar Funcionários");
            System.out.println("4 - Mostrar Salário por CPF");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    cadastrarGerente();
                    break;

                case 2:
                    cadastrarAtendente();
                    break;

                case 3:
                    listarFuncionarios();
                    break;

                case 4:
                    mostrarSalario();
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    public static void cadastrarGerente() {

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Data de nascimento: ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        funcionarios.add(
                new Gerente(nome, cpf, dataNascimento, salario)
        );

        System.out.println("Gerente cadastrado com sucesso!");
    }

    public static void cadastrarAtendente() {

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Data de nascimento: ");
        String dataNascimento = scanner.nextLine();

        System.out.print("Salário: ");
        double salario = scanner.nextDouble();

        System.out.print("Comissão: ");
        double comissao = scanner.nextDouble();
        scanner.nextLine();

        funcionarios.add(new Atendente(nome, cpf, dataNascimento, salario, comissao));
        System.out.println("Atendente cadastrado com sucesso!");
    }

    public static void listarFuncionarios() {

        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        for (Funcionario funcionario : funcionarios) {

            System.out.println("\n---------------------");
            System.out.println(funcionario);
        }
    }

    public static void mostrarSalario() {

        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        for (Funcionario funcionario : funcionarios) {

            if (funcionario.getCpf().equals(cpf)) {

                System.out.printf(
                        "Salário de %s: R$ %.2f%n",
                        funcionario.getNome(),
                        funcionario.getSalario()
                );

                return;
            }
        }

        System.out.println("Funcionário não encontrado.");
    }
}