import java.util.Scanner;


public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        double litro, valor, litros;

        System.out.println("Digite o preço do litro:");
        litro= scanner.nextDouble();

        System.out.println("Digite quanto de dinheiro você tem:");
        valor= scanner.nextDouble();

        litros= valor/litro;

        System.out.println("Você pode comprar "+litros+ " " +"litros");

        scanner.close();
    }
    
}
