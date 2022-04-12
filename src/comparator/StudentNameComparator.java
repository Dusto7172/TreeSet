package comparator;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student sn1, Student sn2) {
		
		
		return sn1.name.compareTo(sn2.name);	
	}

}
