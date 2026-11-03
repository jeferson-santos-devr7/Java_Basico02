public class Exercicio06 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};
        numeros[1] = 99; // Altera a segunda posição (índice 1)

        for (int n : numeros) {
            System.out.println(n);
        }
    }
}