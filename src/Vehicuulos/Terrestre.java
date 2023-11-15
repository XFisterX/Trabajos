package Vehicuulos;

abstract class Terrestre extends Vehiculo
{
	    public static void main(String[] args) 
	{
	        Auto miAuto = new Auto(50); 
	        miAuto.arrancarAuto();
	        miAuto.llenarInformacionTerrestreConScanner();
	        miAuto.arrancarAuto();
		
	}
}
