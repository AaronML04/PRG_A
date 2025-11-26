/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD3_2;

/**
 *
 * @author AARON
 */
public class ACT3_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean esPrimo = true;
        int num = 7;
       /* 
        for(int i = 3; i <= 100 ; i++){
            for( int j = 2 ; j <= i-1; j++){
                if(i % j == 0){
                    esPrimo = false;
                    break;
                }
            }
            if(esPrimo){
                System.out.println(i);
            }
            esPrimo = true;
        }
*/
       
       for(int i = 2; i <= num -1; i++){
           if(num % i == 0){
               esPrimo=false;
               break;
               
           }
       }
       if(esPrimo){
           System.out.println("es primo");
       }else{
           System.out.println("no es primo");
    }
    }
    
}
