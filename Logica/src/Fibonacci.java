public class Fibonacci {
    public static void main(String[] args) {

        int atual = 0;
        int aux = 1;
        int soma = 0;
        int i = 0;

        System.out.println(atual);

        while (i < 30) {
            soma = atual + aux;

            System.out.println(soma);
            aux = atual;
            atual = soma;

            i++;
        }

    }
}
