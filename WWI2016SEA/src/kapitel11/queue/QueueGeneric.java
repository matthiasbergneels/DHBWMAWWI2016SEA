package kapitel11.queue;

public class QueueGeneric<V> {
	
	private Element<V> schlangenAnfang = null;
	private Element<V> schlangenEnde = null;
	
	public void enqueue(V data){
		Element<V> neuesElement = new Element<V>(data);
		
		if(this.schlangenAnfang == null && this.schlangenEnde == null){
			// Leere Queue
			this.schlangenAnfang = neuesElement;
			this.schlangenEnde = neuesElement;
		}else{
			// gefüllte Queue - anfügen am Anfang
			neuesElement.setFolgendesElement(this.schlangenAnfang);
			this.schlangenAnfang.setVorherigesElement(neuesElement);
			this.schlangenAnfang = neuesElement;
		}
		
	}
	
	public V dequeue(){
		if(this.schlangenEnde != null){
			Element<V> letztesElement = this.schlangenEnde;
			
			if(this.schlangenEnde.getVorherigesElement() != null){
				this.schlangenEnde.getVorherigesElement().setFolgendesElement(null);
				this.schlangenEnde = this.schlangenEnde.getVorherigesElement();
			}else{
				// Liste ist nach entnahme dieses Elements leere!
				this.schlangenEnde = null;
				this.schlangenAnfang = null;
			}
			
			return letztesElement.getData();
		}
		
		return null;
	}
	
	public void clear(){
		this.schlangenAnfang = null;
		this.schlangenEnde = null;
	}

	public int size(){
		int count = 0;
		
		if(this.schlangenAnfang != null){
			count++;
			Element<V> aktuellesElement = this.schlangenAnfang;
			
			while(aktuellesElement.getFolgendesElement() != null){
				count++;
				aktuellesElement = aktuellesElement.getFolgendesElement();
			}
		}
		
		return count;
	}
	
	@Override
	public String toString(){
		if(this.schlangenAnfang == null){
			return "Queue is leer";
		}
		
		Element<V> aktuellesElement = this.schlangenAnfang;
		String ausgabe = "Aktuelle Warteschlange:";
		
		while(aktuellesElement != null){
			ausgabe = ausgabe + "\n" + aktuellesElement.getData();
			aktuellesElement = aktuellesElement.getFolgendesElement();
		}
		
		return ausgabe;
	}
	
	private class Element<T>{
		private Element<T> vorherigesElement = null;
		private Element<T> folgendesElement = null;
		
		private T data;
		
		public Element(T data){
			this.data = data;
		}
		
		public Element<T> getVorherigesElement(){
			return this.vorherigesElement;
		}
		
		public T getData(){
			return this.data;
		}
		
		public void setVorherigesElement(Element<T> vorherigesElement){
			this.vorherigesElement = vorherigesElement;
		}
		
		public Element<T> getFolgendesElement(){
			return this.folgendesElement;
		}
		
		public void setFolgendesElement(Element<T> folgendesElement){
			this.folgendesElement = folgendesElement;
		}
		
	}
}
