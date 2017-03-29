package kapitel9.generischeSortierung;

import java.util.Set;
import java.util.TreeSet;

public class GenerischeMenge {

	public static void main(String[] args) {
		
		
		Set generischeListe = new TreeSet();
		
		//generischeListe.add(100);
		generischeListe.add("Klaus");
		//generischeListe.add(2781);
		//generischeListe.add(87.98);
		generischeListe.add(new Auto("HD-MM 9283", 167, "rot"));
		//generischeListe.add(872);
		generischeListe.add("Martin");
		//generischeListe.add(872);
		//generischeListe.add(187.98);
		generischeListe.add(new Auto("HD-HH 827", 250, "blau"));
		
		for(Object o : generischeListe){
			System.out.println(o);
		}

	}

}
