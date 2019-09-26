package clienteCartaoDeCredito;

public class TestaClienteECartao {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(111111);

        c.nome = "Rafael Cosentino";

        cartaoDeCredito.cliente = c;

        System.out.println(cartaoDeCredito.numero);
        System.out.println(cartaoDeCredito.cliente.nome);
    }
}
