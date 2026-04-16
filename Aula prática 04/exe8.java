import java.util.Scanner;
public class exe8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int tabuada, numero;

        System.out.println("Digite um número:");
        numero= scanner.nextInt();
        System.out.println("Tabuada do número" +" " +numero+":");

        for (int i= 1; i<=10; i++) {
            tabuada= numero*i;
            System.out.println(numero+" * "+i+" = " +tabuada);
            scanner.close();  
        }
    }
}