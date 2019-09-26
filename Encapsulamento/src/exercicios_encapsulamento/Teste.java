package exercicios_encapsulamento;

public class Teste {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();

        f.setNome("Rafael Cosentino");
        f.setSalario(2000);

        System.out.println(f.getNome());
        System.out.println(f.getSalario());
    }
}
