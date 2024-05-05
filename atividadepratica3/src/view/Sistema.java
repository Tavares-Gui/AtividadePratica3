package view;

import java.util.List;
import java.util.Scanner;

import controller.GerenciadorFuncionarios;
import model.Desenvolvedor;
import model.Gerente;
import model.Estagiario;
import model.Funcionario;

public class Sistema {
    private static GerenciadorFuncionarios gerenciadorFuncionarios = new GerenciadorFuncionarios();
    private static Scanner scanner = new Scanner(System.in);

    private static void menu() {

        System.out.println("===== Gerenciamento de Funcionários =====\n" +
                           "Selecione a ação que deseja realizar:\n" +
                           "< 1 > Cadastrar novo funcionário\n" +
                           "< 2 > Listar todos os funcionários\n" +
                           "< 3 > Buscar funcionário por matrícula\n" +
                           "< 4 > Remover funcionário\n");
    }

    private static void opcoesMenu(int op) {
        switch (op) {
            case 1:
                adicionarFuncionario();
                break;

            case 2:
                listarFuncionarios();
                break;

            case 3:
                buscarFuncionario();
                break;

            case 4:
                removerFuncionario();
                break;

            case 0:
                System.out.println("Obrigado por utilizar o nosso sistema! Até a próxima!");
                System.exit(0);

            default:
                break;
        }
    }

    private static void adicionarFuncionario() {
        System.out.println("===== Adicionar Funcionário =====\n" +
                           "Selecione o tipo de funcionário:\n" +
                           "< 1 > Gerente\n" +
                           "< 2 > Desenvolvedor\n" +
                           "< 3 > Estagiário\n");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a matrícula do funcionário: ");
        String matricula = scanner.nextLine();
        scanner.nextLine();

        switch (tipo) {
            case 1:
                System.out.println("Digite o bônus anual do gerente: ");
                double bonusAnual = scanner.nextDouble();
                gerenciadorFuncionarios.adicionarFuncionario(new Gerente(nome, matricula, bonusAnual));
                break;
            case 2:
                System.out.println("Digite as tecnologias dominadas pelo desenvolvedor: ");
                String tecnologias = scanner.nextLine();
                gerenciadorFuncionarios.adicionarFuncionario(new Desenvolvedor(nome, matricula, tecnologias));
                break;
            case 3:
                System.out.println("Digite as horas de trabalho do estagiário: ");
                int horasTrabalhadas = scanner.nextInt();
                gerenciadorFuncionarios.adicionarFuncionario(new Estagiario(nome, matricula, horasTrabalhadas));
                break;
            default:
                System.out.println("Tipo de funcionário inválido.");
        }
    }

    private static void listarFuncionarios() {
        System.out.println("===== Lista de Funcionários =====\n");
        gerenciadorFuncionarios.listarFuncionarios();
    }

    private static void buscarFuncionario() {
        System.out.println("===== Buscar Funcionário por Matrícula =====\n" +
                           "Digite a matrícula do funcionário que deseja buscar: ");
        String matricula = scanner.nextLine();

        Funcionario funcionario = gerenciadorFuncionarios.buscarFuncionarioPorMatricula(matricula);

        if (funcionario != null) {
            System.out.println("Funcionário: " + funcionario);
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private static void removerFuncionario() {
        System.out.println("===== Remover Funcionário =====" +
                           "Digite a matrícula do funcionário que deseja remover: ");
        String matricula = scanner.nextLine();

        if (gerenciadorFuncionarios.removerFuncionario(matricula)) {
            System.out.println("Funcionário removido com sucesso.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    public static void main(String[] args) {
        while (true) {
            menu();
            int opcao = scanner.nextInt();
            scanner.nextLine();
            opcoesMenu(opcao);
        }
    }
}
