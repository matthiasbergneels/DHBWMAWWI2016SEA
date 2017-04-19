package kapitel11.tree;

public class TreeGeneric<V> {

	private Knoten<V> wurzelKnoten = null;
	
	public boolean insert(V data){
		Knoten<V> neuerKnoten = new Knoten<V>(data);
		
		if(wurzelKnoten == null){
			wurzelKnoten = neuerKnoten;
			return true;
		}else{
			return this.insert(wurzelKnoten, neuerKnoten);
		}
	}
	
	private boolean insert(Knoten<V> aktuellerKnoten, Knoten<V> einzufuegenderKnoten){
		
		if(((Comparable<V>)aktuellerKnoten.getData()).compareTo(einzufuegenderKnoten.getData()) > 0){
			if(aktuellerKnoten.getLinkerKnoten() != null){
				return insert(aktuellerKnoten.getLinkerKnoten(), einzufuegenderKnoten);
			}else{
				aktuellerKnoten.setLinkenKnoten(einzufuegenderKnoten);
				return true;
			}
			
		}else if(((Comparable<V>)aktuellerKnoten.getData()).compareTo(einzufuegenderKnoten.getData()) < 0){
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
		
		return "Bauminhalte: " + toString(wurzelKnoten);
	}
	
	private String toString(Knoten<V> aktuellerKnoten){
		
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
	
	private class Knoten<T>{
		private Knoten<T> linkerKnoten = null;
		private Knoten<T> rechterKnoten = null;
		
		private T data;
		
		public Knoten(T data){
			this.data = data;
		}
		
		public T getData(){
			return this.data;
		}
		
		private void setLinkenKnoten(Knoten<T> linkerKnoten){
			this.linkerKnoten = linkerKnoten;
		}
		
		private Knoten<T> getLinkerKnoten(){
			return this.linkerKnoten;
		}
		
		private void setRechterKnoten(Knoten<T> rechterKnoten){
			this.rechterKnoten = rechterKnoten;
		}
		
		private Knoten<T> getRechterKnoten(){
			return this.rechterKnoten;
		}
		
	}
	
}
