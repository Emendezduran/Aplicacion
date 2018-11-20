package aplicacion;

/**
 *
 * @author emendezduran
 */
public class Ordenador {
    
  
    Cpu processor;
    Raton mouse;
    Teclado keyboard;
    Monitor screen;

    public Ordenador(Cpu processor, Raton mouse, Teclado keyboard, Monitor screen) {
        this.processor = processor;
        this.mouse = mouse;
        this.keyboard = keyboard;
        this.screen = screen;
    }
    
    public Cpu getProcessor() {
        return processor;
    }

    public void setProcessor(Cpu processor) {
        this.processor = processor;
    }

    public Raton getMouse() {
        return mouse;
    }

    public void setMouse(Raton mouse) {
        this.mouse = mouse;
    }

    public Teclado getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Teclado keyboard) {
        this.keyboard = keyboard;
    }

    public Monitor getScrean() {
        return screen;
    }

    public void setScrean(Monitor screan) {
        this.screen = screan;
    }
    
    public float calcularPrecio(){
    float inhalambrico = 1f;
    if (mouse.isInhalambrico()){
    inhalambrico = 1.5f;       
    }
    return processor.getRam()* 5f + keyboard.getNumTeclas() * 0.7f + screen.getPulgadas() * 12f + inhalambrico;
    }

    public void visualizarOrdenador() {
        System.out.println("CARACTERISTICAS DEL ORDENADOR: ");
        System.out.println("CPU: " + processor.toString());
        System.out.println("RATON: " + mouse.toString());
        System.out.println("TECLADO: " + keyboard.toString());
        System.out.println("PANTALLA: " + screen.toString());
    }
    
    
    
}
