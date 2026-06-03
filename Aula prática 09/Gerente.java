public class Gerente extends Funcionario {
    public Gerente(String nome, String cpf,
                   String dataNascimento, double salario) {
        super(nome, cpf, dataNascimento, salario);
    }

    @Override
    public double getSalario() {
        return salario + 2000;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCargo: Gerente";
    }
}