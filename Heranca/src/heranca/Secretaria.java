package heranca;

public class Secretaria extends Funcionarios {
    private int ramal;

    public void mostraDados () {
        super.mostraDados();
        System.out.println("Ramal: " + ramal);
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
}
