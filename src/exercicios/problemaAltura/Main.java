package exercicios.problemaAltura;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Quantas pesoas serão digitadas?");
        int n = sc.nextInt();
        Pessoa[] vetorPessoas = new Pessoa[n];

        // para adicionar vários objetos Pessoa na array
        for (int i = 0; i < vetorPessoas.length; i++) {
            sc.nextLine();
            System.out.printf("Digite os dados da %da pessoa:\n", i +1);
            System.out.print("Digite o nome da pessoa: ");
            String name = sc.nextLine();
            System.out.print("Digite a idade da pessoa: ");
            int age = sc.nextInt();
            System.out.print("Digite a altura da pessoa: ");
            double altura = sc.nextDouble();
            vetorPessoas[i] = new Pessoa(age, name, altura);
        }
        System.out.println();

        // para obter apenas as alturas dos objetos Pessoa criado e gerar a média delas
        double sum = 0;
        for (int i = 0; i < vetorPessoas.length; i++) {
            sum += vetorPessoas[i].getAltura();
        }
        double media = sum / vetorPessoas.length;
        System.out.printf("Altura média das pessoas: %.2f%n", media);

        System.out.println();

        // somando a quantidade de <16 na variavel
        double menores = 0;
        double porcentagemIdadeMenor = 0;
        for (Pessoa menor : vetorPessoas) {
            if (menor.getIdade() < 16) {
                menores++;
            }
        }
        porcentagemIdadeMenor = (menores / vetorPessoas.length) * 100.00;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagemIdadeMenor);

        // exibir nomes das pessoas com <16
        for (int i = 0; i < vetorPessoas.length; i++) {
            if (vetorPessoas[i].getIdade() < 16) {
                System.out.printf("%s\n", vetorPessoas[i].getNome());
            }
        }
        sc.close();
    }
}
