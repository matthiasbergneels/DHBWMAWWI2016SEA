package kapitel3;

public class Typkonvertierungen {

	public static void main(String[] args) {
		
		
		
		float zahl1 = 15.4f;
		double zahl2;
		
		// implizieter Typ-Cast
		zahl2 = zahl1;
		
		zahl1 = (float)zahl2;  // Fehler
		
		int ganzZahl = 15;
		
		// implizieter Typ-Cast
		zahl2 = ganzZahl;
		
		zahl2 = 15.7;
		
		ganzZahl = (int)zahl2;
		
		
		System.out.println(ganzZahl);
		
		
		
		ganzZahl = 128;
		
		byte kleineGanzZahl = (byte)ganzZahl;
		
		System.out.println(kleineGanzZahl);
		
		
		
		

	}

}
