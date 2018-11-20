
package aplicacion;

/**
 *
 * @author emendezduran
 */
public class Raton {
    
    boolean inhalambrico;
    String modelo;

    public Raton() {
    }

    public Raton(boolean inhalambrico, String modelo) {
        this.inhalambrico = inhalambrico;
        this.modelo = modelo;
    }

    public boolean isInhalambrico() {
        return inhalambrico;
    }

    public void setInhalambrico(boolean inhalambrico) {
        this.inhalambrico = inhalambrico;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "inhalambrico: " + inhalambrico + ", modelo: " + modelo;
    }
    
    
}
