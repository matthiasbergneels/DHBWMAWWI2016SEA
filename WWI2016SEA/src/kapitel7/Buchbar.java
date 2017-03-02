package kapitel7;

import kapitel8.Ausgebucht;

public interface Buchbar {

	public int freiePlaetze();
	public void reservieren(int anzahlReservierungen) throws Ausgebucht;
	public void storniern();
	
}
