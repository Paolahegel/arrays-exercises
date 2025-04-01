package Application;

import Entities.ContaBancaria;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaBancaria cont1;

        System.out.println("Enter account number: ");
        int account = sc.nextInt();

        System.out.println("Enter account holder name: ");
        sc.nextLine();
        String name = sc.nextLine();

        // Dessa forma eu leio o caracter
        System.out.println("Is there a initial deposit? (y/n) ");
        char answer = sc.next().charAt(0);

        // Aplicando a sobrecarga
        if (answer == 'y') {
            System.out.println("Enter initial deposit value:");
            double valorDeposito = sc.nextDouble();
            cont1 = new ContaBancaria(account, name, valorDeposito);
        } else {
            cont1 = new ContaBancaria(account, name);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(cont1);

        System.out.println();
        System.out.println("Informe o valor do Deposito desejado: ");
        double valorDeposito = sc.nextDouble();
        cont1.deposito(valorDeposito);
        System.out.println("Update Account data: ");
        System.out.println(cont1);

        System.out.println();
        System.out.println("Informe o valor do Saque desejado: ");
        double valorSaque = sc.nextDouble();
        cont1.saque(valorSaque);
        System.out.println("Update Account data: ");
        System.out.println(cont1);

        sc.close();
    }
}
