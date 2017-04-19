package kapitel11.stack;

public class StackGeneric<V> {

	Element<V> oberstesElement = null;
	
	public void push(V data){
		oberstesElement = new Element<V>(data, oberstesElement.getUnteresElement());
	}
	
	public V pop(){
		Element<V> aktuellesOberstesElement = oberstesElement;
		if(aktuellesOberstesElement != null){
			oberstesElement = aktuellesOberstesElement.getUnteresElement();
			return aktuellesOberstesElement.getData();
		}
		
		return null;
	}
	
	public V peek(){
		if(oberstesElement != null){
			return oberstesElement.getData();
		}
		return null;
	}
	
	public int size(){
		int count = 0;
		
		if(oberstesElement != null){
			Element<V> aktuellesElement = oberstesElement;
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
	
	private class Element<T>{
		
		private Element<T> unteresElement = null;
		private T data;
		
		public Element(T data, Element<T> unteresElement){
			this.unteresElement = unteresElement;
			this.data = data;
		}
		
		public T getData(){
			return this.data;
		}
		
		public Element<T> getUnteresElement(){
			return this.unteresElement;
		}
	}
}
