package kapitel4;

public class IFVerzweigung {

	public static void main(String[] args) {
		
		
		int akkuladung = 25;
		
		if(akkuladung < 20){
			System.out.println("Bitte Akku laden");
			System.out.println("hier kann ich noch mehr machen");
		}else if(akkuladung < 50){
			System.out.println("Geht noch, könnte aber besser sein!");
		}else{
			System.out.println("Noch jede Menge Akku vorhanden!");
		}
			
		
		System.out.println("Akkuladung beträgt " + akkuladung + "%.");
		

	}

}
