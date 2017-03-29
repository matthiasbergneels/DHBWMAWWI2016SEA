package kapitel9;

import java.util.Comparator;

public class StudentenSortierungNachNachnameVornameMatrikelnummer 
	implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		
		if(!student1.getNachname().equals(student2.getNachname())){
			return student1.getNachname().compareTo(student2.getNachname());
		}
		
		if(!student1.getVorname().equals(student2.getVorname())){
			return student1.getVorname().compareTo(student2.getVorname());
		}
		
		return student1.getMatrikelnummer() - student2.getMatrikelnummer();
	}

}
