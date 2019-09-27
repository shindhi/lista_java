package heranca;

public class TesteFuncionarios {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setNome("Rafael Cosentino");
        g.setSalario(2000);
        g.setUsuario("rafael.cosentino");
        g.setSenha("12345");

        Telefonista t = new Telefonista();
        t.setNome("Carolina Mello");
        t.setSalario(5000);
        t.setEstacaoDeTrabalho(13);

        Secretaria s = new Secretaria();
        s.setNome("Tatiane Andrade");
        s.setSalario(1500);
        s.setRamal(198);

        System.out.println("Gerente");
        g.mostraDados();

        System.out.println();
        System.out.println("Telefonista");
        t.mostraDados();

        System.out.println();
        System.out.println("Secretaria");
        s.mostraDados();
    }
}
