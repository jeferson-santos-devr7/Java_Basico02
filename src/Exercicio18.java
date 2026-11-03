public class Exercicio18 {
    public static void main(String[] args) {
        int[] numeros = {2, 4, 6, 8, 10, 12, 14, 16};
        int total = 0;

        for (int n : numeros) {
            total += n;
        }

        System.out.println("Total da soma: " + total);
    }
}