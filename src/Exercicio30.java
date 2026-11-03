public class Exercicio30 {
    static void contagemRecursiva(int n) {
        if (n == 0) {
            System.out.println("Fim");
            return;
        }
        System.out.println(n);
        contagemRecursiva(n - 1);
    }

    public static void main(String[] args) {
        contagemRecursiva(5);
    }
}