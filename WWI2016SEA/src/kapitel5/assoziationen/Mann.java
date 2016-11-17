package kapitel5.assoziationen;

public class Mann {

	
	private String name;
	
	// ...
	
	private Frau ehefrau;
	
	private Kind[] kinder;
	
	public Mann(String name){
		this.setName(name);
		kinder = new Kind[5];
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Frau getEhefrau() {
		return ehefrau;
	}

	public void setEhefrau(Frau ehefrau) {
		if(this.getEhefrau() != null){
			Frau exfrau = this.ehefrau;
			this.ehefrau = null;
			exfrau.setEhemann(null);
		}
		this.ehefrau = ehefrau;
	}
	
	
	
	public Kind[] getKinder() {
		return kinder;
	}


	public void setKind(Kind kind) {
		
		// TODO: prüfen ob Array schon voll ist --> wenn ja: Fehler "kein Platz mehr für Kind
		
		for(int i = 0; i < kinder.length; i++){
			if(kinder[i] != null){
				kinder[i] = kind;
				break;
			}
		}
	}
	
	
}
