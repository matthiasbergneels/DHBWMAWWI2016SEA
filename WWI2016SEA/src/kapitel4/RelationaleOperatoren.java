package kapitel4;

public class RelationaleOperatoren {

	public static void main(String[] args) {
		
		
		boolean istGleich;
		
		int zahlA = 1;
		int zahlB = 36;
		
		istGleich = zahlA == zahlB;
		
		System.out.println(istGleich);
		
		boolean istTeilbar = (  0 == ( zahlB % zahlA ) );
		
		System.out.println(istTeilbar);
		
		
		
		
		String ergebnis;

		
		ergebnis = (zahlA > 2) ? "größer als zwei" : "kleiner zwei";
		
		System.out.println(ergebnis);

	}

}
