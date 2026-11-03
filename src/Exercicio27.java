public class Exercicio27 {
    static void exibirValores(int[] valores) {
        for (int v : valores) {
            System.out.println(v);
        }
    }

    public static void main(String[] args) {
        int[] meuArray = {5, 10, 15, 20};
        exibirValores(meuArray);
    }
}