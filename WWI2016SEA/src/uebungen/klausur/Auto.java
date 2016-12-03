package uebungen.klausur;

public class Auto {
	
	private String kfzkz;
	private String marke;
	private static int autozaehler = 0;
	
	public Auto(){
		autozaehler++;
	}
	
	public Auto(String kfzkz, String marke){
		autozaehler++;
		this.setKfzkz(kfzkz);
		this.setMarke(marke);
	}

	
	public String getKfzkz(){
		return this.kfzkz;
	}
	
	public void setKfzkz(String kfzkz){
		this.kfzkz = kfzkz;
	}
	
	public String getMarke(){
		return this.marke;
	}
	
	public void setMarke(String marke){
		this.marke = marke;
	}
	
	public static int getAutozaehler(){
		return autozaehler;
	}
	
	protected void finalize(){
		Auto.autozaehler--;
	}
}
