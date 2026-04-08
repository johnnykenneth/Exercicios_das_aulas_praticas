import java.util.Scanner;
public class exe3 {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        
        String palavra;
        int caracteres;
        
        System.out.println("Digite uma palavra:");
        palavra= scanner.nextLine();

        caracteres= palavra.length();

        System.out.println("A palavra"+" "+palavra+ " "+"tem"+ " " +caracteres+ " "+"caracteres!");

        scanner.close();

     



    }
    
}
