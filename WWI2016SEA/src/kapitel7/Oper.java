package kapitel7;

public class Oper implements Buchbar{
	
	private int plaetze;
	private int belegtePlatze;
	
	public Oper(int plaetze){
		this.plaetze = plaetze;
		this.belegtePlatze = 0;
	}

	@Override
	public int freiePlaetze() {
		
		return plaetze-belegtePlatze;
	}

	@Override
	public void reservieren(int anzahlReservierung) {
		this.belegtePlatze = this.belegtePlatze + anzahlReservierung;
		
	}

	@Override
	public void storniern() {
		// TODO Auto-generated method stub
		
	}

	
	
}
