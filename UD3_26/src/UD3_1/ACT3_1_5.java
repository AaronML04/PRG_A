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
public class ACT3_1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double resultado;
        
        
        System.out.println("Elija la conversión que desea realizar:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Fahrenheit a Celsius");
        
        double eleccion = sc.nextDouble();
        
        System.out.println("Itroduzca la temperatuara:");
        double temperatura = sc.nextDouble();
        
        
        if( eleccion == 1){
            resultado = (temperatura * 9/5) + 32;
        }else{
            resultado = (temperatura -32) * 5/9;
        }
        
        System.out.println("El resultado es: " + resultado);
    }
    
}
/*
1. Inicio
2. 	Mostrar "Elija la conversión que desea realizar:"
3. 	Mostrar "1. Celsius a Fahrenheit"
4. 	Mostrar "2. Fahrenheit a Celsius"
5. 	Leer (eleccion)
6. 	Mostrar "Introduzca la temperatura:"
7. 	Leer temperatura
8. 	Si (eleccion es igual a 1) entonces
9. 		Calcular resultado = (temperatura * 9/5) + 32
11. 	Sino 
12. 		Calcular resultado = (temperatura - 32) * 5/9
13. 	Fin Si
14. 	Mostrar "El resultado es: " resultado
19. Fin
*/