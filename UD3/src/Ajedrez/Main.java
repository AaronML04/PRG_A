/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ajedrez;

/**
 *
 * @author aaron
 */


public class Main {
    
    static int NTAULER;
    static final int SIMBOL_NEGRE = 1;
    static final int SIMBOL_VERMELL = 2;
    static final int SIMBOL_PEO = 8;
    static final int SIMBOL_COSTAT = 9;

    static int[][] tauler;
   
    public static void main(String[] args) {
        NTAULER = UtilitatsConsola.llegirSencer("Mida tauler: ");
        tauler = new int[NTAULER][NTAULER];

        emplenaCostats(tauler);
        UtilitatsMatrius.mostrarMatriu(tauler);

        emplenaInterior(tauler);
        UtilitatsMatrius.mostrarMatriu(tauler);

        // Poner un peón en rojo
        situaPeo(tauler, SIMBOL_VERMELL);
        UtilitatsMatrius.mostrarMatriu(tauler);

        // Poner un peón en negro
        situaPeo(tauler, SIMBOL_NEGRE);
        UtilitatsMatrius.mostrarMatriu(tauler);

        mostraTauler(tauler);
    }

    public static void emplenaCostats(int[][] tauler){
        int n = tauler.length;

        for(int i = 0; i < n; i++){
            tauler[0][i] = SIMBOL_COSTAT;
            tauler[n - 1][i] = SIMBOL_COSTAT;
            tauler[i][0] = SIMBOL_COSTAT;
            tauler[i][n - 1] = SIMBOL_COSTAT;
        }
    }

    public static void emplenaInterior(int[][] tauler){
        for(int i = 1; i < tauler.length - 1; i++){
            for(int j = 1; j < tauler[i].length - 1; j++){
                if((i + j) % 2 == 0){
                    tauler[i][j] = SIMBOL_VERMELL;
                } else {
                    tauler[i][j] = SIMBOL_NEGRE;
                }
            }
        }
    }

    public static void situaPeo(int[][] tauler, int color){
        boolean colocado = false;

        while(!colocado){
            int fila = (int)(Math.random() * NTAULER);
            int col = (int)(Math.random() * NTAULER);

            if(tauler[fila][col] == color){
                tauler[fila][col] = SIMBOL_PEO;
                colocado = true;
            }
        }
    }

    public static void mostraTauler(int[][] matriu){
        for(int i = 0; i < matriu.length; i++){
            for(int j = 0; j < matriu[i].length; j++){
                switch(matriu[i][j]){
                    case SIMBOL_VERMELL -> System.out.print("   ");
                    case SIMBOL_NEGRE -> System.out.print(" : ");
                    case SIMBOL_PEO -> System.out.print(" Z ");
                    case SIMBOL_COSTAT -> System.out.print(" | ");
                    default -> System.out.print(" ? ");
                }
            }
            System.out.println(); // ← SALTO DE LÍNEA CORRECTO
        }
    }
}

/*

    static int NTAULER;
    static final int SIMBOL_NEGRE = 1;
    static final int SIMBOL_VERMELL = 2;
    static final int SIMBOL_PEO = 8;
    static final int SIMBOL_COSTAT = 9;

    static int[][] tauler;

    public static void main(String[] args) {

        NTAULER = UtilitatsConsola.llegirSencer("Mida del tauler: ");
        tauler = new int[NTAULER][NTAULER];

        emplenaCostats(tauler);
        UtilitatsMatrius.mostrarMatriu(tauler);

        emplenaInterior(tauler);
        UtilitatsMatrius.mostrarMatriu(tauler);

        situaPeo(tauler, SIMBOL_VERMELL);
        UtilitatsMatrius.mostrarMatriu(tauler);

        mostraTauler(tauler);
    }

    // ---------------------------------------------------------------
    // 1. Emplena costats
    // ---------------------------------------------------------------
    public static void emplenaCostats(int[][] tauler) {

        int n = tauler.length;

        for (int i = 0; i < n; i++) {
            tauler[0][i] = SIMBOL_COSTAT;         // parte superior
            tauler[n - 1][i] = SIMBOL_COSTAT;     // parte inferior
            tauler[i][0] = SIMBOL_COSTAT;         // parte izquierda
            tauler[i][n - 1] = SIMBOL_COSTAT;     // parte derecha
        }
    }

    // ---------------------------------------------------------------
    // 2. Emplena interior con negro/vermell alternado
    // ---------------------------------------------------------------
    public static void emplenaInterior(int[][] tauler) {

        for (int i = 1; i < tauler.length - 1; i++) {
            for (int j = 1; j < tauler[i].length - 1; j++) {

                if ( (i + j) % 2 == 0 )
                    tauler[i][j] = SIMBOL_VERMELL;
                else
                    tauler[i][j] = SIMBOL_NEGRE;
            }
        }
    }

    // ---------------------------------------------------------------
    // 3. Situa PEO aleatori sobre una casella VERMELLA
    // ---------------------------------------------------------------
    public static void situaPeo(int[][] tauler, int simbolVermell) {

        boolean colocado = false;

        while (!colocado) {

            int fila = (int)(Math.random() * NTAULER);
            int col = (int)(Math.random() * NTAULER);

            if (tauler[fila][col] == simbolVermell) {
                tauler[fila][col] = SIMBOL_PEO;
                colocado = true;
            }
        }
    }

    // ---------------------------------------------------------------
    // 4. Mostrar tablero con símbolos convertidos
    // ---------------------------------------------------------------
    public static void mostraTauler(int[][] matriu) {

        System.out.println("\n--- TAULER FORMATAT ---\n");

        for (int i = 0; i < matriu.length; i++) {
           System.out.print("| ");
            for (int j = 0; j < matriu[i].length; j++) {

                int valor = matriu[i][j];

                switch (valor) {
                    case SIMBOL_VERMELL -> System.out.print("   ");
                    case SIMBOL_NEGRE ->  System.out.print(" : ");
                    case SIMBOL_PEO ->    System.out.print(" Z ");
                    case SIMBOL_COSTAT -> System.out.print(" | ");
                    default ->            System.out.print(" ? ");
                }
            }
            System.out.println(" |");
        }
    }
}
*/

