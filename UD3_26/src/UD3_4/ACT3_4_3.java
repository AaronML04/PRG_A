/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD3_4;

/**
 *
 * @author AARON
 */
public class ACT3_4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int X = 4;
        int[][] mat = new int[X][X];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = i+j;
            }
        }

        // Imprimir el contingut de la matriu
		
        for (int[] array : mat) {
            System.out.print("[ ");
            for (int a: array) {
                System.out.print(a + " ");
            }
            System.out.println("]"); 
        }

        // Imprimir el contingut de la diagonal principal
	System.out.println();
	System.out.print("[ ");
        for (int i = 0; i < mat.length; i++) {
		System.out.print(mat[i][i] + " ");
        }
	System.out.println("]");
		
	// Imprimir el contingut de la diagonal secundària 
	System.out.println();
	System.out.print("[ ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i + j == mat.length - 1) { // condición de diagonal secundaria
                System.out.print(mat[i][j] + " ");
                }
            }
        }
	System.out.print("]");
        
        System.out.println();
        
        /**
         * 
         *Contenido adicional
         * 
         */
         
        
        
        //muestra n columnas
        int[] col = {3, 0};
        System.out.print("[ ");
        for(int i = 0; i < mat.length; i++){
            for(int c = 0; c< col.length; c++){
                System.out.print( mat[i][c] + " ");
            }
            
        }
        System.out.println("]");
        
        //muestra una columna 
        int colum = 2;
        System.out.print("[ ");
        for(int i=0; i < mat.length; i++){
            System.out.print(mat[i][colum] + " ");
        }
        System.out.println("]");
    }
}
    

