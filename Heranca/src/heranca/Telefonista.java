package heranca;

public class Telefonista extends Funcionarios {
    private int estacaoDeTrabalho;

    public void mostraDados () {
        super.mostraDados();
        System.out.println("Estacao de trabalho: " + estacaoDeTrabalho);
    }

    public int getEstacaoDeTrabalho() {
        return estacaoDeTrabalho;
    }

    public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }
}
