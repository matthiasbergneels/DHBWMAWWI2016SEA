package kapitel7.clone;

public class Schaf implements Cloneable{
	
	private String name;
	private int alter;
	
	public Schaf(String name, int alter){
		this.name = name;
		this.alter = alter;
	}
	
	@Override
	protected Schaf clone() throws CloneNotSupportedException {
		return (Schaf)super.clone();
	}
	
	@Override
	public String toString() {
		
		return "Name: " + this.name + ", Alter: " + this.alter 
				+ " - " + super.toString();
	}

}
