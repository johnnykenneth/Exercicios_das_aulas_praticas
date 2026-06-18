import java.util.Scanner;
public class TesteLogin {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        SistemaLogin sistema= new SistemaLogin();

        System.out.println("Digite o usuário:");
        String usuario = scanner.nextLine();

        System.out.println("Digite a senha:");
        String senha= scanner.nextLine();

        try {
            sistema.fazerLogin(usuario, senha);
            
        } catch (LoginInvalidoException e) {
            System.out.println("Acesso negado:"+ e.getMessage());
        }
        scanner.close();   
    }   
}