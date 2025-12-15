/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ACT4_5;

/**
 *
 * @author aaron
 */
public class UtilitatsRecOrdCerca {
    
    public static double calcularPotencia(int base, int exponente){
        System.out.println("Base: " + base + " Exponente: " + exponente);
        if(exponente == 1){
            System.out.println(base);
            return base;
        }else{
            System.out.println(" > " + (base) + "^" + (exponente -1));
            return (base * calcularPotencia(base, exponente - 1));
        }
    }
    
}
