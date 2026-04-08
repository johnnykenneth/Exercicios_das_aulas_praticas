import java.util.Scanner;
public class exe6 {
public static void main(String[] args) {
    
    Scanner scanner= new Scanner(System.in);

    String frase, palavra;

    System.out.println("Digite uma frase:");
    frase= scanner.nextLine();

    System.out.println("Digite uma palavra:");
    palavra= scanner.nextLine();

    int i= frase.indexOf(palavra);
    System.out.println(i);

    scanner.close();



}    
}
