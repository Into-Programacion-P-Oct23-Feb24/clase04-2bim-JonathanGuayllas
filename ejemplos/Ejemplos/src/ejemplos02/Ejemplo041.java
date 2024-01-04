/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    public static void main(String[] args) {
        // 
        int[][] arreglo1 = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] arreglo2 = {{1, 2, 3}, {2, 2, 2}, {3, 1, 2}};
        int[][] arreglo3 = new int[3][3];

        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                arreglo3[i][j] = obtenerMultiplicacion(arreglo1[i][j],
                        arreglo2[i][j]);

            }
        }
        System.out.println("Arreglo 1:");
        resultado(arreglo1);
        System.out.println("Arreglo 2:");
        resultado(arreglo2);
        System.out.println("Arreglo resultado:");
        resultado(arreglo3);
    }

    public static int obtenerMultiplicacion(int a, int b) {
        int operacion;
        operacion = a * b;
        return operacion;
    }
    // para presentar las matrices
    public static void resultado(int arreglo[][]){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(arreglo[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

}
