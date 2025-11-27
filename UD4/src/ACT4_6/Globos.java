/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT4_6;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author AARON
 */
public class Globos {
 
    static int NTAULER;
    static int NGLOBUS;
    static final int SIMBOL_BUIT = 0;
    static final int SIMBOL_GLOBUS = 1;
    static final int SIMBOL_GLOBUS_EXPLOTAT = 9;
    static int[][] tauler;
    static ArrayList<int[]> globus = new ArrayList<>();
    static ArrayList<int[]> globusExplotats = new ArrayList<>();
    static int fila;
    static int columna;
    
    public static void main(String[] args) {

        NTAULER = UtilitatsConsola.llegirSencer("Mida del tauler: ");
        NGLOBUS = UtilitatsConsola.llegirSencer("Nombre de globus: ");
        
        tauler = new int[NTAULER][NTAULER];  

        emplenaTauler(globus);
        actualitzaTauler();

        explotaGlobusEnDiagonals(globus, globusExplotats);
        actualitzaTauler();

        do {
            mostrarTauler(tauler, globus, globusExplotats);
            
            fila = UtilitatsConsola.llegirSencer("Nro. Fila: ");
            columna = UtilitatsConsola.llegirSencer("Nro. Columna: ");
            
            explotaGlobusEnFilaColumna(globus, globusExplotats, fila, columna);
            actualitzaTauler();

            System.out.println("Queden " + globus.size() + " globus.");
            System.out.println("S'han explotat " + globusExplotats.size() + " globus.");

        } while (globus.size() > 0);  

        System.out.println("Ja no queden globus! Fi del joc.");
    }
    
    /** ----------------------------------------------------------------
     * Omple l'ArrayList 'globus' amb posicions aleatòries.
     */
    public static void emplenaTauler(ArrayList<int[]> globus) {

        while (globus.size() < NGLOBUS) {
            int x = (int)(Math.random() * NTAULER);
            int y = (int)(Math.random() * NTAULER);

            // Evitar repetits
            boolean repetit = false;
            for (int[] g : globus) {
                if (g[0] == x && g[1] == y) {
                    repetit = true;
                    break;
                }
            }

            if (!repetit) {
                globus.add(new int[]{x, y});
            }
        }
    }

    /** ----------------------------------------------------------------
     * Actualitza la matriu 'tauler' segons l'estat actual dels globus.
     */
    public static void actualitzaTauler() {
        for (int i = 0; i < NTAULER; i++) {
            for (int j = 0; j < NTAULER; j++) {
                tauler[i][j] = SIMBOL_BUIT;
            }
        }

        for (int[] g : globus) {
            tauler[g[0]][g[1]] = SIMBOL_GLOBUS;
        }

        for (int[] g : globusExplotats) {
            tauler[g[0]][g[1]] = SIMBOL_GLOBUS_EXPLOTAT;
        }
    }
    
    /** ----------------------------------------------------------------
     * Mostra el taulell amb símbols.
     */
    public static void mostrarTauler(int[][] tauler, ArrayList<int[]> globus, ArrayList<int[]> globusExplotats) {
        String car = "";
        
        for (int i = 0; i < tauler.length; i++) {
            System.out.print('|');
            for (int j = 0; j < tauler[i].length; j++) {
                switch (tauler[i][j]) {
                    case SIMBOL_BUIT -> car = "   ";
                    case SIMBOL_GLOBUS -> car = " * ";
                    case SIMBOL_GLOBUS_EXPLOTAT -> car = " O ";
                }
                System.out.print(car);
            }
            System.out.println("|");
        }
    }
    
    /** ----------------------------------------------------------------
     * Explota els globus que estàn a les diagonals.
     */
    public static void explotaGlobusEnDiagonals(ArrayList<int[]> globus, ArrayList<int[]> globusExplotats) {

        ArrayList<int[]> perEliminar = new ArrayList<>();

        for (int[] g : globus) {
            int x = g[0];
            int y = g[1];

            if (x == y || (x + y == NTAULER - 1)) {  
                perEliminar.add(g);
            }
        }

        globus.removeAll(perEliminar);
        globusExplotats.addAll(perEliminar);
    }
    
    /** ----------------------------------------------------------------
     * Explota els globus que estan en la fila o columna indicada.
     */
    public static void explotaGlobusEnFilaColumna(ArrayList<int[]> globus, ArrayList<int[]> globusExplotats, int fila, int columna) {

        ArrayList<int[]> perEliminar = new ArrayList<>();

        for (int[] g : globus) {
            if (g[0] == fila || g[1] == columna) {  
                perEliminar.add(g);
            }
        }

        globus.removeAll(perEliminar);
        globusExplotats.addAll(perEliminar);
    }
}
