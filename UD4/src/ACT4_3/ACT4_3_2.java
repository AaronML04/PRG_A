package ACT4_3;

/**
 *
 * @author AARON
 */
public class ACT4_3_2 {

    public static void main(String[] args) {
        final int MIDA=5;
        String[] alumnes = new String [MIDA];
        int[][] notes = new int [MIDA][MIDA];

        for (int i=0; i<alumnes.length; i++){
            alumnes[i] = UtilitatsConsola.llegirCadena("Nombre del alumno: ");
        }
        
        for (int i = 0; i < MIDA; i++) {
            for (int j = 0; j < MIDA; j++) {
                notes[i][j] = UtilitatsConsola.llegirSencer("Introduce la nota de " + alumnes[i] + ": ");
            }
                System.out.print(alumnes[i] + ": "); 
                UtilitatsArrays.mostraArray(notes[i]);
                System.out.println("Media: " + UtilitatsArrays.mitjanaArray(notes[i]));
                System.out.println("-----------");
        }
    }       
}
