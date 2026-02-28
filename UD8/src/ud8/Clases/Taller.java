/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud8.Clases;

import java.util.ArrayList;
import ud8.Vehiculo.Vehicle;

/**
 *
 * @author aaron
 */
public class Taller {
    private String nom;
    private ArrayList<Vehicle> vehicles;
    
    public Taller(String nom) {
        this.nom = nom;
        this.vehicles = new ArrayList<>();
    }
    
    public boolean afegeixVehicle(Vehicle v) {
        if (!(this.vehicles.contains(v)))
            return this.vehicles.add(v);
        return false;
    }
    
    public boolean eliminaVehicle(String matricula) {
        return (vehicles.remove(cercaVehicle(matricula)) != null);
    }
    
    private int cercaVehicle(String matricula) {
        int index = 0;
        
        for (Vehicle v : vehicles) {
            if (v.getMatricula().equals(matricula))
                return index;
            index++;
        }
        return -1;
    }
    
    public double calculaTotalReparacions() {
        double total = 0.0;
        for (Vehicle v : vehicles)
            total += v.calculaReparacions();
        return total;
    }
    
    public double calculaTotalManteniment() {
        double total = 0.0;
        for (Vehicle v : vehicles)
            total += v.calculaManteniment();

        return total;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
    
    @Override
    public String toString() {
        String resultat = "Taller: " + nom + "\nVehicles:";
        for (Vehicle v : vehicles)
            resultat += "\n - " + v.toString();
        return resultat + 
               "\nCost total reparacions: " + calculaTotalReparacions() + "EUR" +
               "\nCost total manteniment: " + calculaTotalManteniment() + "EUR";
    }
}
