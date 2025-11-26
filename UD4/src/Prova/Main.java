package Prova;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    static int NTAULER;
    static int NGLOBUS;
    static final int SIMBOL_BUIT = 0;
    static final int SIMBOL_GLOBUS = 1;
    static final int SIMBOL_GLOBUS_EXPLOTAT = 9;

    static int[][] tauler;
    static ArrayList<int[]> globus = new ArrayList<>();
    static ArrayList<int[]> globusExplotats = new ArrayList<>();

    public static void main(String[] args) {

        NTAULER = UtilitatsConsola.llegirSencer("Mida del tauler: ");
        NGLOBUS = UtilitatsConsola.llegirSencer("Nombre de globus: ");

        tauler = new int[NTAULER][NTAULER];

        emplenaTauler(globus);
        explotaGlobusEnDiagonals(globus, globusExplotats);

        int fila, columna;

        do {
            mostrarTauler(tauler, globus, globusExplotats);

            fila = UtilitatsConsola.llegirSencer("Nro. Fila (0-" + (NTAULER - 1) + "): ");
            columna = UtilitatsConsola.llegirSencer("Nro. Columna (0-" + (NTAULER - 1) + "): ");

            explotaGlobusEnFilaColumna(globus, globusExplotats, fila, columna);

            System.out.println("Queden " + globus.size() + " globus. ");
            System.out.println("S'han explotat " + globusExplotats.size() + " globus.");

        } while (globus.size() > 0);

        System.out.println("Tots els globus han estat explotats!");
    }

    /** ----------------------------------------------------------------
     * Genera posicions aleatòries per als globus i omple l’ArrayList.
     */
    public static void emplenaTauler(ArrayList<int[]> globus) {
        Random r = new Random();

        while (globus.size() < NGLOBUS) {
            int x = r.nextInt(NTAULER);
            int y = r.nextInt(NTAULER);

            // Evitar duplicats
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

        // Actualitza tauler
        for (int[] g : globus) {
            tauler[g[0]][g[1]] = SIMBOL_GLOBUS;
        }
    }

    /** ----------------------------------------------------------------
     * Mostra la matriu amb els símbols corresponents.
     */
    public static void mostrarTauler(int[][] tauler, ArrayList<int[]> globus, ArrayList<int[]> globusExplotats) {
        // Primer netegem el tauler
        for (int i = 0; i < NTAULER; i++) {
            Arrays.fill(tauler[i], SIMBOL_BUIT);
        }

        // Globus actius
        for (int[] g : globus) {
            tauler[g[0]][g[1]] = SIMBOL_GLOBUS;
        }

        // Globus explotats
        for (int[] g : globusExplotats) {
            tauler[g[0]][g[1]] = SIMBOL_GLOBUS_EXPLOTAT;
        }

        // Print tauler
        for (int i = 0; i < tauler.length; i++) {
            System.out.print("|");
            for (int j = 0; j < tauler[i].length; j++) {
                switch (tauler[i][j]) {
                    case SIMBOL_BUIT -> System.out.print("   ");
                    case SIMBOL_GLOBUS -> System.out.print(" * ");
                    case SIMBOL_GLOBUS_EXPLOTAT -> System.out.print(" O ");
                }
            }
            System.out.println("|");
        }
    }

    /** ----------------------------------------------------------------
     * Explota els globus que estiguin a les dues diagonals.
     */
    public static void explotaGlobusEnDiagonals(ArrayList<int[]> globus, ArrayList<int[]> globusExplotats) {

        ArrayList<int[]> perEliminar = new ArrayList<>();

        for (int[] g : globus) {
            int x = g[0], y = g[1];

            if (x == y || x + y == NTAULER - 1) {
                perEliminar.add(g);
            }
        }

        globus.removeAll(perEliminar);
        globusExplotats.addAll(perEliminar);
    }

    /** ----------------------------------------------------------------
     * Explota els globus situats a la fila o columna indicades.
     */
    public static void explotaGlobusEnFilaColumna(ArrayList<int[]> globus, ArrayList<int[]> globusExplotats,
                                                  int fila, int columna) {

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
