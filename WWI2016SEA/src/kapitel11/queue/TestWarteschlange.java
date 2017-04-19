package kapitel11.queue;

import kapitel11.Student;

public class TestWarteschlange {

	public static void main(String[] args) {
		
		QueueGeneric<Student> studentenWarteschlange = new QueueGeneric<Student>();
		
		System.out.println("Aktuelle Länge: " + studentenWarteschlange.size());
		
		studentenWarteschlange.enqueue(new Student(8273, "Richard", "Himmel"));
		studentenWarteschlange.enqueue(new Student(9283, "Richard", "Himmel"));
		studentenWarteschlange.enqueue(new Student(1232, "Richard", "Himmel"));
		studentenWarteschlange.enqueue(new Student(8192, "Richard", "Himmel"));
		
		System.out.println("Aktuelle Länge nach 4 Enque: " + studentenWarteschlange.size());
		System.out.println(studentenWarteschlange);
		
		System.out.println("Dequeue:");
		System.out.println(studentenWarteschlange.dequeue());
		System.out.println(studentenWarteschlange.dequeue());
		
		System.out.println("Aktuelle Länge nach 2 Dequeue: " + studentenWarteschlange.size());
		System.out.println(studentenWarteschlange);
	}

}
