public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;

        if(nota >= 7){
            System.out.println("O aluno foi aprovado ");
        } else if(nota >= 5 && nota < 7){
            System.out.println("O aluno está na recuperação");
        } else {
            System.out.println("O aluno foi reprovado");
        }
    }
}
