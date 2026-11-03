public class Exercicio29 {
    static double taxa = 0.10;

    static double calcularAcrescimo(double valor) {
        return valor + (valor * taxa);
    }

    public static void main(String[] args) {
        double valorFinal = calcularAcrescimo(100.0);
        System.out.println("Valor com acréscimo: R$ " + valorFinal);
    }
}