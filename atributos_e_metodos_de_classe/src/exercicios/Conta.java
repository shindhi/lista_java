package exercicios;

public class Conta {
    static int contador;

    int numero;

    Conta () {
        Conta.contador ++;

        this.numero = Conta.contador;
    }

    static void zerarContador () {
        System.out.println("Contador: " + Conta.contador);
        System.out.println("Zerando o contador de contas ...");
        Conta.contador = 0;
    }


}
