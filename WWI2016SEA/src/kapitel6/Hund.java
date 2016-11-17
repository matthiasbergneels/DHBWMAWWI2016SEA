package kapitel6;

public class Hund extends Tier{

	private String rasse;
	
	public Hund(String bezeichnung, float gewicht, float groesse, String rasse) {
		super(bezeichnung, gewicht, groesse);
		
		this.setRasse(rasse);
		
		
	}
	
	public void bellen(){
		System.out.println("Der Hund " + this.getBezeichnung() + " bellt!!");
	}
	

	public String getRasse() {
		return rasse;
	}

	public void setRasse(String rasse) {
		this.rasse = rasse;
	}

	
	
	
}
