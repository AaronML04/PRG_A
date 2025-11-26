package ACT4_2;

/**
 *
 * @author AARON
 */
public class ACT4_2_2 {

    public static void main(String[] args) {
        final int MIDA=10;
        int[][] matriu = UtilitatsMatrius.generaMatriu(MIDA, 10, 100);

        System.out.println();
        UtilitatsMatrius.mostrarMatriu(matriu);
    }
}
