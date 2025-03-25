package exercicios.somaVetor;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual será o tamanho do vetor?");
        int n = sc.nextInt();
        double[] vect = new double[n];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine(); // limpa buffer importante
            System.out.println("Digite um numero para armazenar no vetor:");
            vect[i] = sc.nextDouble();
        }

        // para imprimir na mesma linha todos os valores da array é necessário um for
        System.out.print("VALORES DO VETOR: ");
        for (double valores : vect) {
            System.out.print(valores + ", ");
        }

        System.out.println();

        // para somar todos os valores do array e exibir
        double soma = 0;
        for (int i = 0; i < vect.length; i++){
            soma += vect[i];
        }
        System.out.printf("SOMA = %.2f", soma);

        System.out.println();

        // para fazer a média dos valores da array e exibir
        double media = soma / vect.length;
        System.out.printf("MEDIA = %.2f", media);
    }
}
