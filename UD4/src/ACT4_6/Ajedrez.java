/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT4_6;

/**
 *
 * @author AARON
 */
public class Ajedrez {
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

/*

    /**
     * @param args the command line arguments
     
    static int NTAULER;
    static final int SIMBOL_NEGRE = 1;
    static final int SIMBOL_VERMELL = 2;
    static final int SIMBOL_PEO = 8;
    static final int SIMBOL_COSTAT = 9;
    static int[][] tauler = new int [10][10];
    
    public static void main(String[] args) {
        NTAULER = UtilitatsConsola.llegirSencer("Mida del tauler: ");
        tauler = new int[NTAULER][NTAULER];  // matriu NTAULERxNTAULER
        
        emplenaCostats(tauler);
        UtilitatsMatrius.mostrarMatriu(tauler);

        emplenaInterior(tauler);
        UtilitatsMatrius.mostrarMatriu(tauler);

        //situaPeo(tauler, SIMBOL_VERMELL);
        UtilitatsMatrius.mostrarMatriu(tauler);
        
        //situaPeo(tauler, SIMBOL_NEGRE);
        UtilitatsMatrius.mostrarMatriu(tauler);

        mostraTauler(tauler);
    }
    
    public static void emplenaCostats(int[][] tauler) {
        /**
         * Ha de rebre un la matriu 'tauler' i ha d'emplenar els costats exteriors
         * amb el valor 'SIMBOL_COSTAT'.
         
        
        
        for (int i = 0; i < tauler.length; i++){ 
            for (int j = 0; j < tauler[i].length; j++){ 
                System.out.print(tauler[i][j]+" ");  // CORRECCIÓ: este método tiene que poner valores en 'tauler', no imprimirlos
            } 
            System.out.println(""); 
        } 
        for (int[] pared1 : tauler) {
           //System.out.println(pared1 == SIMBOL_COSTAT);  // CORRECCIÓ: he comentado la instrucción para que pueda compilar el mètodo
           
        }
    }
    
    public static void emplenaInterior(int[][]tauler) {
        /**
         * Ha de rebre un la matriu 'tauler' i ha d'emplenar les posicions alternes 
         * amb 'SIMBOL_NEGRE' i 'SIMBOL_VERMELL'
         
        for(int i = 0; i < tauler.length ; i++){
            for(int j = 0; j < tauler[i].length ; j++){
                if(tauler[i][j] % 2 == 0){  // CORRECCIÓ: (i+j)%2
                    tauler[i][j] = SIMBOL_VERMELL;
                }else{
                    tauler[i][j] = SIMBOL_NEGRE;
                }
            }
        }
    }
    
    public static void situaPeo(int[][] tauler,SIMBOL_VERMELL,SIMBOL_NEGRE) {  // CORRECIÓ: no s'indiquen tant paràmetres en l'enunciat
        /**                                                                    // CORRECCIÓ: falta indicar els tipus dels paràmetres
         * Ha de rebre la matriu 'tauler' i ha de situar un 'SIMBOL_PEO'
         * en qualsevol posiciï¿½ aleatï¿½ria igual a 'SIMBOL_VERMELL'.
        
        
        int[] peo;
        boolean okpeo = true;
        
        
        do {
            peo  = UtilitatsArrays.generaArray(2,0, mida-1); // genera posiciÃƒÂ³ de la fulla  // CORRECCIÓ: cal definir 'mida'
            if (tauler[peo[0]][peo[1]] == 0) { // situa el peo al tauler si la posiciÃƒÂ³ estÃƒÂ  buida
                tauler[peo[0]][peo[1]] = SIMBOL_PEO;
                okpeo = false;
            }
        } while (okpeo);
    }
    
    public static void mostraTauler(int[][] matriu) {
        /**
         * Ha de rebre la matriu 'tauler' i ha de substituir cada sï¿½mbol segons la segï¿½ent taula:
            SIMBOL_VERMELL -> "  "
            SIMBOL_NEGRE -> " : "
            SIMBOL_PEO -> " Z "
            SIMBOL_COSTAT -> " | "
         
        char car =' ';
        for(int[] array : tauler){
            System.out.print("| ");
            for(int a: array){
                switch (a){
                    case SIMBOL_VERMELL -> car = ' ';
                    case SIMBOL_NEGRE -> car = ':';
                    case SIMBOL_PEO -> car = 'z';
                    case SIMBOL_COSTAT -> car = '|';
                }
                System.out.print(car + " ");
            }
            System.out.println(" |");
        }
    }
*/