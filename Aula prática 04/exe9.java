import java.util.Scanner;
public class exe9 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        String senha, adivinhe_senha;

        senha= "1234";
        do{
            System.out.println("Digite a senha:");
            adivinhe_senha= scanner.nextLine();

            if (!senha.equals(adivinhe_senha)) {
            System.out.println("Senha incorreta, tente novamente:");  
        }
        }
        while (!senha.equals(adivinhe_senha)); {
            System.out.println("Acesso permitido!");
            scanner.close();
        } 
        }
    }