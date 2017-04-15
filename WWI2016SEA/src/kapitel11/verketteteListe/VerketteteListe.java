package kapitel11.verketteteListe;

import kapitel11.Student;

public class VerketteteListe {

	private Knoten ersterKnoten = null;
	
	public void add(Student student){
		Knoten neuerKnoten = new Knoten(student);
		
		neuerKnoten.setNaechsterKnoten(ersterKnoten);	
		ersterKnoten = neuerKnoten;
		
	}
	
	public void addAfter(int matrikelNr, Student student){
		Knoten vorgaengerKnoten = find(ersterKnoten, matrikelNr);
		
		if(vorgaengerKnoten != null){
			Knoten neuerKnoten = new Knoten(student);
			neuerKnoten.setNaechsterKnoten(vorgaengerKnoten.getNaechsterKnoten());
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
		
		if(ersterKnoten != null){
			
			Knoten naktuellerKnoten = ersterKnoten;
			if(naktuellerKnoten.getStudent().getMatrikelNr() == matrikelNr){
				ersterKnoten = ersterKnoten.getNaechsterKnoten();
				return true;
			}
			while(naktuellerKnoten.getNaechsterKnoten() != null){
				if(naktuellerKnoten.getNaechsterKnoten().getStudent().getMatrikelNr() == matrikelNr){
					
					naktuellerKnoten.setNaechsterKnoten(naktuellerKnoten.getNaechsterKnoten().getNaechsterKnoten());
					return true;
				}
				naktuellerKnoten = naktuellerKnoten.getNaechsterKnoten();
			}
		}
		return false;
	}
	
	public boolean remove(Student student){
		
		if(ersterKnoten != null){
			
			Knoten aktuellerKnoten = ersterKnoten;
			if(aktuellerKnoten.getStudent().equals(student)){
				ersterKnoten = ersterKnoten.getNaechsterKnoten();
				return true;
			}
			while(aktuellerKnoten.getNaechsterKnoten() != null){
				if(aktuellerKnoten.getNaechsterKnoten().getStudent().equals(student)){
					
					aktuellerKnoten.setNaechsterKnoten(aktuellerKnoten.getNaechsterKnoten().getNaechsterKnoten());
					return true;
				}
				aktuellerKnoten = aktuellerKnoten.getNaechsterKnoten();
			}
		}
		return false;
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
	}
}
