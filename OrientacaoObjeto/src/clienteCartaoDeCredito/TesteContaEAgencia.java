package clienteCartaoDeCredito;

public class TesteContaEAgencia {
    public static void main(String[] args) {
        Agencia a = new Agencia(1234);
        Conta c = new Conta(a);

        c.saldo = 1000.0;

        c.agencia = a;

        System.out.println(c.agencia.numero);
        System.out.println(c.saldo);
    }
}
