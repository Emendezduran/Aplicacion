
package aplicacion;

/**
 *
 * @author emendezduran
 */
public class Teclado {
    
    private int numTeclas;

    public Teclado() {
    }

    public Teclado(int numTeclas) {
        this.numTeclas = numTeclas;
    }

    public int getNumTeclas() {
        return numTeclas;
    }

    public void setNumTeclas(int numTeclas) {
        this.numTeclas = numTeclas;
    }

    @Override
    public String toString() {
        return "numTeclas: " + numTeclas;
    }
    
}
