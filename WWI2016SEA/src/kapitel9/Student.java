package kapitel9;

public class Student implements Comparable<Student>{
	
	private int matrikelnummer;
	private String vorname;
	private String nachname;
	
	public Student(int matrikelnummer, String vorname, String nachname){
		this.setMatrikelnummer(matrikelnummer);
		this.setNachname(nachname);
		this.setVorname(vorname);
	}
	
	@Override
	public String toString() {
		
		return this.getMatrikelnummer() + ": " + this.getNachname() 
										+ ", " + this.getVorname();
	}
	
	public int getMatrikelnummer() {
		return matrikelnummer;
	}
	public void setMatrikelnummer(int matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
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
	public int compareTo(Student o) {
		
		return this.getMatrikelnummer() - o.getMatrikelnummer();
	}
	
	

}
