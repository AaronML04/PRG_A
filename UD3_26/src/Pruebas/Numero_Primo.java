/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

/**
 *
 * @author AARON
 */
public class Numero_Primo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean esPrimer = true;
        for (int i = 23; i<=78; i++) {
            for (int j = 2; j<=i-1; j++) {
                if (i % j == 0) {
                esPrimer = false;
                break;
                }
            }
            if (esPrimer) {
                System.out.println(i + " : es el primer nombre Primer");  //echo i . "és el primer nombre Primer" ;
                break;
            }
            esPrimer = true;
        }
    }
    
}
