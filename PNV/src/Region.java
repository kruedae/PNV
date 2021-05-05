/**
 *
 * @author Germán Andrés L. Urbina Gutiérrez - Ing. mecatrónica
 */
public class Region {
    
    String region;
    int poblaccion;
    //FreezerStack;

    public Region(String region, int poblaccion) {
        this.region = region;
        this.poblaccion = poblaccion;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPoblaccion() {
        return poblaccion;
    }

    public void setPoblaccion(int poblaccion) {
        this.poblaccion = poblaccion;
    }    
}
