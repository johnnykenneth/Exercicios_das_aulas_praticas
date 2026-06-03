public class Funcionario{
    String nome, cpf, dataNascimento;
    double salario;

    public Funcionario(String nome, String cpf, String dataNascimento, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public void setNome(String nome){
        this.nome= nome;
    }

    public String getNome(){
        return nome;
    }

    public void setCpf(String cpf){
        this.cpf= cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void setdataNascimento(String dataNascimento){
        this.dataNascimento= dataNascimento;
    }

    public String getdataNascimento(){
        return dataNascimento;
    }

    public void setSalario(double salario){
        this.salario= salario;
    }

    public double getSalario(){
        return salario;
    }


    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nCPF: " + cpf +
                "\nData de Nascimento: " + dataNascimento;
    }
}
