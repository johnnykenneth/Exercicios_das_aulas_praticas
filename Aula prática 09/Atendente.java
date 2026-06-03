public class Atendente extends Funcionario {
    public Atendente(String nome, String cpf, String dataNascimento, double salario){
        super(nome, cpf, dataNascimento, salario);
        
    }        
    public void cadastrarAtendente(){
        Atendente funcionarios= new Atendente(null, null, null, 0);
        System.out.println("Digite seu nome:");
        funcionarios.setNome(scanner.nextLine());

        System.out.println("Digite seu cpf:");
        funcionarios.setCpf(scanner.nextLine());

        System.out.println("Digite sua data de nascimento:");
        funcionarios.setdataNascimento(scanner.nextLine());

        System.out.println("Digite seu salário:");
        funcionarios.setSalario(scanner.nextDouble());
        scanner.nextLine();

        Atendente.add(funcionarios);

    }    
}
