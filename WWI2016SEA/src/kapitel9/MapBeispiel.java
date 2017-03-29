package kapitel9;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapBeispiel {

	public static void main(String[] args) {
		
		Map<Integer, Student> studentenVerzeichnis = new HashMap<Integer, Student>();
		
		Student student = new Student(4711, "Klaus", "Müller");
		
		studentenVerzeichnis.put(new Integer(student.getMatrikelnummer()), student);
		
		student = new Student(9810, "Gabi", "Mayer");
		
		studentenVerzeichnis.put(student.getMatrikelnummer(), student);
		
		student = new Student(1111, "Hilde", "Gard");
		
		studentenVerzeichnis.put(student.getMatrikelnummer(), student);
		
		student = new Student(4711, "Mike", "Meier"); // Schlüssel 4711 mit neuem Objekt überschrieben
		
		studentenVerzeichnis.put(student.getMatrikelnummer(), student);
		
		
		
		// Auslesen von Werten aus Map
		
		// spezifischen Schlüssel auslesen
		System.out.println(studentenVerzeichnis.get(9810));
		
		//studentenVerzeichnis.remove(9810);
		
		System.out.println("Alle Studenten:");
		//  Auslesen aller Werte über Schlüssel-Set
		Set<Integer> matrikelnummern = studentenVerzeichnis.keySet();
		
		for(int matrikelnummer : matrikelnummern){
			System.out.println(studentenVerzeichnis.get(matrikelnummer));
		}
		
		
		
		

	}

}
