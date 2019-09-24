package abstractfactory.factory;

import abstractfactory.automovil.Automovil;
import abstractfactory.scooter.Scooter;

public interface FabricaVehiculo {

    Automovil crearAutomovil(String modelo, String color, int potencia, double espacio);
    
    Scooter crearScooter(String modelo, String color, int potencia);
    
}
