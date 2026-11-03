public class Exercicio24 {
    static double calcularDesconto(double total, double percentual) {
        return total * (percentual / 100.0);
    }

    public static void main(String[] args) {
        double desconto = calcularDesconto(200.0, 15.0);
        System.out.println("Valor do desconto: R$ " + desconto);
    }
}