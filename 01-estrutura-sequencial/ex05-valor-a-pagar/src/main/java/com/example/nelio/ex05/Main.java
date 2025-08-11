package java.com.example.nelio.ex05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int qtd1 = sc.nextInt();
        double val1 = sc.nextDouble();

        int cod2 = sc.nextInt();
        int qtd2 = sc.nextInt();
        double val2 = sc.nextDouble();

        double total = qtd1 * val1 + qtd2 * val2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        sc.close();
    }
}
