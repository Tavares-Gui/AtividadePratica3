package model;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Funcionario implements ITrabalhavel {
    private double bonusAnual;
    private List<Funcionario> equipe;

    public Gerente(String nome, String matricula, double bonusAnual) {
        super(nome, matricula);
        this.bonusAnual = bonusAnual;
        this.equipe = new ArrayList<>();
    }

    public void adicionarMembroEquipe(Funcionario funcionario) {
        equipe.add(funcionario);
    }

    public String listarEquipe() {
        StringBuilder equipeStr = new StringBuilder();
        equipeStr.append("[");
        for (int i = 0; i < equipe.size(); i++) {
            equipeStr.append(equipe.get(i).getNome());
            if (i < equipe.size() - 1) {
                equipeStr.append(", ");
            }
        }
        equipeStr.append("]");
        return equipeStr.toString();
    }

    @Override
    public double calcularSalario() {
        return 8000 + bonusAnual;
    }

    @Override
    public void trabalhar() {
        System.out.println("Gerenciando equipe.");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Relatório de progresso da equipe.");
    }

    public void setEquipe(List<Funcionario> equipe) {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return "Gerente: " + getNome() + " (Equipe: " + listarEquipe() + ")";
    }

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    public List<Funcionario> getEquipe() {
        return equipe;
    }
}
