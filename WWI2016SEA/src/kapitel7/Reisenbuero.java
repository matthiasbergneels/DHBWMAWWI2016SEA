package kapitel7;

public class Reisenbuero {

	public static void main(String[] args) {
		
		Oper oper1 = new Oper(400);
		Bus bus1 = new Bus(10);
		
		Buchbar buchbareObjekte[] = new Buchbar[2];
		
		buchbareObjekte[0] = oper1;
		buchbareObjekte[1] = bus1;
		
		System.out.println("Freie Plaetze: " + buchbareObjekte[0].freiePlaetze());
		buchbareObjekte[0].reservieren(4);
		System.out.println("Freie Plaetze: " + buchbareObjekte[0].freiePlaetze());
		
		System.out.println("Freie Plaetze: " + buchbareObjekte[1].freiePlaetze());
		buchbareObjekte[1].reservieren(10);
		System.out.println("Freie Plaetze: " + buchbareObjekte[1].freiePlaetze());
		
		

	}

}
