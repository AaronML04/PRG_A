/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UD3_3;

/**
 *
 * @author AARON
 */
public class ACT3_3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int MIN = 100, MAX = 200;
        int[] array = new int[10];
        
        for(int i = 0; i < array.length; i++){
            array[i] = MIN + (int) (Math.random()*((MAX - MIN) + 1));
        }
        
        for(int a : array){
            System.out.println(a + " ");
        }
        
    }
    
}
