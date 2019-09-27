package heranca;

import org.w3c.dom.ls.LSOutput;

public class Funcionarios {
    private String nome;
    private double salario;

    public double calculaBonificacao () {
        return this.salario * 0.1;
    }

    public void mostraDados () {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Bonificacao: " + this.calculaBonificacao());
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
