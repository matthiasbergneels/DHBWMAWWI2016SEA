package kapitel11.verketteteListe;

import kapitel11.Student;

public class TestVerketteteListe {

	public static void main(String[] args) {
		
		VerketteteListe studentenVerzeichnis = new VerketteteListe();
		
		
		studentenVerzeichnis.add(new Student(4711, "Michael", "Mayer"));
		
		
		studentenVerzeichnis.add(new Student(8273, "Gabi", "Schmidt"));
		studentenVerzeichnis.add(new Student(6172, "Richard", "Himmel"));
		
		studentenVerzeichnis.add(new Student(9278, "Gertrude", "Donner"));
		
		System.out.print("Suche nach MatrikelNr 6172: ");
		System.out.println(studentenVerzeichnis.find(6172));
		System.out.print("Suche nach MatrikelNr 8888: ");
		System.out.println(studentenVerzeichnis.find(8888));
		
		System.out.println("Iterrative Ausgabe =========");
		studentenVerzeichnis.listeAusgebenIterativ();
		
		studentenVerzeichnis.remove(4711);
		studentenVerzeichnis.addAfter(6172, new Student(5263, "Maike", "Wetter"));
		
		System.out.println("Rekursive Ausgabe =========");
		studentenVerzeichnis.listeAusgebenRekursiv();

	}

}
