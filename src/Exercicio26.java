public class Exercicio26 {
    static boolean ehMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    public static void main(String[] args) {
        System.out.println("Idade 20 é maior de idade? " + ehMaiorDeIdade(20));
        System.out.println("Idade 16 é maior de idade? " + ehMaiorDeIdade(16));
    }
}