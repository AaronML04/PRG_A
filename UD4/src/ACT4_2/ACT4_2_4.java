package ACT4_2;

/**
 *
 * @author AARON
 */
public class ACT4_2_4 {

    public static void main(String[] args) {
        final int MIDA=10;
        int[][] matriu = UtilitatsMatrius.generaMatriu(MIDA, 10, 100);
        int[] diagonal;

        System.out.println();
        UtilitatsMatrius.mostrarMatriu(matriu);
        System.out.println();
        diagonal = UtilitatsMatrius.generaDiagonalSecundaria(matriu);
        UtilitatsArrays.mostraArray(diagonal);
    }
}