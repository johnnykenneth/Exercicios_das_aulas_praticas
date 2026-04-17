import java.util.Scanner;

public class exercicio{
    public static void main (String[]args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite um número:");
        int resultado= 0;

        int num= scanner.nextInt();
        
        resultado= num*2;

        System.out.println("O dobro do seu número é:" +resultado);

        resultado = num*3;

        System.out.println("O triplo do seu número é:" +resultado);
        scanner.close();

    }
}