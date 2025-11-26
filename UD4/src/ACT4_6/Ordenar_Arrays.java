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
public class Ordenar_Arrays {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int [] array = {8, 7, 9, 2, 4};
        ArrayList<Integer> ordenat = ordenaArray(array);
        System.out.println("La array y sus valores son: ");
        UtilitatsArrays.mostraArray(array);
        System.out.println("La arrayList ordenada es: ");
        UtilitatsClasses.mostrarArrayListInt(ordenat);
    }
    
    public static ArrayList<Integer> ordenaArray(int[] array){
        ArrayList<Integer> ordena = new ArrayList<>();
        
        for (int valor : array) {

            boolean inserit = false;

            // Recórrer el llistat per trobar la posició on insertar
            for (int i = 0; i < ordena.size(); i++) {
                if (valor < ordena.get(i)) {
                    ordena.add(i, valor);   // Inserció ordenada
                    inserit = true;
                    break;
                }
            }

            // Si no s’ha inserit (és el més gran), afegir al final
            if (!inserit) {
                ordena.add(valor);
            }
        }
        return ordena;
    }
} 