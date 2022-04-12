package comparable;

public class StudentSortByName implements Comparable<StudentSortByName> {

	int rollNo;
	String name;
	String city;

	public StudentSortByName() {
		super();
	}

	public StudentSortByName(int rollNo, String name, String city) {
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
	public int compareTo(StudentSortByName o) {

		return o.name.compareTo(this.name);
	}

}
