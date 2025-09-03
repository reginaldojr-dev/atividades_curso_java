package io.github.reginaldojr.conta_bancaria;

import io.github.reginaldojr.conta_bancaria.entities.ContaBancaria;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao seu banco! ");
        System.out.println("Para cadastrar uma conta tenha em mãos o numero da conta, nome do titular e valor do depósito (opcional)");

        System.out.println("Numero da conta:");
        int conta = sc.nextInt();
        sc.nextLine();

        System.out.println("Nome do Titular:");
        String titular = sc.nextLine();

        System.out.println("Valor de depósito (pode ser 0):");
        double depositoInicial = sc.nextDouble();

        ContaBancaria contaBancaria = new ContaBancaria(titular, conta, depositoInicial);

        int opcao;
        do {
            System.out.println();
            System.out.println("=== MENU ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Alterar nome do titular");
            System.out.println("4 - Ver dados da conta");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            while (!sc.hasNextInt()) {
                System.out.println("Opção inválida.");
                sc.next();
                System.out.print("Escolha: ");
            }
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Valor do depósito: ");
                    while (!sc.hasNextDouble()) {
                        System.out.println("Valor inválido.");
                        sc.next();
                        System.out.print("Valor do depósito: ");
                    }
                    double valor = sc.nextDouble();
                    sc.nextLine();
                    contaBancaria.depositar(valor);
                    System.out.println("Depósito realizado. Saldo: R$ " + contaBancaria.getSaldo());
                }
                case 2 -> {
                    System.out.print("Valor do saque: ");
                    while (!sc.hasNextDouble()) {
                        System.out.println("Valor inválido.");
                        sc.next();
                        System.out.print("Valor do saque: ");
                    }
                    double valor = sc.nextDouble();
                    sc.nextLine();
                    contaBancaria.sacar(valor);
                    System.out.println("Saque realizado. Saldo: R$ " + contaBancaria.getSaldo());
                }
                case 3 -> {
                    System.out.print("Novo nome do titular: ");
                    String novo = sc.nextLine();
                    contaBancaria.setTitular(novo);
                    System.out.println("Titular atualizado: " + contaBancaria.getTitular());
                }
                case 4 -> {
                    System.out.println();
                    System.out.println("Número: " + contaBancaria.getConta());
                    System.out.println("Titular: " + contaBancaria.getTitular());
                    System.out.println("Saldo: R$ " + contaBancaria.getSaldo());
                }
                case 0 -> System.out.println("Encerrando...");
                default -> {
                    if (opcao != 0 && opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4) {
                        System.out.println("Opção inválida.");
                    }
                }
            }
        } while (opcao != 0);

        sc.close();
    }
}
