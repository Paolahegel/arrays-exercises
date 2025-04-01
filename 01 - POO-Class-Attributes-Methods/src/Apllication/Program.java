package Apllication;

import Entitties.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle x = new Rectangle();

        System.out.println("Enter widht of the rectangle: ");
        x.width = sc.nextDouble();
        System.out.println("Enter height of the rectangle: ");
        x.height = sc.nextDouble();

        double area = x.area();
        double perimeter = x.perimeter();
        double diagonal = x.diagonal();

        System.out.printf("AREA: %.2f%n", x.area());
        System.out.printf("PERIMETER: %.2f%n", x.perimeter());
        System.out.printf("DIAGONAL: %.2f%n", x.diagonal());

        sc.close();
    }
}
