/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT4_6;

import java.util.ArrayList;

/**
 *
 * @author AARON
 */
public class ACT4_4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> diferents;
        int[] array = UtilitatsArrays.generaArray(10, 0, 9);  
        
        UtilitatsArrays.mostraArray(array);
        
        
        diferents = UtilitatsClasses.obteParellsOrdenats(array);
        
  
        System.out.println(diferents);
       
    }
    
}
