package io.github.reginaldojr.ex02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double pi = 3.14159;
        double area = pi * r * r;

        System.out.printf("A=%.4f%n", area);
        sc.close();
    }
}
