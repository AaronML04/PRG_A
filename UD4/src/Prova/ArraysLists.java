/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Prova;

import java.util.ArrayList;

/**
 *
 * @author AARON
 */
public class ArraysLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<int[]> cuc = new ArrayList<>();
        
        for(int i = 0; i < cuc.size(); i++){
            int [] pos = new int[2];
            pos[0]=1; pos[1]= i;
            cuc.add(pos);
        }
           
        
        for(int i = 0; i < cuc.size(); i++){
            System.out.println(cuc.get(i)[0] + " " + cuc.get(i)[1]);
        }
    }
    
}
