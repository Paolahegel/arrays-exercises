import Entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student stud = new Student();

        System.out.println("Digite o nome do aluno: ");
        stud.name = sc.nextLine();
        System.out.printf("Digite a 1° nota do semestre: ");
        stud.nota1 = sc.nextDouble();
        System.out.printf("Digite a 2° nota do semestre: ");
        stud.nota2 = sc.nextDouble();
        System.out.printf("Digite a 3° nota do semestre: ");
        stud.nota3 = sc.nextDouble();

        stud.notaFaltante();

        sc.close();

    }
}