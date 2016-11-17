package kapitel5;


public class Auto {

	private byte anzahlTueren; // Standardwert 0
	private int leistung; // SW 0
	private byte anzahlReifen = 4; 
	private String farbe; //  = null; // SW null
	private boolean schiebedach; // SW false
	private double laufleistung; // SW 0.0
	
	private boolean hatBeule = false;
	
	private static int autozaehler; 
	
	
	
	Auto(byte anzahlTueren, int leistung, String farbe, boolean schiebedach){
		this.anzahlTueren = anzahlTueren;
		this.leistung = leistung;
		this.setFarbe(farbe);
		this.schiebedach = schiebedach;
		this.laufleistung = 0.0;
		
		autozaehler++;
		
	}
	
	public static int getAutozaehler(){
		// System.out.println(leistung); // Kein Zugriff auf Instanzattribute aus Klassenmethoden
		return autozaehler;
	}
	
	Auto(byte anzahlTueren, int leistung){
		this(anzahlTueren, leistung, "rot", false);
	}

	Auto(byte anzahlTueren){
		this(anzahlTueren, 230, "rot", false);
	}
	
	/* Fehler, weil Methodensignatur identisch ist!
	Auto(byte anzahlReifen){
		
	}
	*/
	
	Auto(String farbe){
		this((byte)5, 150, farbe, true);
	}
	
	
	
	
	public void dranTreten(){
		this.hatBeule = true;
		
	}
	
	public void hatBeule(){
		if(hatBeule){
			System.out.println("Das Auto hat eine Beule");
		}else{
			System.out.println("Das Auto hat keine Beule");
		}
	}
	
	
	public int getLeistung() {
		return this.leistung;
	}


	public void setLeistung(int leistung) {
		this.leistung = leistung;
	}


	public boolean isSchiebedach() {
		return schiebedach;
	}


	public void setSchiebedach(boolean schiebedach) {
		this.schiebedach = schiebedach;
	}


	public byte getAnzahlTueren() {
		return anzahlTueren;
	}


	public byte getAnzahlReifen() {
		return anzahlReifen;
	}


	public void fahren(double entfernung){
		this.laufleistung = this.laufleistung + entfernung;
		System.out.println("Das "+ this.farbe + "Auto fährt " + entfernung + "km...");
	}
	
	public void fahren(){
		this.fahren(1.0);
		//this.laufleistung = this.laufleistung + 1.0;
		//System.out.println("Das "+ this.farbe + "Auto fährt " + 1.0 + "km...");
	}
	
	
	public double getLaufleistung(){
		return this.laufleistung;
	}
	
	public String getFarbe(){
		return this.farbe;
	}
	
	public void setFarbe(String farbe){
		if( farbe.equals("rot")||farbe.equals("gruen")||farbe.equals("blau") ){
			this.farbe = farbe;
		}else{
			this.farbe = "blau";
		}
		
	}
	
	
	protected void finalize() {
		autozaehler--;
		System.out.println("Auto wurde zerstört. Restliche Autos: " + getAutozaehler());
	}
	
}
