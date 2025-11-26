package ACT4_6;


import java.util.ArrayList;

/**
 *
 * @author winadmin
 */
public class UtilitatsClasses {
        
    /**
     *
     * @param array
     */
    public static void mostrarArrayListInt(ArrayList<Integer> array) {
        System.out.print("[ ");
        for (Integer a : array) {
            System.out.print(a + " ");
        }
        System.out.println("]");
    }
    
        public static void mostrarArrayListStr(ArrayList<String> array) {
        System.out.print("[ ");
        for (String a : array) {
            System.out.print(a + " ");
        }
        System.out.println("]");
    }

    /**
     * Crear un ArraList 
     *      s'avalua cada element de l'array en l'ArrayList
     * @return ArrayList 
     */    
    public static ArrayList<Integer> mostrarDiferents(int[] array) {
        ArrayList<Integer> resultat = new ArrayList<>();
        
        for (Integer num: array) {
            if (! resultat.contains(num)) // si 'num' no es troba en 'resultat', s'afegeix
                resultat.add(num);		
        }
        return resultat;
    }
    
    /**
     * Transforma un int[] a un ArrayList<Integer>
     * @param array --> int[]
     * @return ArrayList<Integer>
     */
    public static ArrayList<Integer> arrayToArrayListInt(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int a : array) {
            arrayList.add(a);
        }
        
        return arrayList;
    }
    
    /**
    * Crear un ArrayList 
    *      s'avalua cada element de l'array en l'ArrayList
    *      si l'ArrayList es manté ordenat es poden estalviar 
    *      moltes lectures
    * @return ArrayList ordenat
    */
    public static ArrayList<Integer> mostrarDiferentsMillorat(int[] array) {
        ArrayList<Integer> resultat = new ArrayList<>();
        
        for (int num : array) {
            int i = 0; // index on cal insertar en 'resultat'
            boolean trobat = false;
            
            for (Integer r : resultat) { // es cerca 'num' dins 'resultat'
                if( r == num) { // trobat, no cal insertar
                    trobat = true;
                    break;
                } else if (r > num) // no trobat, ni es trobar� si l'ArrayList es mant� ordenat, cal insertar
                    break;
                else // seguir cercant dins 'resultat'
                    i++;
            }
            if (!trobat) // afegir 'num' en la posici� 'i' per mantenir l'ArrayList ordenat
                resultat.add(i,num);
        }
        
        return resultat;
    }
    
    public static ArrayList<Integer> generaDiferents(int[] array) {
        
        ArrayList<Integer> diferents = new ArrayList<>();
        boolean repetido;
        
        for(int i = 0; i < array.length; i++){
            repetido = false;
            for(int j = 0; j < diferents.size(); j++){
                if(diferents.get(j).equals(array[i])){
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
    
    public static ArrayList<Integer> ordenaArraySenseRepeticions(int[] array){
        ArrayList<Integer> ordena = new ArrayList<>();
        
        for(int valor : array){
            boolean repetido = false;
            
            for(int i = 0; i < ordena.size(); i++){
                
                //compara
                if(ordena.get(i).equals(valor)){
                    repetido = true;
                    break;
                }else if (valor < ordena.get(i)) {
                    ordena.add(i, valor);   // Inserció ordenada
                    repetido = true;
                    break;
                }

            }
            
            if(!repetido){
                ordena.add(valor);
            }
        }
        return ordena;
        
    }
    
    public static ArrayList<Integer> obteParells(int[] array){
        ArrayList<Integer> parell = new ArrayList<>();
        
        
        for(int valor : array){
            if(valor % 2 == 0){
                parell.add(valor);
            }
        }
        
        return parell;
    }
    
    public static ArrayList<Integer> obteParellsOrdenats(int[] array){
        ArrayList<Integer> parell = new ArrayList<>();
        
        
        for (int valor : array) {
            
            if(valor % 2 == 0){
                parell.add(valor);
                
                boolean inserit = false;
                    // Recórrer el llistat per trobar la posició on insertar
                for (int i = 0; i < parell.size(); i++) {
                    if (valor < parell.get(i)) {
                        parell.add(i, valor);   // Inserció ordenada
                        inserit = true;
                        break;
                    }
                }

                // Si no s’ha inserit (és el més gran), afegir al final
                if (!inserit) {
                    parell.add(valor);
                }
            }  
        }
        return parell;
    }
    
    public static ArrayList<Integer> obteParellsOrdenatsSenseRepeticions(int[] array){
       ArrayList<Integer> parell = new ArrayList<>();
       
        for(int valor : array){
            if(valor % 2 == 0){
            
                boolean repetido = false;

                for(int i = 0; i < parell.size(); i++){

                    //compara
                    if(parell.get(i).equals(valor)){
                        repetido = true;
                        break;
                    }
                    if (valor < parell.get(i)) {
                        parell.add(i, valor);   // Inserció ordenada
                        repetido = true;
                        break;
                    }
                }

                if(!repetido){
                    parell.add(valor);
                }
            }
        }
        return parell;
    }
    
    public static ArrayList<Integer> obteRepetits(int[] arr1, int[] arr2){
        ArrayList<Integer> repes = new ArrayList<>();
           /*
        for (int valor1 : arr1) {
            for (int valor2 : arr2) {
                if (valor1 == valor2) {
                    if (!repes.contains(valor1)) { // Evitar duplicats
                        repes.add(valor1);
                    }
                }
            }
        }
          */
     
        for (int valor1 : arr1) {

        boolean repetido = false;

        // 1. Ver si valor1 está en arr2
        for (int valor2 : arr2) {
            if (valor1 == valor2) {
                repetido = true;
                break;
            }
        }

        // 2. Si no está repetido, saltamos
        if (!repetido) continue;

        // 3. Ver si ya está añadido
        boolean yaAñadido = false;
        for (int v : repes) {
            if (v == valor1) {
                yaAñadido = true;
                break;
            }
        }

        // 4. Añadirlo si no estaba
        if (!yaAñadido) {
            repes.add(valor1);
        }
    }
        
        return repes;
    }
    
    public static ArrayList<Integer> obteDiferents(int[] arr1, int[] arr2){
         ArrayList<Integer> dif = new ArrayList<>();
    
         for (int valor1 : arr1) {
            for (int valor2 : arr2) {
                if (valor1 != valor2) {
                    if (!dif.contains(valor1)) { // Evitar duplicats
                        dif.add(valor1);
                    }
                }
            }
        }
        return dif;
    }
    
}
    
