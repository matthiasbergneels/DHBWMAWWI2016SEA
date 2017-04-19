package kapitel11.tree;

import kapitel11.Student;

public class Tree {

	private Knoten wurzelKnoten = null;
	
	public boolean insert(Student data){
		Knoten neuerKnoten = new Knoten(data);
		
		if(wurzelKnoten == null){
			wurzelKnoten = neuerKnoten;
			return true;
		}else{
			return this.insert(wurzelKnoten, neuerKnoten);
		}
	}
	
	public Student find(int matrikelNr){
		Knoten ergebnis = find(wurzelKnoten, matrikelNr);
		
		if(ergebnis != null){
			return ergebnis.getData();
		}else{
			return null;
		}
		
	}
	
	private Knoten find(Knoten aktuellerKnoten, int matrikelNr){
		if(aktuellerKnoten != null){
			int aktuelleMatrikelNr = aktuellerKnoten.getData().getMatrikelNr();
			if(aktuelleMatrikelNr == matrikelNr){
				return aktuellerKnoten;
			}else if(aktuelleMatrikelNr > matrikelNr){
				return find(aktuellerKnoten.getLinkerKnoten(), matrikelNr);
			}else if(aktuelleMatrikelNr < matrikelNr){
				return find(aktuellerKnoten.getRechterKnoten(), matrikelNr);
			}
		}
		
		return null;
	}
	
	private boolean insert(Knoten aktuellerKnoten, Knoten einzufuegenderKnoten){
		
		if(((Comparable<Student>)aktuellerKnoten.getData()).compareTo(einzufuegenderKnoten.getData()) > 0){
			if(aktuellerKnoten.getLinkerKnoten() != null){
				return insert(aktuellerKnoten.getLinkerKnoten(), einzufuegenderKnoten);
			}else{
				aktuellerKnoten.setLinkenKnoten(einzufuegenderKnoten);
				return true;
			}
			
		}else if(((Comparable<Student>)aktuellerKnoten.getData()).compareTo(einzufuegenderKnoten.getData()) < 0){
			if(aktuellerKnoten.getRechterKnoten() != null){
				return insert(aktuellerKnoten.getRechterKnoten(), einzufuegenderKnoten);
			}else{
				aktuellerKnoten.setRechterKnoten(einzufuegenderKnoten);
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		if(this.wurzelKnoten == null){
			return "Leerer Baum";
		}
		
		return "Bauminhalte: " + this.toString(wurzelKnoten);
	}
	
	private String toString(Knoten aktuellerKnoten){
		
		String ausgabe = "";
		
		if(aktuellerKnoten.getLinkerKnoten() != null){
			ausgabe += toString(aktuellerKnoten.getLinkerKnoten());
		}
		
		ausgabe += "\n" + aktuellerKnoten.getData();
		
		if(aktuellerKnoten.getRechterKnoten() != null){
			ausgabe += toString(aktuellerKnoten.getRechterKnoten());
		}
		
		return ausgabe;
	}
	
	public void clear(){
		this.wurzelKnoten = null;
	}
	
	public int size(){
		
		return 0;
	}
	
	private class Knoten{
		private Knoten linkerKnoten = null;
		private Knoten rechterKnoten = null;
		
		private Student data;
		
		public Knoten(Student data){
			this.data = data;
		}
		
		public Student getData(){
			return this.data;
		}
		
		private void setLinkenKnoten(Knoten linkerKnoten){
			this.linkerKnoten = linkerKnoten;
		}
		
		private Knoten getLinkerKnoten(){
			return this.linkerKnoten;
		}
		
		private void setRechterKnoten(Knoten rechterKnoten){
			this.rechterKnoten = rechterKnoten;
		}
		
		private Knoten getRechterKnoten(){
			return this.rechterKnoten;
		}
		
	}
	
}
