/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT4_6;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author AARON
 */
public class ACT4_6_1_1 {
    static int[] array;
    static ArrayList<Integer> diferents;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       array = UtilitatsArrays.generaArray(25, 0, 10);
       
       diferents = mostrarDiferent(array);
       
       UtilitatsArrays.mostraArray(array);
       UtilitatsClasses.mostrarArrayListInt(diferents);
    }
    
    public static ArrayList<Integer> mostrarDiferent(int[] array){
        ArrayList<Integer> diferents = new ArrayList<>();
        boolean repetido;
        
        for (int i = 0; i < array.length - 1; i++) {
            repetido = false;
            for(int j = 0; j < diferents.size(); j++){
                if(diferents.get(j) == array[i]){
                   repetido = true;
                   break;
                }
            }    
            if(!repetido){
                 diferents.add(array[i]);
            }
        }
        return diferents;
    } 
}
