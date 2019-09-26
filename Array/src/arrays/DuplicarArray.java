package arrays;

import java.util.Arrays;

public class DuplicarArray {
    public static void main(String[] args) {
        Pessoas pessoas = new Pessoas();

        String[] nomes = pessoas.nomes;
        String[] nomesDuplicados = Arrays.copyOf(nomes, 10);

        for (String n : nomesDuplicados) {
            System.out.println(n);
        }
    }
}
