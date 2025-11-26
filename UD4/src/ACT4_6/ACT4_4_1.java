/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ACT4_6;

import java.util.ArrayList;

/**
 *
 * @author AARON
 */
public class ACT4_4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // -------------------------
        // A) LLEGIR NOM DELS ALUMNES
        // -------------------------
        ArrayList<String> alumnes = new ArrayList<>();
        String nom;

        System.out.println("Introdueix els noms dels alumnes (escriu 'sortir' per acabar):");

        while (true) {
            nom = UtilitatsConsola.llegirCadena("Nombre del alumno: ");

            if (nom.equalsIgnoreCase("sortir")) break;

            alumnes.add(nom);
        }
        
        // -------------------------
        // B) MATRIU DE NOTES
        // -------------------------
        ArrayList<Integer>[] notes = new ArrayList[alumnes.size()];

        for (int i = 0; i < alumnes.size(); i++) {
            System.out.println("Introdueix les notes de " + alumnes.get(i) + " (-1 per acabar):");

            notes[i] = new ArrayList<>();

            while (true) {
                int nota = UtilitatsConsola.llegirSencer("Notas del alumno: ");
                if (nota == -1) break;
                notes[i].add(nota);
            }
        }
        
       System.out.println("--- RESULTATS ---");

        for (int i = 0; i < alumnes.size(); i++) {

            ArrayList<Integer> notesAlumne = notes[i];

            System.out.print(alumnes.get(i) + ": ");

            // Mostrar notes
            for (int j = 0; j < notesAlumne.size(); j++) {
                System.out.print(notesAlumne.get(j));
                if (j < notesAlumne.size() - 1) System.out.print(", ");
            }

            // Calcular mitjana
            double suma = 0;
            for (int n : notesAlumne) {
                suma += n;
            }

            double mitjana = notesAlumne.size() > 0 ? suma / notesAlumne.size() : 0.0;

            System.out.println("\nMitjana = " + mitjana);
        }

    }
}
    

