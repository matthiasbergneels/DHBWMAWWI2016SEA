package kapitel9;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class StudierendenVerwaltung {

	public static void main(String[] args) {
		
		
		Set<Student> studierende = new TreeSet<Student>();
		
		studierende.add(new Student(4711, "Klaus", "Müller"));
		studierende.add(new Student(9872, "Gabi", "Mayer"));
		studierende.add(new Student(1762, "Adam", "Riese"));
		studierende.add(new Student(9872, "Franz", "Heinrich"));
		
		
		System.out.println("Anzahl Studierende: " + studierende.size());
		
		Iterator<Student> i = studierende.iterator();
		while(i.hasNext()){
			
			System.out.println(i.next());
		}
		

	}

}
