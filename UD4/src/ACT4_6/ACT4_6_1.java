/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT4_6;


import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author AARON
 */
public class ACT4_6_1 {               
    static int NTAULER = UtilitatsConsola.llegirSencer("Tamaño del tablero: "); 
    static int NFULLES = UtilitatsConsola.llegirSencer("Numero de hojas: ");  
    static final int SIMBOL_BUIT = 0;
    static final int SIMBOL_FULLA = 9;
    static final int SIMBOL_CUC = 1;
    static final int SIMBOL_CAPCUC = 2;
    
    
    public static void main(String[] args) {
        int[][]tauler = new int[NTAULER][NTAULER];
        ArrayList<int[]> fulles = new ArrayList<>();                 
        ArrayList<int[]> cuc = new ArrayList<>();
        int accio;
        
        inicializarJuego(tauler, cuc, fulles);
        
        do {
            mostrarTauler(tauler, cuc, fulles);
            accio = UtilitatsConsola.llegirSencer("Puntuació: " + cuc.size() +  " | 8:ALT, 4:ESQUERRA, 6:DRETA, 2:BAIX; 0:SORTIR: ");
            if (accio != 0)
                if (cambiaPosicio(tauler, cuc, fulles, accio)) {
                    if (fulles.isEmpty()) {
                        System.out.println("YOU WIN !!");
                        accio = 0;
                    }
                } else {
                    System.out.println("YOU LOSE !!");
                    accio = 0;
                }
        } while (accio != 0);
    }
    
    public static void inicializarJuego(int[][] tauler, ArrayList<int[]>cuc, ArrayList<int[]>fulles){
        int pos = UtilitatsArrays.generaArray(2, 0, tauler.length - 1 );
        cuc.add(pos);
        
        for (int i = 0; i < NFULLES; i++) {
            afegeixFulla(tauler, cuc, fulles);
        }
    }
    
    
    public static void afegeixFulla(int[][] tauler, ArrayList<int[]>cuc, ArrayList<int[]>fulles){
        ArrayList<int[]> cucIfulles = new ArrayList<>();
        int pos;
        boolean okFulla;
        
        cucIfulles.addAll(cuc);
        cucIfulles.addAll(fulles);
        
        do {
            pos  = UtilitatsArrays.generaArray(2,0, NTAULER-1); // genera posició de la fulla
            
            // Recorre 'cuc' i 'fulles' per veure que 'posFulla' és correcta
            okFulla = true;
            for (int[] p : cucIfulles) {
                if (Arrays.equals(p, pos)) {
                    okFulla = false;
                    break;
                }
            }
        } while (!okFulla);
        
        // Afegeix fulla
        fulles.add(pos);
    }
    
    public static boolean cambiaPsicio(int[][] tauler, ArrayList<int[]>cuc, ArrayList<int[]>fulles, int accio){
        int [] posFulla, posCuc;
        int [] posCucCap = { cuc.get(cuc.size() - 1)[0],
                             cuc.get(cuc.size() - 1 )[1]};
        
        switch(accio){
            case 4 -> 
                posCucCap = (posCucCap[1] == 0 ? NTAULER - 1 : --posCucCap[1]);
            case 6 ->
                posCucCap = (posCucCap[1] == NTAULER - 1 ? 0 : ++posCucCap[1]);
            case 8 -> 
                posCucCap = (posCucCap[0] == 0 ? NTAULER - 1 : --posCucCap[0]);
            case 2 ->
                posCucCap = (posCucCap[0] == NTAULER - 1 ? 0 : ++posCucCap[0]);
        }
        
        for (int i = 0; i < tauler.length; i++) {
            posFulla = fulles.get(i);
            if (Arrays.equals(posFulla, posCucCap)) {
                cuc.add(posCucCap);
                fulles.remove(i);
                return true;
            }
        }
        
        for (int i = 0; i < tauler.length; i++) {
            posCuc = cuc.get(i);
            if(Arrays.equals(posCuc, posCucCap)){
                return false;
            }
        }
        
        cuc.add(posCucCap);
        cuc.remove(0);
        
        return true;
    }
    
    public static void mostrarTauler(int[][] tauler, ArrayList<int[]>cuc, ArrayList<int[]>fulles){
        String car = "";
        
        netejaTauler(tauler);
        situaCuc(tauler, cuc);
        situaFulles(tauler, fulles);
        
        for (int i = 0; i < tauler.length; i++) {
            System.out.print("|");
        }for (int j = 0; j < tauler[i].length; j++) {
            switch(accio){
                case SIMBOL_BUIT -> car = "   ";
                case SIMBOL_FULLA -> car = " * ";
                case SIMBOL_CAPCUC -> car = " O ";
                case SIMBOL_CUC -> car = " . ";
            }
            System.out.print(car);
        }
        System.out.println("|");
    }
    
    public static void netejaTauler(int[][] tauler){
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                tauler[i][j] = SIMBOL_BUIT;
            }
        }
    }
    
    public static void situaCuc(int[][] tauler, ArrayList<int[]> cuc){
        int i = 0;
        for(int[] posCuc : cuc){
            tauler[posCuc[0]][posCuc[1]] = (i == cuc.size()-1 ? SIMBOL_CAPCUC : SIMBOL_CUC);
            i++;
        }
    }
    
    public static void situaFulla(int[][] tauler, ArrayList<int[]> fulles){
        for(int[] posFulla : fulles){
            tauler[posFulla[0]][posfulla[1]] = SIMBOL_FULLA;
        }
    }
}
    /*
    public static void inicializarJuego(int[][] tauler, ArrayList<int[]>cuc, ArrayList<int[]>fulles){
        //gera una posicion inicial del gusano de mierda
        int[] pos = UtilitatsArrays.generaArray(2, 0, tauler.length-1);
        cuc.add(pos);
        
        //genera la posicion de las putas hojas
        for(int i = 0; i < NFULLES; i++){
            afegeixFulla(tauler, cuc, fulles);
        }
    }
    
    public static void afegeixFulla(int[][] tauler, ArrayList<int[]>cuc, ArrayList<int[]>fulles){
        ArrayList<int[]> cucIfulles = new ArrayList<>();
        int[] pos;
        boolean okFulla;
        
        cucIfulles.addAll(cuc);
        cucIfulles.addAll(fulles);
        
        do{
            pos = UtilitatsArrays.generaArray(2, 0, tauler.length-1);
            
            okFulla = true;
            for (int[] p : cucIfulles) {
                if (Arrays.equals(p, pos)) {
                    okFulla = false;
                    break;
                }
            }
        }while(!okFulla);
        
        //añade la hoja
        fulles.add(pos);
    }
    
    public static boolean cambiaPosicio(int[][] tauler, ArrayList<int[]>cuc, ArrayList<int[]>fulles, int accio){
        int[] posFulla, posCuc;
        int[] posCucCap = { cuc.get(cuc.size() - 1)[0],
                            cuc.get(cuc.size() -1)[1]}; // posicion actual del gusano
        
        switch(accio){
            case 4 -> //IZQ
                posCucCap[1] = (posCucCap[1] == 0 ? NTAULER - 1 : --posCucCap[1]);
            case 6 -> //DERE
                posCucCap[1] = (posCucCap[1] == NTAULER -1 ? 0 : ++posCucCap[1]);
            case 8 -> //ALT
                posCucCap[0] = (posCucCap[0] == 0 ? NTAULER - 1 : --posCucCap[0]);
            case 2 -> //ABAJ
                posCucCap[0] = (posCucCap[0] == NTAULER -1 ? 0 : ++posCucCap[0]);
        }
        
        //Cuc se come una hoja
        for(int i = 0; i < fulles.size(); i++){
            posFulla = fulles.get(i);
            if(Arrays.equals(posFulla, posCucCap)){
                cuc.add(posCucCap);
                fulles.remove(i);
                return true;
            }
        }
        
        //El gusano es gilipollas y se come a si mismo
        for(int i = 0; i < cuc.size(); i++){
            posCuc = cuc.get(i);
            if(Arrays.equals(posCuc, posCucCap)){
                return false;
            }
        }
        
        //El gusano se mueve
        cuc.add(posCucCap); //Se añade posCuc a cuc
        cuc.remove(0); //se elimina la cola del gilipollas
        
        return true;
    }
    
    public static void mostrarTauler(int[][] tauler, ArrayList<int[]> cuc, ArrayList<int[]> fulles){
        String car = "";
        
        netejaTauler(tauler);
        situaCuc(tauler, cuc);
        situaFulles(tauler, fulles);
        
        for(int i = 0; i < tauler.length; i++){
            System.out.print("|");
            for (int j = 0; j < tauler[i].length; j++) {
                switch(tauler[i][j]){
                    case SIMBOL_BUIT -> car = "   ";
                    case SIMBOL_FULLA -> car = " * ";
                    case SIMBOL_CAPCUC -> car = " 0 ";
                    case SIMBOL_CUC -> car = " . ";
                }
                System.out.print(car);
            }
            System.out.println("|");
        }
    }
    
    public static void netejaTauler(int[][] tauler){
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                tauler[i][j] = SIMBOL_BUIT;
            }
        }
    }
    
    public static void situaCuc(int[][] tauler, ArrayList<int[]> cuc){
        int i = 0;
        
        for(int[] posCuc : cuc){
            tauler[posCuc[0]][posCuc[1]] = (i == cuc.size()-1 ? SIMBOL_CAPCUC : SIMBOL_CUC);
            i++;
        }
    }
    
    public static void situaFulles(int[][] tauler, ArrayList<int[]> fulles){
        for(int[] posFulla : fulles){
            tauler[posFulla[0]][posFulla[1]] = SIMBOL_FULLA;
        }
    }
        
    
}

