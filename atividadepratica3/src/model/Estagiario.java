package model;

public class Estagiario extends Funcionario implements ITrabalhavel {
    private int horasTrabalho;
    private Funcionario supervisor;

    public Estagiario(String nome, String matricula, int horasTrabalho) {
        super(nome, matricula);
        this.horasTrabalho = horasTrabalho;
    }

    public static void setSupervisor(Funcionario supervisor) {
        supervisor = supervisor;
    }
    
    public Funcionario getSupervisor() {
        return supervisor;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalho * 10; 
    }

    @Override
    public void trabalhar() {
        System.out.println("Realizando tarefas de estagiário.");
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Progresso de estagiário reportado.");
    }

    @Override
    public String toString() {
        return "Estagiário: " + getNome() + " (Supervisor: " + supervisor + ")";
    }

    public int getHorasTrabalho() {
        return horasTrabalho;
    }

    public void setHorasTrabalho(int horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }
}
