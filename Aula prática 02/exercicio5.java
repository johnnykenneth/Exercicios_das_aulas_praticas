import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double preco= 40.0;
        String ingresso;

        System.out.println("Digite o seu tipo de ingresso: I ou M:");
        ingresso= scanner.next();

        if (ingresso.equalsIgnoreCase("I")) {
            System.out.println("O valor do seu ingresso: é:"+ preco);
            
        }
        else{
            System.out.println("O valor do seu ingresso é:" +(preco/2));
        }
            

        scanner.close();

    }
    
}
