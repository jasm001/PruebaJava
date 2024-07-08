import clases.Igualdad;
import clases.Utils;
import clases.Palabras;
import clases.Identidad;
import clases.PuntoImpl;
import implementaciones.PuntoHijoImpl;

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.util.ArrayList;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.awt.*;
import java.net.URI;

public class Main {
    public static void main(String[] args) {

        boolean enMenuAccion = true;
        boolean enMenuAccion2 = true;
        boolean enAplicacion = true;
        while (enAplicacion) {
            int accion = 0;
            int accionEleccion = 0;
            StringBuilder opcionesMenuMensaje = new StringBuilder();
            Utils.contadorNavegaciones += 1;
            opcionesMenuMensaje.append("Número de veces que ha ingresado al menú " + Utils.contadorNavegaciones.toString());
            opcionesMenuMensaje.append("\n1 - Uso de Map Ejer. 1\n");
            opcionesMenuMensaje.append("2 - Herencia y constantes Ejer. 3-5\n");
            opcionesMenuMensaje.append("3 - Expresión lógica Ejerc. 6\n");
            opcionesMenuMensaje.append("4 - Igualdad e Identidad Ejer. 7\n");
            opcionesMenuMensaje.append("5 - Máximo de 3 números  Ejerc. 8-9\n");
            opcionesMenuMensaje.append("6 - Variable estatica Ejerc. 10\n");
            opcionesMenuMensaje.append("7 - SortedMap cuenta palabras Ejerc. 11\n");
            opcionesMenuMensaje.append("8 - Cerrar\n");
            accion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la opción a trabajar\n" + opcionesMenuMensaje.toString()));

            //Uso del Map
            if (accion == 1) {
                EjemploMap ejemploMap = new EjemploMap();
                while (enMenuAccion) {
                    opcionesMenuMensaje = new StringBuilder();
                    opcionesMenuMensaje.append("1 - Agregar valor al Map\n");
                    opcionesMenuMensaje.append("2 - Buscar valor clave\n");
                    opcionesMenuMensaje.append("3 - Eliminar valor clave\n");
                    opcionesMenuMensaje.append("4 - Ver todo\n");
                    opcionesMenuMensaje.append("5 - Regresar");
                    accionEleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la acción:\n" + opcionesMenuMensaje));

                    boolean resultado;
                    String clave = "";
                    String valor = "";
                    switch (accionEleccion) {
                        case 1:
                            clave = JOptionPane.showInputDialog(null, "Ingrese el identificador con el cual desea crear el registro");
                            valor = JOptionPane.showInputDialog(null, "Ingrese el valor asociado con la clave -> " + clave);
                            ejemploMap.AgregarInformacionUsuario(clave, valor);

                            break;
                        case 2:
                            clave = JOptionPane.showInputDialog(null, "Ingrese el identificador con el cual desea buscar el registro");
                            String valorEncontrado = ejemploMap.RecuperarValorPorClave(clave);
                            if (valorEncontrado != null) {
                                JOptionPane.showMessageDialog(null, "Se encontro el valor '" + valorEncontrado + "' para la clave " + clave);
                            } else {
                                JOptionPane.showMessageDialog(null, "Registro no encontrado para: " + clave);
                            }
                            break;
                        case 3:
                            clave = JOptionPane.showInputDialog(null, "Ingrese el identificador con el cual desea eliminar el registro");
                            resultado = ejemploMap.EliminarValor(clave);
                            if (resultado) {
                                JOptionPane.showMessageDialog(null, "Eliminado con exito el registro");
                            } else {
                                JOptionPane.showMessageDialog(null, "Registro no encontrado para: " + clave);
                            }
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, ejemploMap.VerTodos());
                            break;
                        default:
                            enMenuAccion = false;
                            break;
                    }
                }
            } else if (accion == 2) { //Uso de Impl y reutilización
                double x1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la coordenada X del punto 1:"));
                double y1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la coordenada Y del punto 1:"));

                PuntoImpl punto1 = new PuntoImpl(x1, y1);

                double x2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la coordenada X del punto hijo:"));
                double y2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la coordenada Y del punto hijo:"));

                PuntoHijoImpl puntoHijo = new PuntoHijoImpl(x2, y2);

                JOptionPane.showMessageDialog(null, "Punto 1: " + punto1);
                JOptionPane.showMessageDialog(null, "Punto Hijo: " + puntoHijo);

                // Comparacion de puntos
                JOptionPane.showMessageDialog(null, "Son iguales: " + punto1.equals(puntoHijo));
            } else if (accion == 3) { //Expresión Lógica
                boolean resultadoExpresion = Utils.ExpresionLogica(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número\n")));
                JOptionPane.showMessageDialog(null, "El resultado de la evalauacion es: " + resultadoExpresion);
            } else if (accion == 4) { //Igualdad e Identidad

                Menu ejemploii = new Menu();
                while (enMenuAccion2) {
                    opcionesMenuMensaje = new StringBuilder();
                    opcionesMenuMensaje.append("1 - Igualdad\n");
                    opcionesMenuMensaje.append("2 - Identidad\n");
                    opcionesMenuMensaje.append("3 - Regresar");
                    accionEleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la acción:\n" + opcionesMenuMensaje));


                    switch (accionEleccion) {
                        case 1:
                            //Ingreso de datos
                            String nombres1 = JOptionPane.showInputDialog("Ingrese el nombre del primer objeto:");
                            String apellidoss1 = JOptionPane.showInputDialog("Ingrese los apellidos del primer objeto:");
                            String correos1 = JOptionPane.showInputDialog("Ingrese el correo del primer objeto:");

                            String nombres2 = JOptionPane.showInputDialog("Ingrese el nombre del segundo objeto:");
                            String apellidoss2 = JOptionPane.showInputDialog("Ingrese los apellidos del segundo objeto:");
                            String correos2 = JOptionPane.showInputDialog("Ingrese el correo del segundo objeto:");

                            //Creacion de los objetos
                            Igualdad n1 = new Igualdad(nombres1, apellidoss1, correos1);
                            Igualdad n2 = new Igualdad(nombres2, apellidoss2, correos2);

                            //EJEMPLO 1 SIN EQUALS
                            String mensaje1;
                            if (n2 == n1) {
                                mensaje1 = "LOS OBJETOS SON IGUALES.\nEJEMPLO SIN EQUALS\n";
                            } else {
                                mensaje1 = "LOS OBJETOS NO SON IGUALES.\nEJEMPLO SIN EQUALS\n";
                            }
                            mensaje1 += "Comparando:\nObjeto 1: " + n1 + "\nObjeto 2: " + n2;
                            JOptionPane.showMessageDialog(null, mensaje1);

                            //EJEMPLO 2 CON EQUALS
                            String mensaje2;
                            if (n1.equals(n2)) {
                                mensaje2 = "LOS OBJETOS SON IGUALES.\nEJEMPLO CON EQUALS\n";
                            } else {
                                mensaje2 = "LOS OBJETOS NO SON IGUALES.\nEJEMPLO CON EQUALS\n";
                            }
                            mensaje2 += "Comparando:\nObjeto 1: " + n1 + "\nObjeto 2: " + n2;
                            JOptionPane.showMessageDialog(null, mensaje2);

                            break;
                        case 2:
                            //Ingreso de datos
                            String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del primer objeto:");
                            String apellidos1 = JOptionPane.showInputDialog("Ingrese los apellidos del primer objeto:");
                            String correo1 = JOptionPane.showInputDialog("Ingrese el correo del primer objeto:");

                            String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre del segundo objeto:");
                            String apellidos2 = JOptionPane.showInputDialog("Ingrese los apellidos del segundo objeto:");
                            String correo2 = JOptionPane.showInputDialog("Ingrese el correo del segundo objeto:");

                            String nombre3 = JOptionPane.showInputDialog("Ingrese el nombre del tercer objeto:");
                            String apellidos3 = JOptionPane.showInputDialog("Ingrese los apellidos del tercer objeto:");
                            String correo3 = JOptionPane.showInputDialog("Ingrese el correo del tercer objeto:");

                            // Creacion de los objetos
                            Identidad.Datos d1 = new Identidad.Datos(nombre1, apellidos1, correo1);
                            Identidad.Datos d2 = new Identidad.Datos(nombre2, apellidos2, correo2);
                            Identidad.Datos d3 = new Identidad.Datos(nombre3, apellidos3, correo3);

                            //Ejemplo 1: Comparacion de identidad de los objetos
                            Identidad.comparacionIdentidad(d1, d3);

                            //Ejemplo 2: Comparacion de identidad de los objetos
                            Identidad.comparacionIdentidad(d2, d2);

                            //Ejemplo 3: Comparacion de igualdad por contenido
                            Identidad.compararIgualdad(d1, d2);

                            //Ejemplo 4: Comparacion de igualdad por contenido
                            Identidad.compararIgualdad(d1, d3);
                            break;
                        default:
                            enMenuAccion2 = false;
                            break;
                    }
                }

            } else if (accion == 5) { //Máximo de 3 Números
                ArrayList<Integer> entradas = new ArrayList<>();
                JOptionPane.showMessageDialog(null, "Calculadora de numero mayor de 3");
                for (int i = 0; i < 3; i++) {
                    entradas.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número\n")));
                }
                try {
                    Integer numMayor = Utils.NumeroMayor(entradas.get(0), entradas.get(1), entradas.get(2));
                    JOptionPane.showMessageDialog(null, "Número mayor de los ingresados es: " + numMayor);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Ocurrió un error: " + ex.getMessage());
                }
            } else if (accion == 6) { //Variable Estática
                String url = "https://github.com/jasm001/VariableEstatica.git";
                String message = "<html>El ejercicio 10 de variable estática está en el siguiente repositorio: <br><a href='" + url + "'>" + url + "</a></html>";

                JEditorPane editorPane = new JEditorPane("text/html", message);
                editorPane.setEditable(false);
                editorPane.setOpaque(false);
                editorPane.addHyperlinkListener(new HyperlinkListener() {
                    @Override
                    public void hyperlinkUpdate(HyperlinkEvent e) {
                        if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                            try {
                                Desktop.getDesktop().browse(new URI(url));
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                        }
                    }
                });


                JOptionPane.showMessageDialog(null, editorPane);
            } else if (accion == 7) { //Uso SortedMap
                String frase = JOptionPane.showInputDialog(null, "Ingrese una frase:");

                // Contamos las ocurrencias
                SortedMap<String, Integer> wordCounts = Palabras.cuentaPalabras(frase);

                // Construimos el mensaje para mostrar las frecuencias
                StringBuilder message = new StringBuilder();
                message.append("Total de palabras = ").append(wordCounts.size()).append("\n");
                for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                    message.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
                }

                // Mostramos el resultado utilizando JOptionPane
                JOptionPane.showMessageDialog(null, message.toString());
            } else if (accion == 8) {
                enAplicacion = false;
            } else {
                enAplicacion = false;
            }
        }
    }
}
