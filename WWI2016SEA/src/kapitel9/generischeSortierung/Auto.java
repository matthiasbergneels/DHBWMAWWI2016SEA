package kapitel9.generischeSortierung;

public class Auto implements Comparable{

	private String kennzeichen;
	private int leistung;
	private String farbe;
	
	public Auto(String kennzeichen, int leistung, String farbe){
		this.setFarbe(farbe);
		this.setKennzeichen(kennzeichen);
		this.setLeistung(leistung);
	}
	
	
	public String getKennzeichen() {
		return kennzeichen;
	}




	public void setKennzeichen(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}




	public int getLeistung() {
		return leistung;
	}




	public void setLeistung(int leistung) {
		this.leistung = leistung;
	}




	public String getFarbe() {
		return farbe;
	}




	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}




	@Override
	public int compareTo(Object o) {
		
		
		if(this.getClass() != o.getClass()){
			// Sortierung nach dem Klassennamen alphabetisch aufsteigend
			return this.getClass().toString().compareTo(o.getClass().toString());
		}
		
		Auto auto = (Auto)o;
		
		// Sortierung innerhalb von Auto Objekten nach 
		return this.getKennzeichen().compareTo(auto.getKennzeichen());
	}

	
	@Override
	public boolean equals(Object obj) {
		
		// Alias Check
		if(this == obj){
			return true;
		}
				
		// Null Check
		if(obj == null){
			return false;
		}
				
		// Type Check
		if(this.getClass() != obj.getClass()){
			return false;
		}
				
		// Attribute Check
		Auto auto = (Auto)obj;
		return this.getKennzeichen().equals(auto.getKennzeichen());
	}
}
