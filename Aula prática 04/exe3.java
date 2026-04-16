import java.util.Scanner;
public class exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String combustivel;
        double litros;
        double preco_litro = 0;
        double desconto = 0;

        System.out.println("Digite o tipo de combustível: 'A' para Álcool ou 'G' para Gasolina:");
        combustivel = scanner.next();

        System.out.println("Digite a quantidade de litros:");
        litros = scanner.nextDouble();

        if (combustivel.equalsIgnoreCase("A")) {
            preco_litro = 4.50;

            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }

        } else if (combustivel.equalsIgnoreCase("G")) {
            preco_litro = 6.00;

            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }

        } else {
            System.out.println("Tipo de combustível inválido!");
            
        }

        double valorFinal = litros * preco_litro * (1 - desconto);

        System.out.println("Valor a pagar: R$ " + valorFinal);
        scanner.close();
    }
}