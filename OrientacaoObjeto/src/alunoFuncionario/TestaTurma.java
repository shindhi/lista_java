package alunoFuncionario;

public class TestaTurma {
    public static void main(String[] args) {
        Turma t1 = new Turma();
        t1.periodo = 3;
        t1.serie = "4 serie";
        t1.sigla = "AB";
        t1.tipoDeEnsino = "teste";

        Turma t2 = new Turma();
        t2.periodo = 5;
        t2.serie = "4 serie";
        t2.sigla = "VB";
        t2.tipoDeEnsino = "Teste";

        System.out.println("Periodo: " + t1.periodo +
                " | Serie: " + t1.serie +
                " | Sigla: " + t1.sigla +
                " | Tipo de Ensino" + t1.tipoDeEnsino);

        System.out.println();

        System.out.println("Periodo: " + t2.periodo +
                " | Serie: " + t2.serie +
                " | Sigla: " + t2.sigla +
                " | Tipo de Ensino" + t2.tipoDeEnsino);
    }
}
