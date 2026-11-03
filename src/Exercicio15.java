public class Exercicio15 {
    public static void main(String[] args) {
        int variavelMain = 50; // Visível em todo o método main

        if (variavelMain > 10) {
            String variavelBloco = "Estou dentro do if"; // Visível apenas dentro deste bloco if
            System.out.println(variavelBloco);
        }

        // System.out.println(variavelBloco); // Erro de compilação se descomentado, pois está fora do escopo do if
        System.out.println("Variável do main: " + variavelMain);
    }
}