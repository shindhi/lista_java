package exercicios_encapsulamento;

public class TesteConta {
    public static void main(String[] args) {
        Conta c = new Conta();

        c.setSaldo(2000);
        c.deposita(200);
        c.saca(100);

        System.out.println(c.getSaldo());
    }
}
