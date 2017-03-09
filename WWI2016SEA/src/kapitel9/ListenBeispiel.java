package kapitel9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import kapitel6.Hund;

public class ListenBeispiel {

	public static void main(String[] args) {
		
		
		List<String> meineListe = new ArrayList<String>();
		
		meineListe.add("Klaus");
		meineListe.add("Gabi");
		meineListe.add("Adam");
		meineListe.add("Hans");
		//meineListe.add(new Hund("Bello", 14.7f, 30.0f, "Schäferhund"));
		
		
		
		System.out.println("Aktuelle Anzahl der Elemente: " + meineListe.size());
		
		System.out.println("Element an der Stelle 1: " + meineListe.get(1));
		
		
		for(int i = 0; i < meineListe.size(); i++){
			System.out.println("Element an der Stelle "+ i +": " + meineListe.get(i));
		}
		
		
		for(String o : meineListe){
			System.out.println(o);
		}
		
		Iterator<String> i = meineListe.iterator();
		while(i.hasNext()){
			
			String o = i.next();
			
			System.out.println(o);
			
		}
		
		
		

	}

}
