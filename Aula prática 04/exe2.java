import java.util.Scanner;
public class exe2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int idade;

        System.out.println("Digite a sua idade:");
        idade= scanner.nextInt();

    if (idade>=5 && idade<=7) {
        System.out.println("infantil A");}

    else if (idade >= 8 && idade <=10) {
        System.out.println("infantil B");}

    else if (idade >= 11 && idade <=13) {
        System.out.println("juvenil A");}

    else if (idade >= 14 && idade<=17) {
        System.out.println("juvenil B");}

    else if (idade>= 18) {
        System.out.println("Adulto");}
       
    else{
        System.out.println("categoria não existente!");
    
}
    scanner.close();
}  
}