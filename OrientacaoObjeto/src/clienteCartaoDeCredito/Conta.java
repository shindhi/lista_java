package clienteCartaoDeCredito;

public class Conta {
    int numero;
    double saldo;
    double limite = 100;

    Agencia  agencia;

    Conta () {}

    Conta (Agencia agencia) {
        this.agencia = agencia;
    }

    void deposita (double valor) {
        this.saldo += valor;
    }

    void saca (double valor) {
        this.saldo -= valor;
    }

    void imprimeExtrato () {
//        System.out.println("SALDO: " + this.saldo);
        this.imprimeExtrato(15);
    }

    void imprimeExtrato (int dias) {

    }

    double consultaSaldoDisponivel() {
        return this.saldo + this.limite;
    }

    void transfere (Conta destino, double valor) {
        this.saldo -= valor;
        destino.saldo += valor;
    }
}
