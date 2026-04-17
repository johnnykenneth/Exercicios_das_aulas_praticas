import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        double valor, total;
        int quantidade;

        System.out.println("Digite o valor do produto que você comprou:");
        valor= scanner.nextDouble();

        System.out.println("Digite a quantidade de produtos que você comprou:");
        quantidade= scanner.nextInt();

        total= valor*quantidade;

        if (total>100){
            total= valor-(valor*0.08);

            System.out.println("O valor final do produto que você comprou é:" +total);

            scanner.close();

        }
            

              {
            
        }
    }
    
}
