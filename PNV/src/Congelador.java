/**
 *
 * @author Germán Andrés L. Urbina Gutiérrez - Ing. mecatrónica
 */
public class Congelador {

    String tipoVacuna;
    int cantDeVacunas;

    public Congelador(String tipoVacuna, int cantDeVacunas) {
        this.tipoVacuna = tipoVacuna;
        this.cantDeVacunas = cantDeVacunas;
    }

    public String getTipoVacuna() {
        return tipoVacuna;
    }

    public void setTipoVacuna(String tipoVacuna) {
        this.tipoVacuna = tipoVacuna;
    }

    public int getCantDeVacunas() {
        return cantDeVacunas;
    }

    public void setCantDeVacunas(int cantDeVacunas) {
        this.cantDeVacunas = cantDeVacunas;
    }
}
