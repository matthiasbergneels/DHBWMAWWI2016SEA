package kapitel5.assoziationen;

public class Frau {
	
	private String name;
	
	// ...
	// Assoziation - verheiratet mit
	private Mann ehemann;
	
	private Kind[] kinder;
	
	
	
	public Frau(String name){
		this.setName(name);
		kinder = new Kind[5];
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Mann getEhemann() {
		return ehemann;
	}

	public void setEhemann(Mann ehemann) {
		if(this.ehemann != null){
			Mann exmann = this.ehemann;
			this.ehemann = null;
			exmann.setEhefrau(null);
		}
		
		this.ehemann = ehemann;
	}


	public Kind[] getKinder() {
		return kinder;
	}


	public void setKind(Kind kind) {
		
		// TODO: prüfen ob Array schon voll ist --> wenn ja: Fehler "kein Platz mehr für Kind
		
		for(int i = 0; i < kinder.length; i++){
			if(kinder[i] == null){
				kinder[i] = kind;
				break;
			}
		}
	}
	
	

}
