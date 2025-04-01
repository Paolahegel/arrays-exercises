// Fazer um programa para ler um número inteiro N e os dado(nome e preço) de N produtos.
// Armazene os N produtos em um vetor. Em. seguida, mostrar o preço médios dos produtos

// Array do tipo referência: posição no heap, no inicio estão nulos, vazios.

package examplesProf.example2;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Product[] vect = new Product[n]; // instâncio uma array do objeto Product com tamanho n

        // usar o vect length para para referenciaro tamanho do array ao invés de uma variavel
        for (int i=0; i< vect.length; i++) { // for vai percorrer todas as posições do , até chegar no n
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            // instâncio um novo produto com os parametros inseridos e o array[vect] vai "apontar"
            // para esse novo objeto, guardando nas posições do array.
            vect[i] = new Product(name, price);
        }
        // fazer a média do preço de todos os produtos que estão armazenado na array
        double sum = 0;
        for (int i=0; i<vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double media = sum / n;
        System.out.println("Media de preço: " + media);

        sc.close();
    }
}
