package Apllication;

import Entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //CurrencyConverter converter = new CurrencyConverter();

        System.out.println("What is the dollar price? ");
        CurrencyConverter.dollarPrice = sc.nextDouble();

        System.out.println("How many dollars wil be bought? ");
        CurrencyConverter.dollarWant = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = R$ %.2f%n", CurrencyConverter.convertedDollars());

        sc.close();
    }
}
