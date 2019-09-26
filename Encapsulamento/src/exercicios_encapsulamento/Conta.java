package exercicios_encapsulamento;

public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita (double valor) {
        this.saldo += valor;
        this.descontaTarifa();
    }
    public void saca (double valor) {
        this.saldo -= valor;
        this.descontaTarifa();
    }
    private void descontaTarifa () {
        this.saldo -= 0.1;
    }
}
