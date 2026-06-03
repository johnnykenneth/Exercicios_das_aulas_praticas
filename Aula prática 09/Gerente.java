public class Gerente extends Funcionario {
    public Gerente(String nome, String cpf, String dataNascimento, double salario){
        super(nome, cpf, dataNascimento, salario);
    }

    
    public void cadastrarGerentes(){
        Gerente funcionarios= new Gerente(null, null, null, 0);
        System.out.println("Digite seu nome:");
        funcionarios.setNome(scanner.nextLine());

        System.out.println("Digite seu cpf:");
        funcionarios.setCpf(scanner.nextLine());

        System.out.println("Digite sua data de nascimento:");
        funcionarios.setdataNascimento(scanner.nextLine());

        System.out.println("Digite seu salário:");
        funcionarios.setSalario(scanner.nextDouble());
        scanner.nextLine();
        Funcionario.add(funcionarios);

    }
    public double getSalario(){
        return salario+2000;

    }
    
}
