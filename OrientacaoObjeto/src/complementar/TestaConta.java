package complementar;

import java.util.Locale;
import java.util.Scanner;

public class TestaConta {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ContasBancos c = new ContasBancos();

        System.out.print("Numero da conta: ");
        c.numero = sc.nextInt();

        System.out.print("Saldo: ");
        c.saldo = sc.nextDouble();

        System.out.print("Limite: ");
        c.limite = sc.nextDouble();

        int escolha = 1;
        while (escolha != 0) {
            System.out.println("1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("3- Imprimir Extrato");
            System.out.println("0- Sair");
            System.out.println();

            escolha = sc.nextInt();
            double valor = 0.0;

            switch (escolha) {
                case(1):
                    System.out.print("Digite um valor a ser depositado: ");
                    valor = sc.nextDouble();
                    c.depositar(valor);
                    break;
                case(2):
                    System.out.print("Digite um valor a ser sacado: ");
                    valor = sc.nextDouble();
                    c.sacar(valor);
                    break;
                case(3):
                    c.imprimeExtrato();
                    break;
                case(0):
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }

        }

        sc.close();
    }
}
