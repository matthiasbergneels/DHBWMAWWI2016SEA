package kapitel5;

public class CallBy {

	public static void main(String[] args) {
		
		
		// Call by value
		
		int a = 5;
		int b;
		
		// call by value --> b enthält den Wert von a
		b = a;
		
		a = 16; // b bleibt 5!
		
		
		// Call by Referenz
		Auto meinAuto = new Auto((byte)4, 230, "rot", true);
		
		meinAuto.hatBeule();
		
		Auto verliehenesAuto;
		
		verliehenesAuto = meinAuto; // übergibt referenz von meinAuto zu verliehenesAuto
		
		verliehenesAuto.dranTreten();
		
		verliehenesAuto = null;
		
		meinAuto.hatBeule();
		

	}

}
