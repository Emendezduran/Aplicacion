package aplicacion;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class Aplicacion {

      public static void main(String[] args) {
          System.out.println("Introduce los datos solicitados a continuacion:");
          Scanner dato = new Scanner(System.in);
          System.out.println("Nucleos y Ram");
          Cpu processor = new Cpu(dato.nextInt(), dato.nextInt());
          System.out.println("Inhalambrico(True/False) y Modelo");
          Raton mouse = new Raton(dato.nextBoolean(), dato.next());
          System.out.println("Numero de Teclas");
          Teclado keyboard = new Teclado(dato.nextInt());
          System.out.println("Marca del Monitor y Pulgadas");
          Monitor screen = new Monitor(dato.next(), dato.nextInt());
          Ordenador computer1 = new Ordenador(processor, mouse, keyboard, screen);
          computer1.visualizarOrdenador();
          System.out.println("PRECIO: {" + computer1.calcularPrecio() + " €}");

        
    }
}
