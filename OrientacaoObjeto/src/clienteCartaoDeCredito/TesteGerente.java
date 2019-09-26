package clienteCartaoDeCredito;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.salario = 1000;

        System.out.println("Salario: " + g.salario);

        System.out.println("Aumenta o salario em 10% ");
        g.aumentaSalario();

        System.out.println("Salario: " + g.salario);

        System.out.println("Aumenta o salario em 30% ");
        g.aumentaSalario(0.3);

        System.out.println("Salario: " + g.salario);
    }
}
