package kapitel11;

public class Student {
	private int matrikelNr;
	private String vorname;
	private String nachname;
	
	public Student(int matrikelNr, String vorname, String nachname){
		this.setMatrikelNr(matrikelNr);
		this.setVorname(vorname);
		this.setNachname(nachname);
	}
	
	public int getMatrikelNr() {
		return matrikelNr;
	}
	public void setMatrikelNr(int matrikelNr) {
		this.matrikelNr = matrikelNr;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	@Override
	public String toString() {
		
		return this.getMatrikelNr() + ": " + this.getNachname() + ", " + this.getVorname();
	}
	
}
