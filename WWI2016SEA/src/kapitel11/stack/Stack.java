package kapitel11.stack;

import kapitel11.Student;

public class Stack {

	private Element oberstesElement = null;
	
	public void push(Student data){
		if(oberstesElement != null){
			oberstesElement = new Element(data, oberstesElement);
		}else{
			oberstesElement = new Element(data, null);
		}
	}
	
	public Student pop(){
		Element aktuellesOberstesElement = oberstesElement;
		if(aktuellesOberstesElement != null){
			oberstesElement = aktuellesOberstesElement.getUnteresElement();
			return aktuellesOberstesElement.getData();
		}
		
		return null;
	}
	
	public Student peek(){
		if(oberstesElement != null){
			return oberstesElement.getData();
		}
		return null;
	}
	
	public int size(){
		int count = 0;
		
		if(oberstesElement != null){
			Element aktuellesElement = oberstesElement;
			count++;
			while(aktuellesElement.getUnteresElement() != null){
				count++;
				aktuellesElement = aktuellesElement.getUnteresElement();
			}
				
		}
				
		return count;
	}
	
	public void clear(){
		this.oberstesElement = null;
	}
	
	
	private class Element{
		
		private Element unteresElement = null;
		private Student data;
		
		public Element(Student data, Element unteresElement){
			this.unteresElement = unteresElement;
			this.data = data;
		}
		
		public Student getData(){
			return this.data;
		}
		
		public Element getUnteresElement(){
			return this.unteresElement;
		}
	}
}
