package comparator;

import java.util.Comparator;

public class StudentCityComparator implements Comparator<Student> {

	@Override
	public int compare(Student sc1, Student sc2) {
		
		
		return sc1.city.compareTo(sc2.city);	
	}

}
