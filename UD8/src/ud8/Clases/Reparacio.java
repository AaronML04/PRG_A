/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud8.Clases;

import java.util.Objects;

/**
 *
 * @author aaron
 */
public class Reparacio {
    private String descripcio;
    private double preu;

    public Reparacio(String descripcio, double preu) {
        this.descripcio = descripcio;
        this.preu = preu;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public double getPreu() {
        return preu;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.descripcio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reparacio other = (Reparacio) obj;
        return Objects.equals(this.descripcio, other.descripcio);
    }

    @Override
    public String toString() {
        return "Reparacio{" + "descripcio=" + descripcio + ", preu=" + preu + '}';
    }
    
    
}
