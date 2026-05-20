public class Retangulo {

    private double altura = 1.0;
    private double largura = 1.0;

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setAltura(double altura) {
        if (altura > 0.0 && altura < 20.0) {
            this.altura = altura;
        } else {
            System.out.println("Altura inválida!");
        }
    }

    public void setLargura(double largura) {
        if (largura > 0.0 && largura < 20.0) {
            this.largura = largura;
        } else {
            System.out.println("Largura inválida!");
        }
    }

    // Métodos
    public double calcularArea() {
        return altura * largura;
    }

    public double calcularPerimetro() {
        return 2 * (altura + largura);
    }
}