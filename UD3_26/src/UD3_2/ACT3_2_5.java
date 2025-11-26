/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD3_2;


/**
 *
 * @author AARON
 */
public class ACT3_2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(char letra = 'A'; letra <= 'Z'; letra++){
            if((letra == 'A') || (letra == 'U') || (letra == 'O') || (letra == 'I') || (letra == 'E')){
                System.out.println(letra + ": Es vocal");
            }else{
                System.out.println(letra+ ": Es consonante");
            }
        }
    }
    
}
