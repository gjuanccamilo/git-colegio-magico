package com.colegiomagico.reto3;

/**
 * Usa un ciclo for para crear una cadena que repita la palabra 'Pocion ' la cantidad de veces indicada.
 */
public class PocionCiclos {
    public static String preparar(int cantidad) {
        String nn="";
     for (int i = 0; i < cantidad; i++) {
            nn += "Pocion";
        }
        
        return nn;
    }

    public static void main(String[] args) {
        System.out.println("Preparando 3 pociones: " + preparar(3));
    }
}
