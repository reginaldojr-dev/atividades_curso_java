package main.java.com.example.nelio.ex01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int soma = a + b;

        System.out.println("SOMA = " + soma);
        sc.close();
    }
}
