package kapitel6;

public class Tier {
	
	private String bezeichnung;
	private float gewicht;
	private float groesse;
	
	
	public Tier(String bezeichnung, float gewicht, float groesse){
		this.setBezeichnung(bezeichnung);
		this.setGewicht(gewicht);
		this.setGroesse(groesse);
	}
	
	
	public void fresssen(){
		System.out.println(bezeichnung + " frisst");
	}
	
	public void bewegen(){
		System.out.println(bezeichnung + " bewegt sich");
	}
	
	public void atmen(){
		System.out.println(bezeichnung + " atmet");
	}
	
	
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
	
	
	

}
