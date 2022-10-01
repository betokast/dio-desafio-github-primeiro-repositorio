package one.digital.bootcamp;

public class Calculadora {
    private Double numero1;
    private Double numero2;
    private Double resultado;

    public Calculadora(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Calculadora() {
    }

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public static void somar(Double numero1, Double numero2){
        double resultado = numero1 + numero2;
        System.out.println("O resultado de " + numero1 + " + " + numero2 + " é = " + resultado);
    }

    public static void subtrair(Double numero1, Double numero2){
        double resultado = numero1 - numero2;
        System.out.println("O resultado de " + numero1 + " - " + numero2 + " é = " + resultado);
    }

    public static void multiplicar(Double numero1, Double numero2){
        double resultado = numero1 * numero2;
        System.out.println("O resultado de " + numero1 + " * " + numero2 + " é = " + resultado);
    }

    public static void dividir(Double numero1, Double numero2){
        double resultado = numero1 / numero2;
        System.out.println("O resultado de " + numero1 + " / " + numero2 + " é = " + resultado);
    }
}
