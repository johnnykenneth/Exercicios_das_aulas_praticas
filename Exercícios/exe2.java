import java.util.Scanner;
public class exe2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String palavra1, palavra2;

        System.out.println("Digite uma palavra:");
        palavra1= scanner.nextLine();

        System.out.println("Digite outra palavra:");
        palavra2= scanner.nextLine();


        if (palavra1.equalsIgnoreCase(palavra2)){
            System.out.println("As palavras são iguais!");


        }else{
            System.out.println("As palavras são diferentes!");

        }
        scanner.close();
        
    }

    
}
    
