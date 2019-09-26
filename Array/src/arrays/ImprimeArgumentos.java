package arrays;

public class ImprimeArgumentos {
    public static void main(String[] args) {
        Pessoas pessoas = new Pessoas();
        String[] arrPessoas = pessoas.nomes;

        for(String p : arrPessoas){
            System.out.println(p);
        }
    }
}
