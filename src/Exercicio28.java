public class Exercicio28 {
    static int maiorValor(int[] valores) {
        int maior = valores[0];
        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        int[] numeros = {12, 45, 7, 89, 23};
        System.out.println("Maior valor: " + maiorValor(numeros));
    }
}