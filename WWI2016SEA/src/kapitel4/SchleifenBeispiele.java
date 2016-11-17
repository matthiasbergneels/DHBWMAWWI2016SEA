package kapitel4;

public class SchleifenBeispiele {

	public static void main(String[] args) {
		
		
		boolean interessant = true;
		
		int kapitel = 1;
		
		while(interessant){
			System.out.println("Kapitel " + kapitel + " lernen");
			kapitel++;
			
			if(kapitel == 5){
				interessant = false;
			}
			
		}
		
		System.out.println("Jetzt wirds langweilig!");
		
		interessant = true;
		kapitel = 1;
		
		do{
			System.out.println("Kapitel " + kapitel + " lernen");
			kapitel++;
			
			if(kapitel == 5){
				interessant = false;
			}
		}while(interessant);
		
		System.out.println("Jetzt wirds langweilig!");

		
		
		int zaehler = 0;
		
		while(zaehler < 10){
			zaehler++;
			System.out.println(zaehler);
		}
		
		
		zaehler = 0;
		do{
			zaehler++;
			System.out.println(zaehler);
		}while(zaehler<10);
	
	
		for(int i = 1; i <= 10; i++){
			
			System.out.println(i);
			
		}
	
		
		
		
		String[] woerter = {"Hallo", "Klaus", "Muelleimer", "Garagentor", "Frittenbude", "Blub"};
		
		for(int i = 0; i < woerter.length; i++){
			if(woerter[i].equals("Klaus")){
				continue;
			}
			System.out.println("Index " + i + ": " + woerter[i]);
		}
		
		for(String wort : woerter){
			if(wort.equals("Frittenbude")){
				break;
			}
			System.out.println(wort);
		}
		
		
	
	}

	
}
