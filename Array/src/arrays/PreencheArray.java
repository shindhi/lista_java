package arrays;

public class PreencheArray {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        java.util.Arrays.fill(numeros, 5);

        for (int n : numeros) {
            System.out.println(n);
        }
    }
}
