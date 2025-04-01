package Application;

import Entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        emp.name = "João Batista";
        emp.glossSalary = 6000;
        emp.tax = 1000;

        double salarioLiq = emp.netSalary();

        System.out.printf("Employee: " + emp.name + ", $ " + salarioLiq);

        System.out.println();
        System.out.println("Which percentuage to increase salary? ");
        double percentage = sc.nextDouble();

        System.out.println();
        System.out.printf("Update Data: " + emp.name + ", $ " + emp.increaseSalary(percentage));
        sc.close();
    }
}
