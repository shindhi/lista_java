package arrays;

import java.util.Arrays;

public class OrdenandoArrays {
    public static void main(String[] args) {
        Pessoas p = new Pessoas();

        String[] nomes = p.nomes;
        Arrays.sort(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
