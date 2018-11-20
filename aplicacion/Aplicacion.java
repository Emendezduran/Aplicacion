package aplicacion;

/**
 *
 * @author emendezduran
 */
public class Aplicacion {

      public static void main(String[] args) {

        Cpu processor = new Cpu(4, 8);
        Raton mouse = new Raton(true, "QWERTY1");
        Teclado keyboard = new Teclado(101);
        Monitor screen = new Monitor("AOC", 16);
        Ordenador computer1 = new Ordenador(processor, mouse, keyboard, screen);
        computer1.visualizarOrdenador();
        System.out.println("PRECIO: {" + computer1.calcularPrecio() + " €}");
        
        
    }
}
