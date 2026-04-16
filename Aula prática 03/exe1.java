import java.util.Scanner;
public class exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome, nome2;

        System.out.println("Digite um nome:");
        nome= scanner.nextLine();

        System.out.println("Digite outro nome:");
        nome2= scanner.nextLine();


        if (nome.equals(nome2)){
            System.out.println("Os nomes são iguais!");


        }else{
            System.out.println("Os nomes são diferentes!");

        }
        scanner.close();
        
    }

    
}
