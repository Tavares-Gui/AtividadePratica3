package model;

public class Desenvolvedor extends Funcionario implements ITrabalhavel {
    private String tecnologia;

    public Desenvolvedor(String nome, String matricula, String tecnologia) {
        super(nome, matricula);
        this.tecnologia = tecnologia;
    }

    @Override
    public double calcularSalario() {
        return 3000; // Valor base exemplo
    }

    @Override
    public void trabalhar() {
        System.out.println("Desenvolvendo em " + tecnologia);
    }

    @Override
    public void relatarProgresso() {
        System.out.println("Progresso do desenvolvimento reportado.");
    }
}
