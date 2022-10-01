public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 10;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);


//        if(nota >= 7){
//            System.out.println("O aluno foi aprovado ");
//        } else if(nota >= 5 && nota < 7){
//            System.out.println("O aluno está na recuperação");
//        } else {
//            System.out.println("O aluno foi reprovado");
//        }
    }
}
