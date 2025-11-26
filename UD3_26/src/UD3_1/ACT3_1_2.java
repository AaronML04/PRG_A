package UD3_1;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author AARON
 */
public class ACT3_1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Itroduce un numero");
        double num = sc.nextDouble();
        
        if( num == 0 ){
            System.out.println("El numero es 0");
        }else if(num % 2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
    
}

/*
2.

1. Inicio
2. 	Mostrar "Introduzca un número" 
3. 	Leer (num)
4. 	  Si (num es igual a 0) entonces
5.	    Mostrar "El número es 0"
6.	  Sino (si num es divisible por 2) entonces
7.	    Mostrar "El número es par"
8.	  Sino
9.	    Mostrar "El número es impar"
10.	  Fin Si
11. Fin

*/