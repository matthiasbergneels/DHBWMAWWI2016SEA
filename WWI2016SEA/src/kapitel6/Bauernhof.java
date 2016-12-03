package kapitel6;

public class Bauernhof {

	public static void main(String[] args) {
		
		
		/* --> nicht mehr möglich, weil Klasse Tier abstrakt ist!
		Tier meinTier = new Tier("irgend ein Tier", (float)12.3, (float)29.8);
		
		
		meinTier.atmen();
		meinTier.bewegen();
		meinTier.fressen();
		// meinTier.bellen(); --> Bellen kann nur der Hund
		
		String beschreibungMeinTier = meinTier.toString();
		System.out.println(beschreibungMeinTier);
		*/
		
		Hund bello = new Hund("Bello", (float)8.3, (float)30.0, "Bulldoge");
		
		bello.atmen();
		bello.bewegen();
		bello.fressen();
		bello.bellen();
		
		System.out.println(bello.toString());
		
		
		// Narrowing Cast 
		Tier einTier = bello;
		
		einTier.atmen();
		einTier.bewegen();
		einTier.fressen();
		
		// widening Cast
		Hund neuerHund = (Hund)einTier;
		
		neuerHund.atmen();
		neuerHund.bewegen();
		neuerHund.fressen();
		neuerHund.bellen();
		
		
		Vogel tweety = new Vogel("Tweety", (float)3.1, (float)10.2, true);
		
		tweety.atmen();
		tweety.bewegen();
		tweety.fressen();
		tweety.zwitschern();
		
		System.out.println(tweety);
		
		
		
		Tier[] stall = new Tier[5];
		
		// jede Zuweisung nutzt einen impliziten Narrowing Cast
		stall[0] = bello;
		stall[1] = tweety;
		stall[2] = new Hund("Kalle", (float)67.7, (float)50.0, "Mischling");
		stall[3] = new Vogel("Pieps", (float)1.8, (float)12.0, true);
		stall[4] = new Vogel("Hihi", (float)7.9, (float)16.7, false);
		
		for(Tier stallTier : stall){
			// Polymorphie --> ohne den tatsächliche Typ der Objektinstanz zu kennen wird die spezifische
			// Implementierung der Methode ausgeführt
			stallTier.fressen();
			stallTier.atmen();
			
			if(stallTier instanceof Hund){
				Hund stallHund = (Hund)stallTier;
				stallHund.bellen();
			}
			
			
		}
		
		

	}

}
