package kapitel8;

import kapitel7.Bus;

public class BeispielRuntimeExceptions {

	public static void main(String[] args) {
		
		
		// ArithmeticException - Runtime Exception Beispiel
		int a = 5;
		int b = 1;
		
		double c = 0.0;
		
		try{
			System.out.println("Vor der Berechnung.");
			c = a / b;
			System.out.println("Nach der Berechnung.");
		} catch(Exception e){
			System.out.println("Nur Chuck Norris darf durch 0 teilen!");
			System.out.println(e.getMessage());
		}
			
		System.out.println("Ergebnis: " + c);
		
		Bus meinBus = null;
		
		int[] zahlen = {3, 2, 65, 24};
		
		try{
			c = a / b;
			zahlen[2] = 15;
			meinBus.freiePlaetze();
			zahlen[10] = 15;
			zahlen[1] = 15;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Ungültiger Index");
			System.out.println(e);
		}catch(ArithmeticException e){
			System.out.println("Nur Chuck Norris darf durch 0 teilen!");
			System.out.println(e.getMessage());
		}catch(NullPointerException e){
			System.out.println("Null-Referenz auf Objekt!");
		}catch(Exception e){
			System.out.println("Ganz generischer Fehler!");
			System.out.println(e);
		}
		
		for(int i : zahlen){
			System.out.print(i + " - ");
		}
		
		
	}

}
