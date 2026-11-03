public class Exercicio21 {
    public static void main(String[] args) {
        int[] valores = {45, 120, 89, 200, 100, 50};
        int contador = 0;

        for (int v : valores) {
            if (v >= 100) {
                contador++;
            }
        }

        System.out.println("Quantidade de valores >= 100: " + contador);
    }
}