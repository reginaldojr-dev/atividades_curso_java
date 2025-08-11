package io.github.reginaldojr.while03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int alcool = 0, gasolina = 0, diesel = 0;

        while (true) {
            int cod = sc.nextInt();
            if (cod == 4) break;
            switch (cod) {
                case 1 -> alcool++;
                case 2 -> gasolina++;
                case 3 -> diesel++;
                default -> { /* ignora inválidos */ }
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
