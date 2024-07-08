package clases;

import javax.swing.*;

public class Identidad {
    public static class Datos {
        private final String nombre;
        private final String apellidos;
        private final String correo;

        // Getters para acceder a los campos privados
        public String getNombre() {
            return this.nombre;
        }

        public String getApellidos() {
            return this.apellidos;
        }

        public String getCorreo() {
            return this.correo;
        }

        public Datos(String n, String a, String c) {
            this.nombre = n;
            this.apellidos = a;
            this.correo = c;
        }

        @Override
        public String toString() {
            return "Nombre: " + nombre + ", Apellidos: " + apellidos + ", Correo: " + correo;
        }
    }

    // Funcion de comparacion de 2 objetos por identidad
    public static void comparacionIdentidad(Datos obj1, Datos obj2) {
        String mensaje;
        if (obj1 == obj2) {
            mensaje = "LOS OBJETOS SON IDENTICOS.\nCOMPARACION DE 2 OBJETOS POR IDENTIDAD\n";
        } else {
            mensaje = "LOS OBJETOS NO SON IDENTICOS.\nCOMPARACION DE 2 OBJETOS POR IDENTIDAD\n";
        }
        mensaje += "Comparando:\nObjeto 1: " + obj1 + "\nObjeto 2: " + obj2;
        JOptionPane.showMessageDialog(null, mensaje);
    }

    // Funcion para comparar objetos por contenido
    public static void compararIgualdad(Datos obj1, Datos obj2) {
        String mensaje;
        if (obj1.getNombre().equals(obj2.getNombre()) &&
                obj1.getApellidos().equals(obj2.getApellidos()) &&
                obj1.getCorreo().equals(obj2.getCorreo())) {
            mensaje = "LOS OBJETOS SON IGUALES POR CONTENIDO.\nCOMPARACION DE 2 OBJETOS POR CONTENIDO\n";
        } else {
            mensaje = "LOS OBJETOS NO SON IGUALES POR CONTENIDO.\nCOMPARACION DE 2 OBJETOS POR CONTENIDO\n";
        }
        mensaje += "Comparando:\nObjeto 1: " + obj1 + "\nObjeto 2: " + obj2;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
