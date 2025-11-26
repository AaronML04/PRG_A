/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD3_3;

import java.util.Arrays;

/**
 *
 * @author AARON
 */
public class ACT3_3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean iguales = true;
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        
         /*Comparando referencias (mismo array)*/
         
        if(arr1 == arr2){
            System.out.println("Son iguales porque la referencia es la misma");
        }else{
            System.out.println("Son diferentes porque la referencia no son iguales");
        }
        
        /*Comparando longitud y contenido*/
        
        if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length ; i++){
                if(arr1[i]!= arr2[i]){
                    iguales = false;
                    break;
                }
            }
        }else{
            iguales = false;
        }
        
        
        System.out.println("-------------------------");
        /*Sin equals*/
        
        if(iguales){
            System.out.println("SON IGUALES (COMPARADO SIN EQUALS)");
        }else{
            System.out.println("SON DIFERENTES (COMPARADO SIN EQUALS)");
        }
        
        System.out.println("-------------------------");
        /*Con equals*/
        
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Son iguales en contenido");
        }else{
            System.out.println("Son diferentes en contenido");
        }
    }
    
}
