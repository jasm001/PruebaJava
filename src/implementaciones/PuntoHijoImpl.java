package implementaciones;

import clases.PuntoImpl;

public class PuntoHijoImpl extends PuntoImpl {
    // Constructor especifico para PuntoHijo que llama al constructor de la clase base
    public PuntoHijoImpl(double x, double y) {
        // Llamamos al constructor de la clase base con los valores recibidos
        super(x, y);
    }
}