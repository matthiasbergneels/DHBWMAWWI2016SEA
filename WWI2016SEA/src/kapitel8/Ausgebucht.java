package kapitel8;

public class Ausgebucht extends Exception{
	
	public Ausgebucht(int fehlendePlaetze){
		super("Ausgebucht: es fehlen " + fehlendePlaetze + "Plätze.");
	}
}
