package kapitel5.assoziationen;

public class Kind {

	
	private String name;
	
	// ...
	
	private Mann vater;
	private Frau mutter;
	
	
	
	public Kind(String name, Mann vater, Frau mutter){
		this.setName(name);
		this.setVater(vater);
		this.setMutter(mutter);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Mann getVater() {
		return vater;
	}
	
	private void setVater(Mann vater) {
		if(vater == null){
			// TODO: Fehler "kein Vater übergeben" werfen
		}
		
		this.vater = vater;
		this.vater.setKind(this);
	}
	
	public Frau getMutter() {
		return mutter;
	}
	
	private void setMutter(Frau mutter) {
		if(mutter == null){
			// TODO: Fehler "keine Mutter übergeben" werfen
			
		}
		
		this.mutter = mutter;
		this.mutter.setKind(this);
	}
	
	
	
	
	
}
