/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud8.Vehiculo.VehicleMotor;

/**
 *
 * @author aaron
 */
public final class Camio extends VehicleMotor{
    boolean esFrigorific;

    public Camio(String matricula, String marca, String model, int any, double potencia, boolean esFrigorific) {
        super(matricula, marca, model, any, potencia);
        this.esFrigorific = esFrigorific;
    }
    
    @Override
    public double calculaImposts() {
 
        return super.calculaImposts() + (this.esFrigorific ? 5 : 0);

    }
    
    
    
}
