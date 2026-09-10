package com.colegiomagico.reto7;

/**
 * Retorna el número mayor dentro del arreglo de tamaños.
 */
public class CofreVaritas {

    public static int varitaMasPoderosa(int[] tamanos) {
        if (tamanos == null || tamanos.length == 0) {
            return 0; // Manejo de arreglo vacío o nulo
        }

        int maximo = tamanos[0];

        for (int i = 1; i < tamanos.length; i++) {
            if (tamanos[i] > maximo) {
                maximo = tamanos[i];
            }
        }

        return maximo;
    }

    public static void main(String[] args) {
        int[] varitas = {10, 15, 8};
        System.out.println("Poderosa: " + varitaMasPoderosa(varitas));
    }
}