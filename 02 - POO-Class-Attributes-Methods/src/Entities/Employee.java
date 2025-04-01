package Entities;

public class Employee {

    public String name;
    public double glossSalary; // salário bruto
    public double tax; // imposto

    public double netSalary() {
        return glossSalary - tax;
    }

    public double increaseSalary(double percentuage) {
        return  (glossSalary * (percentuage / 100.00)) + netSalary();
    }
}
