import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade:");
        idade= scanner.nextInt();

    if (idade>=18 && idade <=70) {
        System.out.println("Você é obrigado a votar!");

     
    } else
        System.out.println("Você não é obrigado a votar!");
      scanner.close();
    }  
}