package clases;

public class Igualdad {
    private final String nombre;
    private final String apellidos;
    private final String correo;

    public Igualdad(String n, String a, String c) {
        this.nombre = n;
        this.apellidos = a;
        this.correo = c;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Igualdad igualdad = (Igualdad) obj;

        if (!nombre.equals(igualdad.nombre)) return false;
        if (!apellidos.equals(igualdad.apellidos)) return false;
        return correo.equals(igualdad.correo);
    }

    @Override
    public int hashCode() {
        int result = nombre.hashCode();
        result = 31 * result + apellidos.hashCode();
        result = 31 * result + correo.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellidos: " + apellidos + ", Correo: " + correo;
    }
}
