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
	
	@Override
	public void atmen() {
		System.out.println("Der Hund " + this.getBezeichnung() + " atmet und grunzt!");
		
	}
	
	@Override
	public void fressen(){
		super.fressen();
		System.out.println("- und zwar jede Menge Fleisch!");
	}
	
	public String getRasse() {
		return rasse;
	}

	public void setRasse(String rasse) {
		this.rasse = rasse;
	}

	@Override
	public String toString() {
		
		
		
		return "Der Hund " + super.toString() + ", hat die Rasse " + this.getRasse();
	}
	
	
}
