package exercicios;

public class Funcionario {
    static double valeRefeicaoDiario = 20.00;

    static void reajusteValeRefeicao (int reajuste) {
        valeRefeicaoDiario = Funcionario.valeRefeicaoDiario * reajuste;

        System.out.printf("Valor do vale com reajuste: %.2f", Funcionario.valeRefeicaoDiario);
    }
}
