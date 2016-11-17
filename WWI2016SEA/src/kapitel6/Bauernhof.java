package kapitel6;

public class Bauernhof {

	public static void main(String[] args) {
		
		
		
		Tier meinTier = new Tier("irgend ein Tier", (float)12.3, (float)29.8);
		
		
		meinTier.atmen();
		meinTier.bewegen();
		meinTier.fresssen();
		// meinTier.bellen(); --> Bellen kann nur der Hund
		
		
		Hund bello = new Hund("Bello", (float)8.3, (float)30.0, "Bulldoge");
		
		bello.atmen();
		bello.bewegen();
		bello.fresssen();
		bello.bellen();
		
		Vogel tweety = new Vogel("Tweety", (float)3.1, (float)10.2, true);
		
		tweety.atmen();
		tweety.bewegen();
		tweety.fresssen();
		tweety.zwitschern();

	}

}
