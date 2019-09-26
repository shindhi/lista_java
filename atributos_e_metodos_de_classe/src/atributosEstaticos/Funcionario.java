package atributosEstaticos;

public class Funcionario {
    String nome;
    double salario;
    static double valeRefeicaoDiario;

    void aumentaSalario (double aumento) {
        this.salario += aumento;
    }

    static void reajusteValeRefeicaoDiario (double taxa) {
        Funcionario.valeRefeicaoDiario += Funcionario.valeRefeicaoDiario * taxa;
    }

}
