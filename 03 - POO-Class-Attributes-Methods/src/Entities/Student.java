package Entities;

public class Student {

    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }
    public void notaFaltante() {
        if (notaFinal() >= 60) {
            System.out.printf("FINAL GRADE = %.2f%n", notaFinal());
            System.out.println("PASS");
        } else if (notaFinal() < 60) {
            double diferenca = 100 - notaFinal();
            System.out.printf("FINAL GRADE = %.2f%n", notaFinal());
            System.out.println("FAILED");
            System.out.println("MISSING " + diferenca + " POINTS");
        }
    }
}
