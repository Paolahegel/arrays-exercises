package Entities;

public class CurrencyConverter {

    public static double dollarPrice;
    public static double dollarWant;

    public static double convertedDollars() {
        double valor = (dollarPrice * dollarWant) * 0.06;
        return valor + (dollarPrice * dollarWant);
    }
}
