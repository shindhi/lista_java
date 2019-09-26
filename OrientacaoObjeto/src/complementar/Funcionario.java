package complementar;

public class Funcionario {
    String nome;
    double salario;

    Funcionario () {
        this.salario = 200.00;
    }

    void dadosAtuais () {
        System.out.println("\nDados atuais: ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println();
    }
}
