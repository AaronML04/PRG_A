/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD3_4;

import java.util.Scanner;

/**
 *
 * @author AARON
 */
public class ACT3_4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila;
        int col;
        
        System.out.println("Introduce un numero para la longitud  y ancho de la Matriz");
        int X = sc.nextInt();
        
        
        int[][] mat = new int[X][X];
        
        // Llenamos la matriz con valores
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < X; j++) {
                System.out.print("Introduce el valor para [" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }
        
        for(int[] arr : mat){
            System.out.print("[ ");
            for(int a : arr){
                System.out.print(a + " ");
            }
            System.out.println("]");
        }
        
        System.out.println();
        
        System.out.println("Escoge la fila que quieres mostrar");
        fila = sc.nextInt();
        System.out.print("[ ");
        for(int i = 0; i < mat.length; i++){
            System.out.print(mat[fila][i] + " ");
        }
        System.out.println("]");
        
        System.out.println();
        
        System.out.println("Introduce un numero para mostrar una columna");
        col = sc.nextInt();
        System.out.print("[ ");
        for(int i = 0; i < mat.length; i++){
            System.out.print(mat[i][col] + " ");
        }
        System.out.println("]");
    }
    
}
