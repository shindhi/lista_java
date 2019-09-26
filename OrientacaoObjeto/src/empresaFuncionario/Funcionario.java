package empresaFuncionario;

public class Funcionario {
    String nome;
    double salario;

    void deposito (double valor) {
        this.salario += valor;
    }

    void saque (double valor) {
        this.salario -= valor;
    }
}
