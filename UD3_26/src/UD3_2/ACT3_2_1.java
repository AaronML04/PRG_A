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
public class ACT3_2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Introduzca un numero para sacar sus divisores");
        int num = sc.nextInt();
        
        for( int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
        
    }
    
}
