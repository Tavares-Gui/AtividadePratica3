package main;

import java.util.Scanner;
import view.Sistema;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Sistema.menu();
            int opcao = scanner.nextInt();
            scanner.nextLine();
            Sistema.opcoesMenu(opcao);
        }
    }
}
