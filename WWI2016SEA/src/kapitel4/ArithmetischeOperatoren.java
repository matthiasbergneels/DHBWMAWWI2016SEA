package kapitel4;

public class ArithmetischeOperatoren {

	public static void main(String[] args) {
		
		
		int zahl;
		
		zahl = 5 + 15;
		
		
		zahl = 17 % 3;
		
		System.out.println(zahl);
		
	
		int zahlA = 25;
		int zahlB = 36;
		int x;
		
		x = zahlA - zahlB;
		
		
		System.out.println(x);
		
		// x = x + 1;
		x++;   // Postinkrement
		++x;	// Preinkrement
		
		System.out.println(x);
		
		// x = zahlA + zahlB;
		// zahlB = zahlB + 1;
		
		x = zahlA + zahlB++;
		
		System.out.println(x);
		System.out.println(zahlB);
		
		zahlB = 36;
		
		// zahlB = zahlB +1;
		// x = zahlA + zahlB;
		x = zahlA + ++zahlB;
		
		System.out.println(x);
		System.out.println(zahlB);
		
		
		
		
		zahlA += zahlB; // ==> zahlA = zahlA + zahlB;
		
		
		

	}

}
