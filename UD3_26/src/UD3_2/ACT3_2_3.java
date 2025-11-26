/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD3_2;

/**
 *
 * @author AARON
 */
public class ACT3_2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 0){
            int num = Integer.parseInt(args[0]);
            int i = 2;
            while (num % i != 0){
                i++;
            }
        

            if(i == num){
                System.out.println(" es primo");
            }else{
                System.out.println("no es primo");
            }
        }
    }
    
}