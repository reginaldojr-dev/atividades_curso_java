package io.github.reginaldojr.while01;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final int SENHA_CORRETA = 2002;
        while (true) {
            int senha = sc.nextInt();
            if (senha == SENHA_CORRETA) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        }
        sc.close();
    }
}
