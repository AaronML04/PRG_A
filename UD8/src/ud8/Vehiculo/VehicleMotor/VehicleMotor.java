/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud8.Vehiculo.VehicleMotor;

import ud8.Vehiculo.Vehicle;

/**
 *
 * @author aaron
 */
class VehicleMotor extends Vehicle{
    private double potencia;

    public VehicleMotor(String matricula, String marca, String model, int any, double potencia) {
        super(matricula, marca, model, any);
        this.potencia = potencia;
    }

    @Override
    public double calculaImposts() {
        return potencia * 0.02;
    }

    @Override
    public double calculaManteniment() {
        double total = this.potencia * 0.20;
        
        if (this instanceof Camio)
            total += 500;
        else if (this instanceof Cotxe)
            total += 100;
        else if (this instanceof Moto)
            total += 50;
        return total;
    }

    @Override
    public String toString() {
        return super.toString() + "VehicleMotor{" + "potencia=" + potencia + '}';
    }
    
    
}
