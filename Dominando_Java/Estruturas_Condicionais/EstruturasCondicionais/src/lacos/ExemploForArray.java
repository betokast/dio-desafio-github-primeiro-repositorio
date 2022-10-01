package lacos;

public class ExemploForArray {
    public static void main(String[] args) {
        String turmaA[] = {"Felipe", "Jonas", "Julia", "Marcos"};
        String turmaB[] = {"Alessandra", "Paulo", "Aline", "Carla", "Roberto"};

        //Exemplo do for tradicional:
        for(int i = 0; i < turmaA.length; i++){
            System.out.println("O(A) aluno(a) na posição " + i + " é " + turmaA[i]);
        }

        //Exemplo do uso do ForEach:
        for(String aluno : turmaB){
            System.out.println("O nome do(a) aluno(a) é: " + aluno);
        }
    }
}
