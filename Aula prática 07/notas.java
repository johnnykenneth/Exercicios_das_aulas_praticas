public class notas {
    public static void main(String[] args) {
        
        Aluno aluno1= new Aluno("Johnny", 2026001, 9.4, 8.3, 7.2);
        Aluno aluno2= new Aluno("Kenneth", 2026002, .5,5.5, 6.5);

        
        System.out.println("Matrícula: "+ aluno1.matricula+", "+ aluno1.nome+ " Você foi:");
        aluno1.verificarSituacao();
        System.out.println("Matrícula: "+ aluno2.matricula+", "+ aluno2.nome+ " Você foi:");
        aluno2.verificarSituacao();

    }
    
}