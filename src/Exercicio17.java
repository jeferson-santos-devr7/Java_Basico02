public class Exercicio17 {
    public static void main(String[] args) {
        double[] valores = {150.0, -20.5, 45.0, -10.0, 30.0};
        double soma = 0.0;

        for (double v : valores) {
            if (v < 0) {
                continue;
            }
            soma += v;
        }

        System.out.println("Soma dos valores positivos: " + soma);
    }
}