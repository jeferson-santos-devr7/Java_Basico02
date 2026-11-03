public class Exercicio16 {
    public static void main(String[] args) {
        int[] numeros = {12, 25, 30, 44, 58};
        int procurado = 44;

        for (int n : numeros) {
            if (n == procurado) {
                System.out.println("Valor " + procurado + " encontrado!");
                break;
            }
        }
    }
}