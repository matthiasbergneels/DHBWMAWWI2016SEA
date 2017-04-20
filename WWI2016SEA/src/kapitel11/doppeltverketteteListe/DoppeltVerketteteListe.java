package kapitel11.doppeltverketteteListe;

import kapitel11.Student;

public class DoppeltVerketteteListe {

	private Knoten ersterKnoten = null;
	private Knoten letzterKnoten = null;
	
	public void add(Student student){
		Knoten neuerKnoten = new Knoten(student);
		
		neuerKnoten.setNaechsterKnoten(ersterKnoten);	
		if(ersterKnoten != null){
			ersterKnoten.setVorherigerKnoten(neuerKnoten);
		}
		
		ersterKnoten = neuerKnoten;
		
		
		
		// Liste war bisher leer
		if(letzterKnoten == null){
			letzterKnoten = ersterKnoten;
		}
		
	}
	
	public void addLast(Student student){
		Knoten neuerKnoten = new Knoten(student);
		
		if(ersterKnoten == null && letzterKnoten == null){
			// Liste war bisher leer
			ersterKnoten = neuerKnoten;
			letzterKnoten = neuerKnoten;
		}else{
			letzterKnoten.setNaechsterKnoten(neuerKnoten);
			neuerKnoten.setVorherigerKnoten(letzterKnoten);
			letzterKnoten = neuerKnoten;
		}
		
	}
	
	public void addAfter(int matrikelNr, Student student){
		Knoten vorgaengerKnoten = find(ersterKnoten, matrikelNr);
		
		if(vorgaengerKnoten != null){
			Knoten neuerKnoten = new Knoten(student);
			neuerKnoten.setNaechsterKnoten(vorgaengerKnoten.getNaechsterKnoten());
			if(vorgaengerKnoten.getNaechsterKnoten() != null){
				vorgaengerKnoten.getNaechsterKnoten().setVorherigerKnoten(neuerKnoten);
			}
			neuerKnoten.setVorherigerKnoten(vorgaengerKnoten);
			vorgaengerKnoten.setNaechsterKnoten(neuerKnoten);
		}
		
	}
	
	public Student find(int matrikelNr){
		
		Knoten ergebnis = find(ersterKnoten, matrikelNr); 
		if(ergebnis != null){
			return ergebnis.getStudent();
		}
		
		return null;
	}
	
	private Knoten find(Knoten knoten, int matrikelNr){
		// Ende der Liste
		if(knoten == null){
			return null;
		}
		
		if(knoten.getStudent().getMatrikelNr() == matrikelNr){
			return knoten;
		}
		 
		return find(knoten.getNaechsterKnoten(), matrikelNr);
	}
	
	public boolean remove(int matrikelNr){
		
		Knoten zuLoeschenderKnoten = find(ersterKnoten, matrikelNr);
		
		if(zuLoeschenderKnoten != null){
			
			if(zuLoeschenderKnoten.getVorherigerKnoten() != null){
				zuLoeschenderKnoten.getVorherigerKnoten().setNaechsterKnoten(zuLoeschenderKnoten.getNaechsterKnoten());
			}
			if(zuLoeschenderKnoten.getNaechsterKnoten() != null){
				zuLoeschenderKnoten.getNaechsterKnoten().setVorherigerKnoten(zuLoeschenderKnoten.getVorherigerKnoten());
			}
			
			return true;
		}
		
		return false;
	}
	
	public boolean remove(Student student){
		
		return remove(student.getMatrikelNr());
		
	}
	
	public void clear(){
		ersterKnoten = null;
		letzterKnoten = null;
	}
	
	
	public void listeAusgebenIterativ(){
		if(ersterKnoten == null){
			System.out.println("Liste ist leer!");
			return;
		}
		
		Knoten aktuellerKnoten = ersterKnoten;
		
		do{
			System.out.println(aktuellerKnoten.getStudent());
			aktuellerKnoten = aktuellerKnoten.getNaechsterKnoten();
		}while(aktuellerKnoten != null);
		
	}
	
	public void listeAusgebenRekursiv(){
		ausgebenKnoten(ersterKnoten);
	}
	
	private void ausgebenKnoten(Knoten knoten){
		if(knoten != null){
			System.out.println(knoten.getStudent());
			ausgebenKnoten(knoten.getNaechsterKnoten());
		}
	}
	
	private class Knoten{
		private Student student;
		private Knoten naechsterKnoten = null;
		private Knoten vorherigerKnoten = null;
		
		public Knoten(Student student){
			this.setStudent(student);
		}
		
		private void setStudent(Student student){
			this.student = student;
		}
		
		public Student getStudent(){
			return student;
		}
		
		public void setNaechsterKnoten(Knoten naechsterKnoten){
			this.naechsterKnoten = naechsterKnoten;
		}
		
		public Knoten getNaechsterKnoten(){
			return this.naechsterKnoten;
		}
		
		public void setVorherigerKnoten(Knoten vorherigerKnoten){
			this.vorherigerKnoten = vorherigerKnoten;
		}
		
		public Knoten getVorherigerKnoten(){
			return this.vorherigerKnoten;
		}
	}
}
