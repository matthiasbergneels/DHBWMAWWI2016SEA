package kapitel11.queue;

import kapitel11.Student;

public class Queue {
	
	private Element schlangenAnfang = null;
	private Element schlangenEnde = null;
	
	public void enqueue(Student data){
		Element neuesElement = new Element(data);
		
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
	
	public Student dequeue(){
		if(this.schlangenEnde != null){
			Element letztesElement = this.schlangenEnde;
			
			if(this.schlangenEnde.getVorherigesElement() != null){
				this.schlangenEnde.getVorherigesElement().setFolgendesElement(null);
				this.schlangenEnde = this.schlangenEnde.getVorherigesElement();
			}else{
				// Liste ist nach entnahme dieses Elements leere!
				this.schlangenEnde = null;
				this.schlangenAnfang = null;
			}
			
			return letztesElement.getStudent();
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
			Element aktuellesElement = this.schlangenAnfang;
			
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
		
		Element aktuellesElement = this.schlangenAnfang;
		String ausgabe = "Aktuelle Warteschlange:";
		
		while(aktuellesElement != null){
			ausgabe = ausgabe + "\n" + aktuellesElement.getStudent();
			aktuellesElement = aktuellesElement.getFolgendesElement();
		}
		
		return ausgabe;
	}
	
	private class Element{
		private Element vorherigesElement = null;
		private Element folgendesElement = null;
		
		private Student data;
		
		public Element(Student data){
			this.data = data;
		}
		
		public Element getVorherigesElement(){
			return this.vorherigesElement;
		}
		
		public Student getStudent(){
			return this.data;
		}
		
		public void setVorherigesElement(Element vorherigesElement){
			this.vorherigesElement = vorherigesElement;
		}
		
		public Element getFolgendesElement(){
			return this.folgendesElement;
		}
		
		public void setFolgendesElement(Element folgendesElement){
			this.folgendesElement = folgendesElement;
		}
		
	}
}
