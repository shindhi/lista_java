package empresaFuncionario;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.nome = "Diogo";
        f1.salario = 1000.00;

        f1.deposito(100.00);
        System.out.println(f1.salario);

        f1.saque(200.00);
        System.out.println(f1.salario);
    }
}
