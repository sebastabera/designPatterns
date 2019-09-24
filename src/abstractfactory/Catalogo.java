package abstractfactory;

import abstractfactory.automovil.Automovil;
import abstractfactory.factory.FabricaVehiculo;
import abstractfactory.factory.FabricaVehiculoElectricidad;
import abstractfactory.factory.FabricaVehiculoGasolina;
import abstractfactory.scooter.Scooter;
import java.util.Scanner;

public class Catalogo {
    
    public static int nAutos = 3;
    
    public static int nScooters = 2;
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        FabricaVehiculo fabrica;
        Automovil[] autos = new Automovil[nAutos];
        Scooter[] scooters = new Scooter[nScooters];
        System.out.print("Desea utilizar " +
            "vehiculos electricos (1) o a gasolina (2):");
        String eleccion = reader.next();
        
        if(eleccion.equals("1")) {
            fabrica = new FabricaVehiculoElectricidad();
        } else {
            fabrica = new FabricaVehiculoGasolina();
        }
        
        for (int index = 0; index < nAutos; index++)
            autos[index] = fabrica.crearAutomovil("estandar",
            "amarillo", 6+index, 3.2);
            for (int index = 0; index < nScooters; index++)
            scooters[index] = fabrica.crearScooter("clasico",
            "rojo", 2+index);
            for (Automovil auto: autos)
            auto.mostrarCaracteristicas();
            for (Scooter scooter: scooters)
            scooter.mostrarCaracteristicas();
    }
    
}
