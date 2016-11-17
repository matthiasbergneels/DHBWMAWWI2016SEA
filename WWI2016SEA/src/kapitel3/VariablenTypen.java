package kapitel3;

public class VariablenTypen {

	public static void main(String[] args) {
		
		
		// Deklaration einer Integer Variablen mit Namen a
		int a;
		
		boolean wahrheitswertFuerMuedigkeit;
		float dezimalA;
		double dezimalB;
		
		byte c, d, e;
		
		// initialisiere Variable a mit dem Wert 5
		a = 5;
		
		int f = 10;
		
		
		// Deklaration einer Konstanten pi
		final double PI = 3.14;
		
		//pi = 5.1;
		
		
		System.out.println(a);
		
		
		
		// Ganzzahlige Literale
		
		int ganzeZahl;
		
		//dezimal Literal
		ganzeZahl = 152;
		// okal Literal
		ganzeZahl = 017;
		System.out.println(ganzeZahl);
		// hexadezimal Literal
		ganzeZahl = 0xab10;
		System.out.println(ganzeZahl);
		
		// Long Literal
		long sehrGrosseZahle = 728392781920l;
		
		
		// Gleitkommzahlen Literale
		
		double grosseGleitkommaZahl;
		
		grosseGleitkommaZahl = 67.98;
		grosseGleitkommaZahl = 56.67e-10;
		
		float kleineGleitkommaZahl;
		
		kleineGleitkommaZahl = 67.98f;
		kleineGleitkommaZahl = 67.98e-3f;
		
		
		// alphanumerische Literale
		
		// boolean (feste definierte Werte)
		
		boolean muede = true; // false
		
		
		
		// char Literal
		
		char zeichen;
		
		zeichen = 'a';
		
		zeichen = 78;
		
		System.out.println(zeichen);
		
		
		
		String zeichenkette;
		
		zeichenkette = "Hallo zusammen! \n\"boolean\" char \t\tund \\ integer";
		
		System.out.println(zeichenkette);
		

	}

}
