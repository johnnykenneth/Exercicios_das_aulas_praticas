import java.util.InputMismatchException;
import java.util.Scanner;

public class exe1 {
public static void main(String[] args) {
    int num1, num2;
    double resultado;
    Scanner leitor= new Scanner(System.in);

    boolean repetir= true;

    while (repetir) {

    try {
        System.out.println("Digite um número:");
        num1= leitor.nextInt();
    
        System.out.println("Digite outro número:");
        num2= leitor.nextInt();

        resultado= num1/num2;
        System.out.println("O resultado da divisão é:" +num1+ " / "+num2+" = " +resultado);
        repetir= false;
                
    } catch (InputMismatchException e) {
        System.out.println("O número que você digitou não é um número inteiro, tente novamente com um número inteiro!");
        leitor.next();
    }

    catch(ArithmeticException e){
        System.out.println("O número que você digitou não é divisível por zero! tente novamente, digite algum número que não seja 0");
        leitor.next();
    }
    }
leitor.close();
}
}