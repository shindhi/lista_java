package alunoFuncionario;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.cargo = "Professor";
        f1.salario = 2000.00;

        Funcionario f2 = new Funcionario();
        f2.cargo = "Faxineiro";
        f2.salario = 1500.00;

        System.out.printf("Cargo: %s | Salario: %.2f", f1.cargo, f1.salario);

        System.out.println();

        System.out.printf("Cargo: %s | Salario: %.2f", f2.cargo, f2.salario);
    }
}
