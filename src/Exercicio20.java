public class Exercicio20 {
    public static void main(String[] args) {
        double[] salarios = {2500.0, 4300.50, 3100.0, 5900.20, 3800.0};
        double maior = salarios[0];

        for (int i = 1; i < salarios.length; i++) {
            if (salarios[i] > maior) {
                maior = salarios[i];
            }
        }

        System.out.println("O maior salário é: R$ " + maior);
    }
}