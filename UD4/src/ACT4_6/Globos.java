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

/*
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

        tauler = new int[NTAULER][NTAULER];  // matriu NTAULERxNTAULER
        emplenaTauler(globus);
        explotaGlobusEnDiagonals(globus, globusExplotats);

        do {
            mostrarTauler(tauler, globus, globusExplotats);

            fila = UtilitatsConsola.llegirSencer("Nro. Fila: ");
            columna = UtilitatsConsola.llegirSencer("Nro. Columna: ");
            explotaGlobusEnFilaColumna(globus, globusExplotats, fila, columna);
            System.out.println("Queden " + globus.size() + " globus. ");
            System.out.println("S'han explotat " + globusExplotats.size() + " globus.");
            
            mostrarTauler(tauler, globus, globusExplotats);
            System.out.println("\n\n\n\n\n");
        } while (!globus.isEmpty());
    }

    /**
     * ---------------------------------------------------------------- Ha
     * d'emplenar l'ArrayList 'globus' amb 'NGLOBUS' posicions (x,y).
     
    public static void emplenaTauler(ArrayList<int[]> globus) {
        do {
            int[] aux = UtilitatsArrays.generaArray(2, 0, NTAULER - 1);
            if (tauler[aux[0]][aux[1]] == SIMBOL_BUIT) {
                tauler[aux[0]][aux[1]] = SIMBOL_GLOBUS;
                globus.add(aux);
                NGLOBUS--;
            }
        } while (NGLOBUS != 0);
    }

    /**
     * ---------------------------------------------------------------- Ha de
     * situar els globus en el tauler, tenint en compte de mostrar els seg�ents
     * s�mbols: SIMBOL_GLOBUS ? " * " SIMBOL_GLOBUS_EXPLOTAT ? " O "
     
    public static void mostrarTauler(int[][] tauler, ArrayList<int[]> globus, ArrayList<int[]> globusExplotats) {
        for (int i = 0; i < tauler.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < tauler.length; j++) {
                int accio = tauler[i][j];
                switch (accio) {
                    case SIMBOL_BUIT:
                        System.out.print("  ");
                        break;
                    case SIMBOL_GLOBUS:
                        System.out.print("* ");
                        break;
                    case SIMBOL_GLOBUS_EXPLOTAT:
                        System.out.print("O ");
                        break;
                }
            }
            System.out.println("|");
        }
    }

    /**
     * ---------------------------------------------------------------- ha de
     * cercar els globus que estiguin en les diagonals principal i secund�ria:
     * les ha d'eliminar de 'globus' i les ha de crear a 'globusExplotats'.
     * AJUDA: ? diagonal principal ? posX = posY ? diagonal secund�ria ? posX +
     * posY = NTAULER - 1
     
    public static void explotaGlobusEnDiagonals(ArrayList<int[]> globus, ArrayList<int[]> globusExplotats) {
        //DIAGONAL PRINCIPAL
        for (int i = 0; i < NTAULER; i++) {
            if (tauler[i][i] == SIMBOL_GLOBUS) {
                tauler[i][i] = SIMBOL_GLOBUS_EXPLOTAT;
                //Afegir en globusExplotats y eliminar de globus
                for (int j = 0; j < globus.size(); j++) {
                    if (globus.get(j)[0] == i && globus.get(j)[1] == i) {
                        globusExplotats.add(globus.get(j));
                        globus.remove(j);
                    }
                }
            }

        }
        //DIAGONAL SECUNDARIA
        for (int i = 0; i < NTAULER; i++) {
            if (tauler[(NTAULER - 1) - i][i] == SIMBOL_GLOBUS) {
                tauler[(NTAULER - 1) - i][i] = SIMBOL_GLOBUS_EXPLOTAT;
            }
            //Afegir en globusExplotats y eliminar de globus
            for (int j = 0; j < globus.size(); j++) {
                if (globus.get(j)[0] == (NTAULER - 1) - i && globus.get(j)[1] == i) {
                    globusExplotats.add(globus.get(j));
                    globus.remove(j);
                }
            }
        }
    }

    /**
     * ---------------------------------------------------------------- ha de
     * cercar els globus que estiguin en la 'fila' i la 'columna' indicada com a
     * par�metre. ? les ha d'eliminar de 'globus' i les ha de crear a
     * 'globusExplotats'.
     
    public static void explotaGlobusEnFilaColumna(ArrayList<int[]> globus, ArrayList<int[]> globusExplotats, int fila, int columna) {
        //FILAS
        for (int i = 0; i < tauler.length; i++) {
            if (tauler[fila][i] == SIMBOL_GLOBUS) {
                tauler[fila][i] = SIMBOL_GLOBUS_EXPLOTAT;
                //Afegir en globusExplotats y eliminar de globus
                for (int j = 0; j < globus.size(); j++) {
                    if (globus.get(j)[0] == fila && globus.get(j)[1] == i) {
                        globusExplotats.add(globus.get(j));
                        globus.remove(j);
                    }
                }
            }
        }
        //COLUMNAS
        for (int i = 0; i < tauler.length; i++) {
            if (tauler[i][columna] == SIMBOL_GLOBUS) {
                tauler[i][columna] = SIMBOL_GLOBUS_EXPLOTAT;
                //Afegir en globusExplotats y eliminar de globus
                for (int j = 0; j < globus.size(); j++) {
                    if (globus.get(j)[0] == i && globus.get(j)[1] == columna) {
                        globusExplotats.add(globus.get(j));
                        globus.remove(j);
                    }
                }
            }
        }
    }
 */