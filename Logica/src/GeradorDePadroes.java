import java.util.Scanner;

public class GeradorDePadroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opc = 1;
        int i;
        String line = "";

        while (opc != 0) {

            System.out.println("Gerador de Padroes");
            System.out.println("Escolha a opcao desejada:");
            System.out.println("1- Padrao");
            System.out.println("2- Padrao");
            System.out.println("3- Padrao");
            System.out.println("4- Padrao");
            System.out.println("5- Padrao");
            System.out.println("0- Sair");

            opc = sc.nextInt();

            switch (opc) {
                case (1):
                    for (i = 1; i <= 100; i++) {
                        int rest = i % 2;
                        if (rest != 0)
                            System.out.println("*");
                        else
                            System.out.println("**");
                    }
                    System.out.print("\n\n");
                    break;

                case (2):
                    for (i = 1; i <= 100; i++) {
                        int rest = i % 4;
                        if (rest != 0)
                            System.out.println(i);
                        else
                            System.out.println("PI");
                    }
                    System.out.print("\n\n");
                    break;

                case (3):
                    line = "";
                    for (i = 0; i <= 5; i++) {
                        System.out.println(line);
                        line += "*";
                    }
                    System.out.print("\n\n");
                    break;

                case (4):
                    line = "";
                    for (i = 0; i <= 8; i++) {
                        int rest = i % 4;

                        System.out.println(line);

                        if(rest != 0)
                            line += "*";
                        else
                            line = "*";
                    }
                    System.out.print("\n\n");
                    break;

                case (5):
                    int atual = 0;
                    int aux = 1;
                    int soma = 0;
                    i = 0;

                    System.out.println(atual);

                    while (i < 30) {
                        soma = atual + aux;

                        System.out.println(soma);

                        aux = atual;
                        atual = soma;

                        i++;
                    }
                    System.out.print("\n\n");
                    break;

                default:
                    System.out.println("\n\nPadrao Invalido!");
                    break;
            }

        }

        sc.close();
    }
}
