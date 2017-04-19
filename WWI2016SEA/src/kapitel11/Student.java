package kapitel11;

public class Student implements Comparable<Student>{
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

	@Override
	public int compareTo(Student o) {
		return this.matrikelNr - o.getMatrikelNr();
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
				
		if(this.getMatrikelNr() != student.getMatrikelNr()){
			return false;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		
		return this.getMatrikelNr();
	}
	
	
	
}
