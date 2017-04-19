package kapitel11.stack;

import kapitel11.Student;

public class TestStack {

	public static void main(String[] args) {
		
		// Studenten Stack
		Stack studentenStapel = new Stack();
		
		System.out.println("Stapelgroesse: " + studentenStapel.size());
		
		studentenStapel.push(new Student(6172, "Richard", "Himmel"));
		System.out.println("Stapelgroesse nach 1 Push: " + studentenStapel.size());
		
		studentenStapel.push(new Student(8273, "Richard", "Himmel"));
		studentenStapel.push(new Student(9283, "Richard", "Himmel"));
		studentenStapel.push(new Student(1232, "Richard", "Himmel"));
		studentenStapel.push(new Student(8192, "Richard", "Himmel"));
		
		
		
		System.out.println("Stapelgroesse nach 4 Push: " + studentenStapel.size());
		
		System.out.println(studentenStapel.peek());
		
		System.out.println("Stapelgroesse nach Peek: " + studentenStapel.size());
		
		System.out.println(studentenStapel.pop());
		System.out.println(studentenStapel.pop());
		
		System.out.println("Stapelgroesse nach 2 Pop: " + studentenStapel.size());

	}

}
