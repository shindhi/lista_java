package complementar;

import java.util.Locale;
import java.util.Scanner;

public class TestaFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario f = new Funcionario();
        System.out.print("Digite o nome do funcionario: ");
        f.nome = sc.nextLine();

        int escolha = 1;
        while (escolha != 0) {
            System.out.println("1- Alterar nome do usuario");
            System.out.println("2- Alterar o salario");
            System.out.println("3- Imprimir dados atuais");
            System.out.println("0- Sair");

            escolha = sc.nextInt();

            switch (escolha) {
                case(1):
                    sc.nextLine();
                    System.out.print("Digite o nome: ");
                    f.nome = sc.nextLine();
                    System.out.println();
                    break;
                case(2):
                    System.out.print("Digite o novo valor de salario: ");
                    f.salario = sc.nextDouble();
                    System.out.println();
                    break;
                case(3):
                    f.dadosAtuais();
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
