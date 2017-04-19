package kapitel11.tree;

import kapitel11.Student;

public class TestTreeGeneric {

	public static void main(String[] args) {
		
		TreeGeneric<Student> studentenVerzeichnis = new TreeGeneric<Student>();
		
		studentenVerzeichnis.insert(new Student(8273, "Richard", "Himmel"));
		studentenVerzeichnis.insert(new Student(5521, "Richard", "Himmel"));
		studentenVerzeichnis.insert(new Student(9821, "Richard", "Himmel"));
		studentenVerzeichnis.insert(new Student(1425, "Richard", "Himmel"));
		studentenVerzeichnis.insert(new Student(4523, "Richard", "Himmel"));
		
		System.out.println(studentenVerzeichnis);

	}

}
