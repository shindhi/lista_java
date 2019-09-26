package clienteCartaoDeCredito;

public class TesteMetodosConta {
    public static void main(String[] args) {
        Conta c = new Conta();

        c.deposita(100);
        c.imprimeExtrato();

        c.saca(100);
        c.imprimeExtrato();

        double saldoDisponivel = c.consultaSaldoDisponivel();
        System.out.println("SALDO DISPONIVEL: " + saldoDisponivel);
    }
}
