import one.digital.bootcamp.Calculadora;

public class Main {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        calc.somar(5.0, 3.0);
        calc.subtrair(5.0, 3.0);
        calc.multiplicar(5.0, 3.0);
        calc.dividir(5.0, 3.0);
    }
}