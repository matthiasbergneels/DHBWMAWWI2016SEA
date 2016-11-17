package kapitel6;

public class Vogel extends Tier {

	private boolean fliegen;
	
	public Vogel(String bezeichnung, float gewicht, float groesse, boolean fliegen) {
		super(bezeichnung, gewicht, groesse);
		
		this.setFliegen(fliegen);
	}
	
	
	public void zwitschern(){
		System.out.println("Der Vogel " + this.getBezeichnung() + " zwitschert!");
	}

	public boolean isFliegen() {
		return fliegen;
	}

	public void setFliegen(boolean fliegen) {
		this.fliegen = fliegen;
	}
	
	
	

}
