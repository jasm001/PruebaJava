package clases;

import java.util.Objects;

public class PuntoImpl {
    // Creamos los atributos de los vectores
    protected final double x;
    protected final double y;

    // Creamos igual los constructores de los vectores
    public PuntoImpl(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Creamos los metodos setter y getters de los vectores
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    //en este apartado usamos los metodos genericos, en este caso toString() para sobreescritura
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    //aca creamos el booleano generico para evaluar igualdad
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PuntoImpl punto = (PuntoImpl) obj;
        return Double.compare(punto.x, x) == 0 && Double.compare(punto.y, y) == 0;
    }

    @Override
    //usamos hashcode para calcular el entero de un objeto
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

