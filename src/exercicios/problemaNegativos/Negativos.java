package exercicios.problemaNegativos;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos numeros você vai digitar?");
        int n = sc.nextInt();
        int[] v = new int[n];

        for (int i=0; i<v.length; i++) {
            System.out.println("Digite um numero: ");
            v[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int negativo : v){
            if(negativo < 0){
                System.out.println(negativo);
            }

        sc.close();

        }

    }
}
