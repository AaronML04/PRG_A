/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD3_2;

import java.util.Scanner;

/**
 *
 * @author AARON
 */
public class ACT3_2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0;
        int total = 0;
        int suma = 0;
        double media;
        
        Scanner sc = new Scanner(System.in);
        
        do{
            
            System.out.println("Introduzca numero: ");
            num = sc.nextInt();
            
            if(num >= 0 ){
                total++;
                suma = suma + num;
            }
            
        }while( num != -1);

        media = (double) suma / (double) total;
        System.out.println("La media es: " + media);
        
        sc.close();
         
    }
    
}
