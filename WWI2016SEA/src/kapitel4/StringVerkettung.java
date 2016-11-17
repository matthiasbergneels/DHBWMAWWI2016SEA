package kapitel4;

public class StringVerkettung {

	public static void main(String[] args){
		
		String ersteZeichenkette = "Hallo";
		String zweiteZeichenkette = "Welt!";
		
		String ergebnis;
		
		
		
		ergebnis = ersteZeichenkette + " " + zweiteZeichenkette + " ist ja super!";
		
		System.out.println(ergebnis);
		
		int zahlA = 15;
		int zahlB = 36;
		
		int rechnung = zahlA + zahlB;
		
		ergebnis = "Ergebnis von " + zahlA + " plus " + zahlB + " ist " + rechnung;
		
		
		System.out.println(ergebnis);
		
		
		ergebnis = zahlA + zahlB + " ist das Ergebnis!" + ( zahlA + zahlB );
		
		System.out.println(ergebnis);
		
		
	}
	
}
