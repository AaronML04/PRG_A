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
        ArrayList<Integer> ordenat = ordenaArrays(array);
        System.out.println("La array y sus valores son: ");
        UtilitatsArrays.mostraArray(array);
        System.out.println("La arrayList ordenada es: ");
        UtilitatsClasses.mostrarArrayListInt(ordenat);
    }
    
    public static ArrayList<Integer> ordenaArrays (int[] array) {
        ArrayList<Integer> ordenat = new ArrayList<>();
        ordenat.add(array[0]);
        boolean insertado=false;
        for (int i = 0; i < array.length; i++) {
            insertado=false;
            for(int j = 0; j < ordenat.size(); j++) {
                if (array[i] < ordenat.get(j)) {
                    ordenat.add(j,array[i]);
                    insertado=true;
                    break;
                }
            }
            if(!insertado) {
                ordenat.add(array[i]);
            }
        }
        return ordenat;
    }
}

/*
    public static ArrayLits<Integer> tornaOrdenats(int[] array) {
    ArrayList<Integer> ordenat = new ArrayList<>();
    ordenat.add(array[0]);
    for(int i = 1; i < array.length; i++) {
    boolean insertat = false;
    for(int j = 0; j< ordenat.size(); j++) {
    if(array[i] < ordenat.get(j)) {
        ordenat.add(j, array[i]);
        insertat = true;
        break;
    }
}   
    if(insertat==false) {
    ordenat.add(array[i]);
}
}
} return ordenat;
*/

/*
public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(1);
        array.add(2);

        System.out.println(array);
        System.out.println(ordenaArrayList(array));
    }

    public static ArrayList<Integer> ordenaArrayList(ArrayList<Integer> array ) {
        ArrayList<Integer> arrayOrdenat = new ArrayList<>();

        for (int num : array) {
            // Insertar 'num' en la posición correcta
            int pos = 0;
            while (pos < arrayOrdenat.size() && num > arrayOrdenat.get(pos)) {
                pos++;
            }
            arrayOrdenat.add(pos, num); // Inserta en la posición encontrada
        }

        return arrayOrdenat;
    }
*/