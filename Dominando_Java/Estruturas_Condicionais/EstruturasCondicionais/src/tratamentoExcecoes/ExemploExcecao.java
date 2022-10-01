package tratamentoExcecoes;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ExemploExcecao {
    public static void main(String[] args) {
        try {
            //Criando o objeto scanner
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            //Entrada de dados
            System.out.println("Digite seu nome: ");
            String nome = sc.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = sc.next();

            System.out.println("Digite a sua idade: ");
            int idade = sc.nextInt();

            System.out.println("Digite a sua altura: ");
            double altura = sc.nextDouble();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura é " + altura + "cm");

            sc.close();
        }catch(InputMismatchException err){
            System.out.println("Os campos idade e altura precisam ser numéricos");
            //err.printStackTrace();
        }
    }
}
