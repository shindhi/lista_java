package arrays;

import java.util.Locale;
import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] arrNumeros = new int[10];

        for (int i = 0; i < arrNumeros.length; i++) {
            arrNumeros[i] = sc.nextInt();
        }
        



        sc.close();
    }
}
