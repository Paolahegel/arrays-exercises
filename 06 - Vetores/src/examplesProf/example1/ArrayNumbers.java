// ARRAY ARMAZENANDO ELEMENTOS DO TIPO NUMERICO
package examplesProf.example1;

import java.util.Scanner;
import java.util.Locale;

public class ArrayNumbers {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    double [] vect = new double[n]; // crio a instanciação da minha array, ela recebe o tamanho na input n

    // para adicionar elementos e guardar na minha array, conforme seu tamanho
    // uso o laço for, para ir incrementando até chegar no valor da variavél n
    for (int i = 0; i < n; i++) {
        vect[i] = sc.nextDouble(); // vect recebe o que o usuário digitar, até atingir a condição de n
    }

    double soma = 0; // crio a varial media

    for (int i = 0; i < n; i++) {
        soma += vect[i]; // percorro os valores do vect e somo todos eles  na variavel soma
    }
    double media = soma / n; // depois de somado, divido em outra variavel

    System.out.printf("Media: %.2f%n", media);
    sc.close();
    }
}