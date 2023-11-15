package Vehicuulos;

import java.util.Scanner;

public class Auto extends Terrestre {

    private Motor miMotor;
    private Odometro miOdometro;
    private TanqueCombustible miTanque;

 
    public Auto(int capacidadTanque) 
    {
        this.miMotor = new Motor();
        this.miOdometro = new Odometro();
        this.miTanque = new TanqueCombustible(capacidadTanque);
    }

  
    public void arrancarAuto() 
    {
        miMotor.encenderMotor();
        System.out.println("Se ha encendido el motor");
    }

    public void apagarAuto() 
    {
        miMotor.apagarMotor();
        System.out.println("Se ha aoagado el motor");
    }

    public void llenarInformacionTerrestreConScanner() 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de combustible a agregar: ");
        double cantidadCombustible = scanner.nextDouble();
        miTanque.agregarCombustible(cantidadCombustible);
        
    }
}