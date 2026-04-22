public class exe4 {
    public static int[] contarParesImpares(int[]numeros){
        int pares= 0;
        int impares= 0;

        for (int i : numeros) {
            if (i%2==0) {
                pares++;
            } else {
                impares++;
            }
        }
        return new int[]{pares, impares};
    }
    public static void main(String[] args) {
        int [] num= {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] resultado= contarParesImpares(num);

        System.out.println("Pares:"+ resultado[0]);
        System.out.println("Impares:"+ resultado[1]);
    }    
    }