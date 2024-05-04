package model;

public class Estagiario extends Funcionario implements ITrabalhavel {
    private int horasTrabalho;
    private Funcionario supervisor;

    public Estagiario(String nome, String matricula, int horasTrabalho) {
        super(nome, matricula);
        this.horasTrabalho = horasTrabalho;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalho * 20; // Valor exemplo por hora
    }

    @Override
    public void trabalhar() {
        System.out.println("Realizando tarefas de estagiário.");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Progresso de estagiário reportado.");
    }
}
