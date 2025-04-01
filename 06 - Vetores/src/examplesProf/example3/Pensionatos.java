package examplesProf.example3;

import java.util.Locale;
import java.util.Scanner;

public class Pensionatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        RegistroAluguel [] vect = new RegistroAluguel[9]; // cria os vetores com posições nulas

        System.out.println("Quantos quartos você vai registrar?");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
           // System.out.println();
            System.out.println("Alugel #" + i); // para mostrar a quantidade a cada loop
            System.out.print("Name: ");
            sc.nextLine(); // limpa buffer
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int quartoPosicao = sc.nextInt();

            // instanciando o objeto e atribuindo a posição dele no vetor
            vect[quartoPosicao]  = new RegistroAluguel(name, email);
        }

        System.out.println();

        // imprimindo as posições não nulas dentro do vetor
        System.out.println("Quartos Ocupados: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i].toString());
            }
        }
    }
}
