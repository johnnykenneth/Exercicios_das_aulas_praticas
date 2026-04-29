public class Teste {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 2500, 10);
        Produto p2 = new Produto("Mouse", 80, 20);

        p1.exibirInfo();
        System.out.println("Valor total em estoque: " + p1.calcularValorTotalEmEstoque()+"\n");
        p2.exibirInfo();
        System.out.println("\n");

        p1.adicionarEstoque(5);

        System.out.println("Após atualizar estoque:");
        p1.exibirInfo();
    }
}