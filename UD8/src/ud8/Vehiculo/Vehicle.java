/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud8.Vehiculo;

import java.util.ArrayList;
import ud8.Clases.Reparacio;

/**
 *
 * @author aaron
 */
public abstract class Vehicle {
    private String matricula;
    private String marca;
    private String model;
    private int any;
    private ArrayList<Reparacio> reparacions;

    public Vehicle(String matricula, String marca, String model, int any) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.any = any;
        this.reparacions = new ArrayList<Reparacio>();
    }
    
    // Mètodes abstractess
    public abstract double calculaImposts();
    
    public abstract double calculaManteniment();
    
    // Mètodes concrets
    public double calculaReparacions() {
        double total=0;
        for (Reparacio r : this.reparacions)
            total += r.getPreu();
        
        return total;
    }
    
    public boolean afegeixReparacio(Reparacio r) {
        if (!(this.reparacions.contains(r)))
            return this.reparacions.add(r);
        return false;
    }
    //alternativa a elimina con cerca*****
    public boolean eliminaReparacio(String descripcio) {
    for (Reparacio r : reparacions) {
        if (r.getDescripcio().equals(descripcio)) {
            return reparacions.remove(r);
        }
    }
    return false;
}
    /*
    private int cercaReparacio(String descripcio) {
        int index = 0;
        
        for (Reparacio r : reparacions) {
            if (r.getDescripcio().equals(descripcio))
                return index;
            index++;
        }
        return -1;
    }
    */
    public String getMatricula() {
        return matricula;
    }
    
    
}
