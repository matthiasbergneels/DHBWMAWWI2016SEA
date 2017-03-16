package uebungen.kapitel9;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestKunde {

	public static void main(String[] args) {
		
		// Initialisierung der Kunden
		Kunde[] initialeKunden = {
				new Kunde("Mustermann", "Klaus", 4711),
				new Kunde("Beispiel", "Hans", 5180),
				new Kunde("Mustermann", "Hilde", 4712),
				new Kunde("Vorbild", "Theodor", 8278),
				new Kunde("Dummy", "Jimmy", 1111)
		};
		
		// Kundenverzeichnis als Menge (Set) anlegen
		Set<Kunde> kundenVerzeichnis = new TreeSet<Kunde>();
		
		// Initial angelegte Kunden in neues Kundenverzeichnis (Menge) übertragen
		for(Kunde zuzuweisenderKunde : initialeKunden){
			kundenVerzeichnis.add(zuzuweisenderKunde);
		}
		
		
		// Kundenverzeichnis über Iterator auslesen
		Iterator<Kunde> kundenIterator = kundenVerzeichnis.iterator();
		
		while(kundenIterator.hasNext()){
			System.out.println(kundenIterator.next());
		}
		
		

	}

}
