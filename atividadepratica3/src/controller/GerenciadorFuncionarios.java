package controller;

import model.Funcionario;
import java.util.ArrayList;

public class GerenciadorFuncionarios {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public boolean removerFuncionario(String matricula) {
        return funcionarios.removeIf(f -> f.getMatricula().equals(matricula));
    }

    public void listarFuncionarios() {
        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome() + " - " + f.getMatricula());
        }
    }

    public Funcionario buscarFuncionarioPorMatricula(String matricula) {
        for (Funcionario f : funcionarios) {
            if (f.getMatricula().equals(matricula)) {
                return f;
            }
        }
        return null;
    }
}
