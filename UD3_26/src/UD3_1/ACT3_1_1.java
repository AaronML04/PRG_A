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
public class ACT3_1_1 {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        
        
        do{

            System.out.println("Ingresa un numero:" );
            double num1 = scanner.nextDouble();

            System.out.println("Ingresa otro numero:" );
            double num2 = scanner.nextDouble();

            if(num1 > num2){
                System.out.println("El numero " + num1 + " es mayor");
            }else if (num1 < num2){
                System.out.println("El numero " + num2 + " es mayor");
            }else{
                System.out.println("Ambos numero son iguales");
            }
            
            System.out.println("Quieres volver a consultar? \n (si) para continuar \n (no) para finalizar" );
            scanner.nextLine();
            respuesta = scanner.nextLine();
            
        }while(respuesta.equalsIgnoreCase("si"));
        
        System.out.println("Fin del programa");
           
    }
    
}

