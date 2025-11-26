/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT4_6;

/**
 *
 * @author AARON
 */
public class ACT4_6_1 {
    static final int SIMBOL_BUIT = 0;   
    static int SIMBOL_CUC = 1;          
    static final int SIMBOL_FULLES = 9; 
    static int NFULLES;                 
    static int NTAULER;                 
    static int[] fulla;                 
    static int[] cuc;                   
    static int[][] tauler;              

    public static void main(String[] args) {
        NTAULER = UtilitatsConsola.llegirSencer("Medida del tablero: ");
        NFULLES = UtilitatsConsola.llegirSencer("Numero de Hojas: ");
        
        
        tauler = UtilitatsMatrius.generaMatriu(NTAULER, 0, 0);
        
        // Genera una posición aleatoria inicial para el cuc
        cuc = UtilitatsArrays.generaArray(2, 0, tauler.length - 1);
        
        // Coloca el cuc y las hojas en el tablero
        emplenarTauler(tauler, cuc);
        
        
        UtilitatsMatrius.mostrarMatriu(tauler);
        
        int accio;
        // Bucle principal del juego: se repite hasta que el usuario elija 0 (salir)
        do {
            
            accio = UtilitatsConsola.llegirSencer(
                "Selecciona tu accion: \n 8 arriba, 2 abajo, 4 izquierda, 6 derecha, 0 salir: "
            );
            
            if (accio != 0) {
                
                boolean resultat = cambiaPosicio(tauler, cuc, accio);
                
                
                UtilitatsMatrius.mostrarMatriu(tauler);

                
                if (!resultat) {
                    System.out.println("¡El cuc se ha chocado consigo mismo! Fin del juego.");
                    break;
                }
            }
        } while (accio != 0); 
    }
    
    /**
     * Coloca el cuc y las hojas en el tablero.
     * @param tauler matriz del tablero
     * @param cuc coordenadas iniciales del cuc
     */
    public static void emplenarTauler(int[][] tauler, int[] cuc) {
        int cont = 0;
        
        // Coloca el cuc en su posición inicial
        tauler[cuc[0]][cuc[1]] = SIMBOL_CUC;
        
        // Coloca hojas en posiciones aleatorias hasta alcanzar NFULLES
        while (cont < NFULLES) {
            fulla = UtilitatsArrays.generaArray(2, 0, tauler.length - 1); // Genera posición aleatoria
            
            // Si la posición está vacía, coloca una hoja (9)
            if (tauler[fulla[0]][fulla[1]] == SIMBOL_BUIT) {
                tauler[fulla[0]][fulla[1]] = SIMBOL_FULLES;
                cont++;
            }
        }
    }
    
    /**
     * Cambia la posición del cuc en función de la acción del jugador.
     * También gestiona la colisión y el crecimiento al comer hojas.
     * 
     * @param tauler matriz del tablero
     * @param cuc posición actual del cuc
     * @param accio dirección del movimiento (8, 2, 4, 6)
     * @return true si el movimiento es válido, false si hay colisión
     */
    public static boolean cambiaPosicio(int[][] tauler, int[] cuc, int accio) {
        int mida = tauler.length; // Tamaño del tablero
        int xAnt = cuc[0];        // Guarda posición X anterior
        int yAnt = cuc[1];        // Guarda posición Y anterior
        
        // Cambia las coordenadas del cuc según la acción indicada
        switch (accio) {
            case 8 -> cuc[0] = (cuc[0] == 0 ? mida - 1 : cuc[0] - 1);  // Movimiento hacia arriba
            case 2 -> cuc[0] = (cuc[0] == mida - 1 ? 0 : cuc[0] + 1);  // Movimiento hacia abajo
            case 4 -> cuc[1] = (cuc[1] == 0 ? mida - 1 : cuc[1] - 1);  // Movimiento hacia la izquierda
            case 6 -> cuc[1] = (cuc[1] == mida - 1 ? 0 : cuc[1] + 1);  // Movimiento hacia la derecha
            default -> { return true; } // Si la tecla no es válida, no hace nada
        }
        
        // Si el cuc se mueve a una celda que ya contiene parte de sí mismo → colisión
        if (tauler[cuc[0]][cuc[1]] == SIMBOL_CUC) {
            return false; // Fin del juego
        }
        
        // Si el cuc encuentra una hoja, crece (incrementa el símbolo)
        if (tauler[cuc[0]][cuc[1]] == SIMBOL_FULLES) {
            SIMBOL_CUC++;            
             // Generar una nueva hoja en posición vacía
            afegeixFulla(fulla);
        } else {
            // Si no come, la celda anterior se vacía
            tauler[xAnt][yAnt] = SIMBOL_BUIT;
        }
                
        // Coloca al cuc en la nueva posición
        tauler[cuc[0]][cuc[1]] = SIMBOL_CUC;
                
        return true; // Movimiento válido
    }
    
    public static void afegeixFulla(int[] fulla){
       // boolean posValida = false;
        //while (!posValida) {
            int[] novaFulla = UtilitatsArrays.generaArray(2, 0, tauler.length - 1);
            if (tauler[novaFulla[0]][novaFulla[1]] == SIMBOL_BUIT) {
                tauler[novaFulla[0]][novaFulla[1]] = SIMBOL_FULLES;
          //      posValida = true;
            }
        }
    }

