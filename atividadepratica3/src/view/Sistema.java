package view;

import controller.GerenciadorFuncionarios;
import model.Desenvolvedor;
import model.Gerente;
import model.Estagiario;

public class Sistema {
    private static GerenciadorFuncionarios gerenciador = new GerenciadorFuncionarios();

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Remover Funcionário");
            System.out.println("3. Listar Funcionários");
            System.out.println("4. Sair");
            int opcao = Console.lerInt();

            switch (opcao) {
                case 1:
                    adicionarFuncionario();
                    break;
                case 2:
                    removerFuncionario();
                    break;
                case 3:
                    listarFuncionarios();
                    break;
                case 4:
                    return;
            }
        }
    }

    private static void adicionarFuncionario() {
        // Implementação de adicionar funcionário
    }

    private static void removerFuncionario() {
        // Implementação de remover funcionário
    }

    private static void listarFuncionarios() {
        gerenciador.listarFuncionarios();
    }
}
