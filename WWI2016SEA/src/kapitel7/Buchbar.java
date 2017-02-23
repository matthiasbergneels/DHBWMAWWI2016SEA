package kapitel7;

public interface Buchbar {

	public int freiePlaetze();
	public void reservieren(int anzahlReservierungen);
	public void storniern();
	
}
