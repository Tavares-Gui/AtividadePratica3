package model;

public abstract class Funcionario {
    protected String nome;
    protected String matricula;

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public abstract double calcularSalario();

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}
