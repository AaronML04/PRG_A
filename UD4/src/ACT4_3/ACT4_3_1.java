package ACT4_3;

/**
 *
 * @author AARON
 */
public class ACT4_3_1 {

    public static void main(String[] args) {
        
        final int NUMALUMNES = 5;
        String[] alumne = new String [NUMALUMNES];
        int[][] notes =UtilitatsMatrius.generaMatriu(NUMALUMNES,0,10);
        
        for (int i = 0; i < NUMALUMNES; i++){
            alumne[i] = UtilitatsConsola.llegirCadena("Nom Alumnes: ");
        }
        
        for (int i = 0; i < NUMALUMNES; i++){
            System.out.print(alumne[i]);
            UtilitatsArrays.mostraArray(notes[i]);
            System.out.println("Mitjana:" + UtilitatsArrays.mitjanaArray(notes[i]));
        }    
    } 
}
