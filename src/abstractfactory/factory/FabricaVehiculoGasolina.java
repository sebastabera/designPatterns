package abstractfactory.factory;

import abstractfactory.automovil.Automovil;
import abstractfactory.automovil.AutomovilGasolina;
import abstractfactory.scooter.Scooter;
import abstractfactory.scooter.ScooterGasolina;

public class FabricaVehiculoGasolina implements FabricaVehiculo{

    @Override
    public Automovil crearAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilGasolina(modelo, color, potencia, espacio);
    }

    @Override
    public Scooter crearScooter(String modelo, String color, int potencia) {
        return new ScooterGasolina(modelo, color, potencia);
    }

}
