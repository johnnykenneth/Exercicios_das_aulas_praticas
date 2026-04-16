import java.util.Scanner;
public class exe7 {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);

        String palavra;

        System.out.println("Digite uma palavra:");
        palavra= scanner.nextLine();

        String invertida= new StringBuilder(palavra).reverse().toString();
        System.out.println("A sua palavra invertida é:"+ " "+invertida);

        scanner.close();
    }
}