package exercicios.maiorPosicao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quantos números você vai adicionar?");
        int n = sc.nextInt();
        double [] v = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            v[i] = sc.nextDouble();
        }

        double maiorValor = v[0];
        for (double maior : v) {
            if (maior > maiorValor) {
                maiorValor = maior;
            }
        }

        System.out.printf("MAIOR VALOR = %.2f%n", maiorValor);

        sc.close();
    }
}
