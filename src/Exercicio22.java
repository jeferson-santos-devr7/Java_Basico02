public class Exercicio22 {
    static void exibirStatus(boolean ativo) {
        if (ativo) {
            System.out.println("ATIVO");
        } else {
            System.out.println("INATIVO");
        }
    }

    public static void main(String[] args) {
        exibirStatus(true);
        exibirStatus(false);
    }
}