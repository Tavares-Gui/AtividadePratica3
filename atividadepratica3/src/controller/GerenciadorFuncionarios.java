package controller;

import model.Funcionario;
import java.util.ArrayList;

public class GerenciadorFuncionarios {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public boolean removerFuncionario(String matricula) {
        for (Funcionario func : funcionarios) {
            if (func.getMatricula().equals(matricula)) {
                funcionarios.remove(func);
                return true;
            }
        }
        return false;
    }    

    public void listarFuncionarios() {
        for (Funcionario funcs : funcionarios) {
            System.out.println(funcs.getNome() + " - " + funcs.getMatricula());
        }
    }

    public Funcionario buscarFuncionarioPorMatricula(String matricula) {
        for (Funcionario funcs : funcionarios) {
            if (funcs.getMatricula().equals(matricula)) {
                return funcs;
            }
        }
        return null;
    }
}
