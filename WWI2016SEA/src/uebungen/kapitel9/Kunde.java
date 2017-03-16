package uebungen.kapitel9;

public class Kunde implements Comparable<Kunde>{

	private String name;
	private String vorname;
	private int kundenNummer;
	
	
	public Kunde(String name, String vorname, int kundenNummer){
		this.setName(name);
		this.setVorname(vorname);
		this.setKundenNummer(kundenNummer);
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public int getKundenNummer() {
		return kundenNummer;
	}
	public void setKundenNummer(int kundenNummer) {
		this.kundenNummer = kundenNummer;
	}


	@Override
	public int compareTo(Kunde o) {
		return this.getKundenNummer() - o.getKundenNummer();
	}
	
	@Override
	public String toString() {
		return "Kunden#: " + this.getKundenNummer() + ", Name: " + this.getName() + ", " + this.getVorname();
	}
	
}
