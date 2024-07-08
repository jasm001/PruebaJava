package clases;

import java.util.Collections;
import java.util.List;

public class Utils {

    public static Integer contadorNavegaciones = 0;

    //Recibe un numero de parametro y retorno un booleano
    public static boolean ExpresionLogica(int num) {
        return (num >= 1 && num <= 5) || num == 9 ? true : false;
    }

    //Calcula el numero mayor entre 3 a traves de ordenar una lista de Integer
    public static Integer NumeroMayor(Integer num1, Integer num2, Integer num3) {
        if (num1 > 10 || num2 > 10 || num3 > 10)
            throw new IllegalArgumentException("El número debe ser menor o igual a 10");

        List<Integer> numeros = new java.util.ArrayList<>();
        numeros.add(num1);
        numeros.add(num2);
        numeros.add(num3);
        numeros.sort(Collections.reverseOrder());
        return numeros.get(0);
    }
}
