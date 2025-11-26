
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
public class ACT3_1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca su calificacion");
        int nota = sc.nextInt();
        
        if(nota >= 5){
            System.out.println("Aprobado");
        }else{
            System.out.println("Susoendido");
        }
    }
    
}

/*
1. Inicio
2. 	Mostrar "Introduzca su calificación" 
3. 	Leer (calificacion)
3. 	Si (calificacion es mayor o igual a 5) entonces
4.    	Mostrar "Aprobado"
5. 	Sino
6.    	Mostrar "Suspendido"
7. 	Fin Si
8. Fin

*/