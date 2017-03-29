package kapitel9;

public class StudentenVergleich {

	public static void main(String[] args) {
		
		Student student1 = new Student(1678, "Klaus", "Müller");
		Student student2 = new Student(8992, "Gabi", "Heinrich");
		Student student3 = new Student(1678, "Klaus", "Müller");
		
		
		System.out.println("Student 1: " + student1 + " - HashCode: " + student1.hashCode());
		System.out.println("Student 2: " + student2 + " - HashCode: " + student2.hashCode());
		System.out.println("Student 3: " + student3 + " - HashCode: " + student3.hashCode());

		System.out.println("Vergleich Student 1 und 2: " + student1.equals(student2));
		System.out.println("Vergleich Student 2 und 3: " + student2.equals(student3));
		System.out.println("Vergleich Student 1 und 3: " + student1.equals(student3));
		
		
	}

}
