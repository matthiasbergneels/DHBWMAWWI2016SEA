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
	
	
	@Override
	public boolean equals(Object obj) {
		
		// Alias Check
		if(this == obj){
			return true;
		}
		
		// Null Check
		if(obj == null){
			return false;
		}
		
		// Type Check
		if(this.getClass() != obj.getClass()){
			return false;
		}
		
		// Attribute Check
		Student student = (Student)obj;
		
		if(this.getMatrikelnummer() != student.getMatrikelnummer()){
			return false;
		}
		
		if(!this.getNachname().equals(student.getNachname())){
			return false;
		}
		
		if(!this.getVorname().equals(student.getVorname())){
			return false;
		}
		
		return true;
	}
	
	
	@Override
	public int hashCode() {
		
		int hc = 0;
		
		//Berücksichtigt alle Attribute die in 
		//der equals-Methode für den inhaltlichen Vergleich herangezogen werden
		hc = this.getMatrikelnummer() + this.getNachname().hashCode() 
					+ this.getVorname().hashCode();
		
		return hc;
	}
	

}
