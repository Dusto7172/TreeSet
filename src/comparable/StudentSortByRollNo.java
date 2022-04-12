package comparable;

public class StudentSortByRollNo implements Comparable<StudentSortByRollNo> {

	int rollNo;
	String name;
	String city;

	public StudentSortByRollNo() {
		super();
	}

	public StudentSortByRollNo(int rollNo, String name, String city) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "[rollNo=" + rollNo + ", name=" + name + ", city=" + city + "]";
	}

	@Override
	public int compareTo(StudentSortByRollNo s1) {
		if (s1.rollNo == this.rollNo)
			return 0;
		else if (s1.rollNo > this.rollNo)
			return -1;
		else
			return 1;
	}

}
