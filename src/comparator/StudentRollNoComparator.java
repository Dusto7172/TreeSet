package comparator;

import java.util.Comparator;

public class StudentRollNoComparator implements Comparator<Student> {

	@Override
	public int compare(Student sr1, Student sr2) {

		if (sr1.rollNo == sr2.rollNo)
			return 0;
		else if (sr1.rollNo > sr2.rollNo)
			return 1;
		else
			return -1;
	}

}
