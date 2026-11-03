public class Exercicio25 {
    static int somar(int a, int b) {
        return a + b;
    }

    static double somar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Soma int: " + somar(10, 20));
        System.out.println("Soma double: " + somar(5.5, 4.5));
    }
}