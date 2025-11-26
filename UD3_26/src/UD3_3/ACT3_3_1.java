/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD3_3;

/**
 *
 * @author AARON
 */
public class ACT3_3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[10];
        /*int[] array = {1,2,3,4,5,6,7,8,9,10};*/
        
        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
        } 
        
        for(int a : array){
            System.out.println(a + " ");
        }
    }
    
}
