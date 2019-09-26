package clienteCartaoDeCredito;

public class TestaCartaoDeCredito {
    public static void main(String[] args) {
        CartaoDeCredito cartaoDeCredito1 = new CartaoDeCredito(111111);
        cartaoDeCredito1.dataDeValidade = "01/01/2019";

        CartaoDeCredito cartaoDeCredito2 = new CartaoDeCredito(222222);
        cartaoDeCredito2.dataDeValidade = "01/01/2019";

        System.out.println(cartaoDeCredito1.numero);
        System.out.println(cartaoDeCredito1.dataDeValidade);

        System.out.println(cartaoDeCredito2.numero);
        System.out.println(cartaoDeCredito2.dataDeValidade);
    }
}
