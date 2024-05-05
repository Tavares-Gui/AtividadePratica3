package model;

import java.util.List;


public class Gerente extends Funcionario implements ITrabalhavel {
    private double bonusAnual;
    private List<Funcionario> equipe;

    public Gerente(String nome, String matricula, double bonusAnual) {
        super(nome, matricula);
        this.bonusAnual = bonusAnual;
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
        return "Gerente: " + getNome();
    }
}
