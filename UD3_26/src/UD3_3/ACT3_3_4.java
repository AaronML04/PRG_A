/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD3_3;

/**
 *
 * @author AARON
 */
public class ACT3_3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int longitud = 4;
        int[][] mat = new int[longitud][longitud];
        int n = 1;
        int suma = 0;
        
        for(int i = 0; i< mat.length;i++){ // cuenta las filas
            for(int j = 0; j < mat[i].length;j++){ // cuenta columnas
                mat[i][j] = n; // añade valor 1 a la primera posicion de la matriz
                n++; // por el bucle va sumandose 1 a cada posicion de la fila y columna
            }
        }
        
        // Mostrar la matriz
        for(int[] array : mat){ // recorre cada fila de la matriz
            for(int a : array){ //recorre cada elemento de esa fila
                System.out.print(a + "\t");
                suma += a;
            }
            System.out.println();
        }
        System.out.println("la suma es: " + suma);
    
    }
    
}
