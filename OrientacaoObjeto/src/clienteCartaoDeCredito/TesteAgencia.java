package clienteCartaoDeCredito;

public class TesteAgencia {
    public static void main(String[] args) {
        Agencia agencia1 = new Agencia(123);

        Agencia agencia2 = new Agencia(5678);

        System.out.println(agencia1.numero);

        System.out.println(agencia2.numero);
    }
}
