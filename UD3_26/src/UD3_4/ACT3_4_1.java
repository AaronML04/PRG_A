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
public class ACT3_4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int min, max, total, suma;
        float media;
        
        
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
        
        // Mostramos la matriz
        System.out.println("\nLa matriz es:");
        for (int[] arr : mat) {
            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
        
        //Calcular min
        min = mat[0][0];
        for(int[] array : mat){
            for(int valor : array){
                if(valor < min){
                    min = valor;
                }
            }
        }
        
        //Calcular max
        max = mat[0][0];
        for(int[] array : mat){
            for(int valor : array){
                if(valor > max){
                    max = valor;
                }
            }
        }
        
        //Calcular media
        total = 0; suma = 0;
        for(int[] array : mat){
            for(int valor: array){
                suma += valor;
                total++;
            }
        }
        media = (float)suma / total;
        
        //Resultados
        System.out.println("Resultados: ");
        System.out.println("Maximo: " + max);
        System.out.println("Minimo. "+ min);
        System.out.println("Media: " + media);
        
        sc.close();
    }
}
