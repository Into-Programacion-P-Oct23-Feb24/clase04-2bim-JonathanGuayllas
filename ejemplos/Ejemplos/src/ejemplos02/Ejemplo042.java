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
public class Ejemplo042 {

    public static void main(String[] args) {
        // 
        
        int [][] arreglo1 = {{1,2,3}, {3,2,4}, {2,6,2}};
        int [][] arreglo2 = {{1,2,3}, {2,2,2}, {3,1,2}};
        int [][] arreglo3 = new int[3][3];
        // declaro un nuevo arreglo que va a guardar la suma
        int [][] arreglo4 = new int[3][3];
        
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                arreglo3[i][j] = obtenerMultiplicacion(arreglo1[i][j], 
                        arreglo2[i][j]);
                // guarda el valor retornado de la función
                arreglo4[i][j] = obtenerSuma(arreglo1[i][j], 
                        arreglo2[i][j],arreglo3[i][j]);
            }
        }
        // obtengo las matrices que se presentaran en pantalla
        obtenerReporte(arreglo1);
        obtenerReporte(arreglo2);
        obtenerReporte(arreglo3);
        obtenerReporte(arreglo4);
    }
    
    public static void obtenerReporte(int[][] arreglo1){
        String cadena = "";
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1[i].length; j++) {
                cadena = String.format("%s%d\t", cadena, arreglo1
                        [i][j]);
            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.println(cadena);
    }
    
    public static int obtenerMultiplicacion(int a, int b){
        int operacion;
        operacion = a * b;
        return operacion;
        
    } 
    // creo una función que sume lops valores de los 3 arreglos
    public static int obtenerSuma(int a, int b,int c){
        // declaro la variable
        int sumar;
        // sumo los arreglos
        sumar = a + b + c;
        // retorno suma
        return sumar;
    }
       
    
}
