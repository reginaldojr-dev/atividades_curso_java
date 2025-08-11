package io.github.reginaldojr.while02;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x == 0 || y == 0) {
                break;
            }

            if (x > 0 && y > 0)      System.out.println("primeiro");
            else if (x < 0 && y > 0) System.out.println("segundo");
            else if (x < 0 && y < 0) System.out.println("terceiro");
            else                     System.out.println("quarto");
        }
        sc.close();
    }
}
