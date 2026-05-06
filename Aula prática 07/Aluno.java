public class Aluno {
    String nome;
    int matricula;
    double nota1, nota2, notaTrabalho;

    public Aluno(String nome, int matricula, double nota1, double nota2, double notaTrabalho){
        this.nome= nome;
        this.matricula= matricula;
        this.nota1= nota1;
        this.nota2=nota2;
        this.notaTrabalho= notaTrabalho;

    }
    double calcularMedia(double nota1, double nota2, double not){
        double media;
        media= (this.nota1+ this.nota2+ this.notaTrabalho)/3;
        return media;
    }

    void verificarSituacao(){
        calcularMedia(nota1, nota2, nota1);
        if (calcularMedia(nota1, nota2, nota1)>=7){
            System.out.println("APROVADO");
       
        }else{
            System.out.println("REPROVADO");

        }
            
        }

}