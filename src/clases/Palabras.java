package clases;

import java.util.*;

public class Palabras {
    public static SortedMap<String, Integer> cuentaPalabras(String frase) {
        // Crear un TreeMap para almacenar la cuenta de palabras ordenadas
        SortedMap<String, Integer> wordCounts = new TreeMap<>();
        final String[] AVOID_WORDS = new String[]{"is", "third"};

        // Convertir la frase en palabras
        Scanner input = new Scanner(frase);
        while (input.hasNext()) {
            String next = input.next().toLowerCase();
            if (Arrays.asList(AVOID_WORDS).contains(next)) continue;

            wordCounts.put(next, wordCounts.getOrDefault(next, 0) + 1);
        }

        return wordCounts;
    }
}