public class Triangulo2 {
    public static void main(String[] args) {

        String line = "" ;
        for (int i = 0; i < 9; i++) {
            System.out.println(line) ;

            int res = i % 4;

            if (res == 0) {
                line = "*" ;
            } else {
                line += "*" ;
            }
        }
    }
}
