public class exe2 {
    public static int maiorValor(int[]numeros){

        int maior= numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i]> maior) {
                maior= numeros[i];
            }
        }

    
        return maior;
        }

    public static void main(String[] args) {
        int[]num = {1,2,3,4,5,6,7,8,9};

System.out.println(maiorValor(num));        
    }
   
    }