package java.com.example.nelio.ex04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int horas = sc.nextInt();
        double valorHora = sc.nextDouble();

        double salario = horas * valorHora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        sc.close();
    }
}
