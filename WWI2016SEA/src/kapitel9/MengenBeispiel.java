package kapitel9;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MengenBeispiel {

	public static void main(String[] args) {
		
		
		Set<String> meineMenge = new TreeSet<String>();
		
		meineMenge.add("Hans");
		meineMenge.add("Gabi");
		meineMenge.add("Adam");
		meineMenge.add("Tim");
		
		Iterator<String> i = meineMenge.iterator();
		while(i.hasNext()){
			String s = i.next();
			System.out.println(s);
		}

	}

}
