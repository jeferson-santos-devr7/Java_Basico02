public class Exercicio23 {
    static double calcularSubtotal(double preco, int quantidade) {
        return preco * quantidade;
    }

    public static void main(String[] args) {
        double subtotal = calcularSubtotal(45.90, 3);
        System.out.println("Subtotal: R$ " + subtotal);
    }
}