
public class One_Field {
	/*
	 * Hier f�ngt der Spa� eigentlich an. Denn zun�chst einmal m�ssen wir definieren, was wir so alles 
	 * zum Programmieren haben wollen: Als da w�re ein One-Field; ein Objekt, in dem wir die Eigenschaften f�r 
	 * ein einzelnes Feld bestimmen und auch ver�ndern
	 */	
	private boolean IsShip, 			//Variable, ob sich auf dem Feld ein Schiff(~steil) befindet
					IsHit,				//Variable, ob das Feld bereits getroffen wurde
					IsShipPossible; 	//Variable, ob das Feld noch mit einem Schiff belegt werden kann. Am Anfang nat�rlich JA 
	
	public One_Field() 					//Neues Objekt wird erstellt
	{
		IsShip=false;
		IsHit=false;
		IsShipPossible=true;
	}
	public void setShip () 				//Methode, mit der ein One-Field mit einem Schiff besetzt wird
	{
		IsShip=true;
	}
	public void noShip()				//Es k�nnen auf dem jeweiligen Feld keine Schiffe mehr gesetzt werden  
	{
		IsShipPossible=false;
	}
	public void setHit ()
	{
		IsHit=true;
	}
	public boolean getPossible() 		
	{
		return IsShipPossible;
	}
	public boolean getHit()
	{
		return IsHit;
	}
	public boolean getShip()
	{
		return IsShip;
	}
}