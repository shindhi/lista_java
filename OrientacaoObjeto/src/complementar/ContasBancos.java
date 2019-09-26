package complementar;

public class ContasBancos {
    int numero;
    double limite;
    double saldo;

    void depositar (double valor) {
        this.saldo += valor;
    }

    void sacar (double valor) {
        this.saldo -= valor;
    }

    void imprimeExtrato () {
        System.out.printf("Saldo: %.2f \n\n",this.saldo);
    }
}
