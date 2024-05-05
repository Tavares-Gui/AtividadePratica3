package view;

import controller.MenuActions;

public class Sistema {
    public static void menu() {
        System.out.println("\n===== Gerenciamento de Funcionários =====\n" +
                           "Selecione a ação que deseja realizar:\n" +
                           "< 1 > Cadastrar novo funcionário\n" +
                           "< 2 > Listar todos os funcionários\n" +
                           "< 3 > Buscar funcionário por matrícula\n" +
                           "< 4 > Remover funcionário\n" +
                           "< 0 > Sair\n");
    }

    public static void opcoesMenu(int op) {
        switch (op) {
            case 1:
                MenuActions.adicionarFuncionario();
                break;

            case 2:
                MenuActions.listarFuncionarios();
                break;

            case 3:
                MenuActions.buscarFuncionario();
                break;

            case 4:
                MenuActions.removerFuncionario();
                break;

            case 0:
                System.out.println("\nObrigado por utilizar o nosso sistema! Até a próxima!\n");
                System.exit(0);

            default:
                break;
        }
    }
}
