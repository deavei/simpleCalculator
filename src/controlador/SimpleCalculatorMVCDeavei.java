package controlador;

import modelo.Operacion;
import vista.CalcVista;

/**
 *
 * @author DavidC
 */
public class SimpleCalculatorMVCDeavei {

    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        CalcVista vista = new CalcVista();
        Controller control = new Controller(vista, operacion);
    }
    
}
