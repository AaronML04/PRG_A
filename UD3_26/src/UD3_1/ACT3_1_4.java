/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD3_1;

import java.util.Scanner;

/**
 *
 * @author AARON
 */
public class ACT3_1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzaca su calificacion");
        int calificacion = sc.nextInt();
        
        if(calificacion >= 9){
            System.out.println("Sobresaliente");
        }else if( calificacion >= 7){
            System.out.println("Notable");
        }else if (calificacion >= 6){
            System.out.println("Bien");
        }else if(calificacion >=5){
            System.out.println("Aprobado");
        }else if(calificacion >=3){
            System.out.println("Insuficiente");
        }else{
            System.out.println("Muy deficiente");
        }
            
    }
    
}

/*
1. Inicio
2. 	Mostrar "Introduzca su calificación" 
3. 	Leer (calificacion)
4. 	Si (calificacion es mayor o igual a 9) entonces
5.    	Mostrar "Sobresaliente"
6. 	Sino (si calificacioºn es mayor o igual a 7) entonces
7.    	Mostrar "Notable"
8. 	Sino (si calificacion es mayor o igual a 6) entonces
9.    	Mostrar "Bien"
10. 	Sino (si calificacion es mayor o igual a 5) entonces
11.   	Mostrar "Aprobado"
12. 	Sino (si calificacion es mayor o igual a 3) entonces
13.   	Mostrar "Insuficiente"
14. 	Sino
15.   	Mostrar "Muy deficiente"
16. 	Fin Si
17. Fin

*/