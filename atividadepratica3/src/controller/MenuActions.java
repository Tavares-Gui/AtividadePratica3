package controller;

import model.Desenvolvedor;
import model.Gerente;
import view.Console;
import model.Estagiario;
import model.Funcionario;

public class MenuActions {
    private static GerenciadorFuncionarios gerenciadorFuncionarios = new GerenciadorFuncionarios();

    public static void adicionarFuncionario() {
        System.out.println("\n===== Adicionar Funcionário =====\n" +
                "Selecione o tipo de funcionário:\n" +
                "< 1 > Gerente\n" +
                "< 2 > Desenvolvedor\n" +
                "< 3 > Estagiário\n");

        int tipo = Console.lerInt();

        System.out.println("Digite o nome do funcionário: ");
        String nome = Console.lerStr();

        System.out.println("Digite a matrícula do funcionário: ");
        String matricula = Console.lerStr();

        switch (tipo) {
            case 1:
                System.out.println("Digite o bônus anual do gerente: ");
                double bonusAnual = Console.lerFloat();
                Gerente novoGerente = new Gerente(nome, matricula, bonusAnual);
                System.out.println("Digite o nome dos membros da equipe (separados por vírgula): ");
                String equipeNomes = Console.lerStr();
                String[] equipeNomesArray = equipeNomes.split(",");
                for (String nomeMembro : equipeNomesArray) {
                    Funcionario membro = gerenciadorFuncionarios.buscarFuncionarioPorMatricula(nomeMembro.trim());
                    if (membro != null) {
                        novoGerente.adicionarMembroEquipe(membro);
                    } else {
                        System.out.println("Funcionário " + nomeMembro + " não encontrado para adicionar à equipe.");
                    }
                }
                gerenciadorFuncionarios.adicionarFuncionario(novoGerente);
                                                                        
                break;

            case 2:
                System.out.println("Digite as tecnologias dominadas pelo desenvolvedor: ");
                String tecnologias = Console.lerStr();
                gerenciadorFuncionarios.adicionarFuncionario(new Desenvolvedor(nome, matricula, tecnologias));
                break;

            case 3:
                System.out.println("Digite as horas de trabalho do estagiário: ");
                int horasTrabalhadas = Console.lerInt();

                System.out.println("Digite a matrícula do supervisor do estagiário: ");
                String matriculaSupervisor = Console.lerStr();
                Funcionario supervisor = gerenciadorFuncionarios.buscarFuncionarioPorMatricula(matriculaSupervisor);
                if (supervisor != null) {
                    Estagiario.setSupervisor(supervisor);
                } else {
                    System.out.println("Supervisor não encontrado. Estagiário adicionado sem supervisor.");
                }

                gerenciadorFuncionarios.adicionarFuncionario(new Estagiario(nome, matricula, horasTrabalhadas));
                break;

            default:
                System.out.println("Tipo de funcionário inválido.\n\n");
                break;
        }
    }

    public static void listarFuncionarios() {
        System.out.println("\n===== Lista de Funcionários =====\n");
        gerenciadorFuncionarios.listarFuncionarios();
    }

    public static void buscarFuncionario() {
        System.out.println("\n===== Buscar Funcionário por Matrícula =====\n" +
                "Digite a matrícula do funcionário que deseja buscar: ");
        String matricula = Console.lerStr();

        Funcionario funcionario = gerenciadorFuncionarios.buscarFuncionarioPorMatricula(matricula);

        if (funcionario != null) {
            System.out.println(funcionario);
        } else {
            System.out.println("Funcionário não encontrado.\n\n");
        }
    }

    public static void removerFuncionario() {
        System.out.println("\n===== Remover Funcionário =====\n" +
                "Digite a matrícula do funcionário que deseja remover: ");
        String matricula = Console.lerStr();

        if (gerenciadorFuncionarios.removerFuncionario(matricula)) {
            System.out.println("Funcionário removido com sucesso.\n\n");
        } else {
            System.out.println("Funcionário não encontrado.\n\n");
        }
    }
}
