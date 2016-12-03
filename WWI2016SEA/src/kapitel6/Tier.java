package kapitel6;

public abstract class Tier {
	
	private String bezeichnung;
	private float gewicht;
	private float groesse;
	
	
	public Tier(String bezeichnung, float gewicht, float groesse){
		this.setBezeichnung(bezeichnung);
		this.setGewicht(gewicht);
		this.setGroesse(groesse);
	}
	
	
	public void fressen(){
		System.out.println(bezeichnung + " frisst");
	}
	
	// bewegen darf in Subklassen nicht überschrieben werden (final)
	public final void bewegen(){
		System.out.println(bezeichnung + " bewegt sich");
	}
	
	public abstract void atmen();
	
	
	public String getBezeichnung() {
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}
	public float getGewicht() {
		return gewicht;
	}
	public void setGewicht(float gewicht) {
		this.gewicht = gewicht;
	}
	public float getGroesse() {
		return groesse;
	}
	public void setGroesse(float groesse) {
		this.groesse = groesse;
	}
	
	
	@Override
	public String toString() {
		
		
		return this.getBezeichnung() + " ist " + this.getGroesse() + " groß, " + this.getGewicht() + "schwer";
	}

}
