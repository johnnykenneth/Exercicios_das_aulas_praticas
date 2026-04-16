public class exe5 {
    public static void main(String[] args) {

        int[] notas = {7, 8, 6, 10, 9};
        int soma = 0;

        for (int nota : notas) {
            soma += nota;
        }

        double media = (double) soma / notas.length;
        System.out.println("Média: " + media);

        int acima = 0;
        for (int nota : notas) {
            if (nota > media) {
                acima++;
            }
        }

        System.out.println("Notas acima da média: " + acima);
    }
}