package exercicios.numerosPares;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("quantos numeros você vai adicionar na array?");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print("Digite o valor: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("NUMEROS PARES PRESENTES NA ARRAY:");
        int pares = 0;
        for (int p : vect) {
            if (p % 2 == 0) {
                System.out.print(p + " ");
                pares++;
            }
        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES: " + pares);

    }
}
