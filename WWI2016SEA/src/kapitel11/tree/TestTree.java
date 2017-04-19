package kapitel11.tree;

import kapitel11.Student;

public class TestTree {

	public static void main(String[] args) {
		
		Tree studentenVerzeichnis = new Tree();
		
		studentenVerzeichnis.insert(new Student(8273, "Richard", "Himmel"));
		studentenVerzeichnis.insert(new Student(5521, "Richard", "Himmel"));
		studentenVerzeichnis.insert(new Student(9821, "Richard", "Himmel"));
		studentenVerzeichnis.insert(new Student(1425, "Richard", "Himmel"));
		studentenVerzeichnis.insert(new Student(4523, "Richard", "Himmel"));
		
		System.out.println(studentenVerzeichnis);
		
		System.out.println("Suche Matrikel# 9821 --> " + studentenVerzeichnis.find(9821));
		System.out.println("Suche Matrikel# 1425 --> " + studentenVerzeichnis.find(1425));
		System.out.println("Suche Matrikel# 9999 --> " + studentenVerzeichnis.find(9999));

	}

}
