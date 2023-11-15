package Vehicuulos;

   class Motor {

	    private boolean encenderMotor = false;

	    public void encenderMotor() 
	    {
	        encenderMotor = true;
	    }

	    public void apagarMotor() 
	    {
	        encenderMotor = false;
	    }

	    public boolean getEnciendeMotor() 
	    {
	        return encenderMotor;
	    }
	}

