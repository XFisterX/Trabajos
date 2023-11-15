package Vehicuulos;

public class TanqueCombustible 
{
    private int capacidadTanque;
    private double cantidadCombustibleTanque = 0;
    
    public TanqueCombustible(int capacidad) 
    {
        capacidadTanque = capacidad;
    }

    public void setCantidadCombustibleTanque(double cantidad) 
    {
        cantidadCombustibleTanque = cantidad;
    }

    public double getCantidadCombustibleTanque() 
    {
        return cantidadCombustibleTanque;
    }

    public void agregarCombustible(double cantidad) 
    {
        double nuevaCantidad = cantidadCombustibleTanque + cantidad;
        if (nuevaCantidad <= capacidadTanque) 
        {
            cantidadCombustibleTanque = nuevaCantidad;
        } else 
        {
            System.out.println("Error: No se puede agregar más combustible. El tanque está lleno.");
        }
    }
}
