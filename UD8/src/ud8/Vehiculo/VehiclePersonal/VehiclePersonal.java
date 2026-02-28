/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud8.Vehiculo.VehiclePersonal;

import ud8.Vehiculo.Vehicle;

/**
 *
 * @author aaron
 */
public class VehiclePersonal extends Vehicle {
    private boolean esElectric;
    
    public VehiclePersonal(String matricula, String marca, String model, int any, boolean esElectric) {
        super(matricula, marca, model, any);
        this.esElectric = esElectric;
    }
    
    @Override
    public double calculaImposts() {
        return (this.esElectric ? 50 : 0);
    }
    
    @Override
    public double calculaManteniment() {
        return 75;
    }
}
