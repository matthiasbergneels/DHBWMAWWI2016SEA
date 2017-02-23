package kapitel7;

public class Bus implements Buchbar, Tankbar{
	
	private boolean[][] sitze;		// false = freierSitze
	
	public Bus(int reihen){
		sitze = new boolean[reihen][4];
		
		for(int i = 0; i < sitze.length; i++){
			for(int j = 0; j < sitze[i].length; j++){
				sitze[i][j] = false;
			}
		}
		
	}

	@Override
	public int freiePlaetze() {
		
		int freiePlaetze = 0;
		for(int i = 0; i < sitze.length; i++){
			for(int j = 0; j < sitze[i].length; j++){
				if(sitze[i][j] == false){
					freiePlaetze++;
				}
			}
		}
		
		return freiePlaetze;
	}

	@Override
	public void reservieren(int anzahlReservierungen) {
		for(int i = 0; i < sitze.length; i++){
			for(int j = 0; j < sitze[i].length; j++){
				if(sitze[i][j] == false){
					sitze[i][j] = true;
					anzahlReservierungen--;
					if(anzahlReservierungen == 0){
						return;
					}
				}
			}
		}
		
	}

	@Override
	public void storniern() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float fuellstand() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void vollTanken() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tanken(float menge) {
		// TODO Auto-generated method stub
		
	}

	
}
