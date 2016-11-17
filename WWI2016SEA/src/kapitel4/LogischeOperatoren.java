package kapitel4;

public class LogischeOperatoren {

	public static void main(String[] args) {
		
		int zahl = 2;
		
		int untereGrenze = 5;
		int obereGrenze = 10;
		
		boolean ergebnis;
		
		ergebnis = zahl > untereGrenze && zahl < obereGrenze;
		
		System.out.println(ergebnis);
		
		
		boolean wirdGeladen = true;
		int akkuLadung = 65;
		
		boolean updateDurchfuehren = ( wirdGeladen == true ) || ( akkuLadung > 50 ) ;
		
		System.out.println(updateDurchfuehren);

	}

}
