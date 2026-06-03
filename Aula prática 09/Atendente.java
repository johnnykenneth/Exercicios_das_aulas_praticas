public class Atendente extends Funcionario {
    private double comissao;
    
    public Atendente(String nome, String cpf, String dataNascimento,
                     double salario, double comissao) {

        super(nome, cpf, dataNascimento, salario);
        this.comissao = comissao;
    }

    @Override
    public double getSalario() {
        return salario + comissao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCargo: Atendente" +
                "\nComissão: R$ " + comissao;
    }
}