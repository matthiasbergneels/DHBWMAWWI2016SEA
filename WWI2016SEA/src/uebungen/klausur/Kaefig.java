package uebungen.klausur;

public class Kaefig {

	private double ccm;
	private Tier bewohner;
	
	public Kaefig(double cmm){
		this.ccm = cmm;
	}
	
	public void setBewohner(Tier bewohner){
		this.bewohner = bewohner;
	}
	
	public String getArtBewohner(){
		
		String art = "";
		
		if(bewohner instanceof Hase){
			art =  "Hase";
		}else if(bewohner instanceof Vogel) {
			art =  "Vogel";
		}
		
		
		return art;
		
	}
	
}
