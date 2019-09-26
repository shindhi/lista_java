package alunoFuncionario;

import java.net.HttpURLConnection;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Turma t1 = new Turma();
        aluno1.nome = "Diogo";
        aluno1.dataDeNascimento = "30/05/1999";
        aluno1.rg = 504789782;
        t1.periodo = 3;
        t1.serie = "4 serie";
        t1.sigla = "AB";
        t1.tipoDeEnsino = "ADS";
        aluno1.turma = t1;

        Aluno aluno2 = new Aluno();
        Turma t2 = new Turma();
        aluno2.nome = "Rafael";
        aluno2.dataDeNascimento = "20/03/1998";
        aluno2.rg = 504789782;
        t2.periodo = 5;
        t2.serie = "4 serie";
        t2.sigla = "VB";
        t2.tipoDeEnsino = "Teste";
        aluno2.turma = t2;


        System.out.println(
                "alunoFuncionario.Aluno: " + aluno1.nome +
                " | RG: " + aluno1.rg +
                " | Data de Nascimento: " + aluno1.dataDeNascimento +
                " | Periodo: " + aluno1.turma.periodo +
                " | Serie: " + aluno1.turma.serie +
                " | Sigla: " + aluno1.turma.sigla +
                " | Tipo de ensino: " + aluno1.turma.tipoDeEnsino
        );

        System.out.println();

        System.out.println(
                "alunoFuncionario.Aluno: " + aluno2.nome +
                        " | RG: " + aluno2.rg +
                        " | Data de Nascimento: " + aluno2.dataDeNascimento +
                        " | Periodo: " + aluno2.turma.periodo +
                        " | Serie: " + aluno2.turma.serie +
                        " | Sigla: " + aluno2.turma.sigla +
                        " | Tipo de ensino: " + aluno2.turma.tipoDeEnsino
        );
    }
}
