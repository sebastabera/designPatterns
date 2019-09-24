package abstractfactory.factory;

import abstractfactory.automovil.Automovil;
import abstractfactory.automovil.AutomovilElectrico;
import abstractfactory.scooter.Scooter;
import abstractfactory.scooter.ScooterElectrico;

public class FabricaVehiculoElectricidad implements FabricaVehiculo {

    @Override
    public Automovil crearAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilElectrico(modelo, color, potencia, espacio);
    }

    @Override
    public Scooter crearScooter(String modelo, String color, int potencia) {
        return new ScooterElectrico(modelo, color, potencia);
    }

}
