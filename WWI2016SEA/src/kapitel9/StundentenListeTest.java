package kapitel9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StundentenListeTest {

	public static void main(String[] args) {
		
		
		List<Student> studentenListe = new ArrayList<Student>();
		
		studentenListe.add(new Student(1782, "Martin", "Müller"));
		studentenListe.add(new Student(1872, "Klaus", "Dummy"));
		studentenListe.add(new Student(9823, "Michael", "Dummy"));
		studentenListe.add(new Student(2673, "Hans", "Dummy"));
		studentenListe.add(new Student(7839, "Gabi", "Mayer"));
		studentenListe.add(new Student(7687, "Gertrude", "Dummy"));

		
		System.out.println("Unsortierte Ausgabe:");
		for(Student student : studentenListe){
			System.out.println(student);
		}
		
		
		System.out.println("Sortiert Ausgabe (Nachname, Vorname, Matrikelnr:");
		Collections.sort(studentenListe, new StudentenSortierungNachNachnameVornameMatrikelnummer());
		for(Student student : studentenListe){
			System.out.println(student);
		}
		
		System.out.println("Anzahl Studenten: " + studentenListe.size());
		
		/*
		// Überspringt einzelne Einträge (Index) aufgrund von Verschiebungen beim Löschen
		for(int i = 0; i < studentenListe.size(); i++){
			System.out.println(studentenListe.get(i));
			if(studentenListe.get(i).getNachname().equals("Dummy")){
				studentenListe.remove(i);
			}
		}
		*/
		
		/*
		// Siehe Problem oben + Runtime Exception möglich
		for(Student student : studentenListe){
			System.out.println(student);
			if(student.getNachname().equals("Dummy")){
				studentenListe.remove(student);
			}
		}
		*/
		
		// Korrekte Modifikation (Beispiel "Löschen") einer Liste
		Iterator<Student> studentenIterator = studentenListe.iterator();
		
		while(studentenIterator.hasNext()){
			Student student = studentenIterator.next();
			System.out.println(student);
			if(student.getNachname().equals("Dummy")){
				studentenIterator.remove();
			}
		}
		
		System.out.println("Anzahl Studenten: " + studentenListe.size());
		
		
		
	}

}
