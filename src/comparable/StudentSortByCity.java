package comparable;

public class StudentSortByCity implements Comparable<StudentSortByCity> {

	int rollNo;
	String name;
	String city;

	public StudentSortByCity() {
		super();
	}

	public StudentSortByCity(int rollNo, String name, String city) {
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
	public int compareTo(StudentSortByCity c) {

		return c.city.compareTo(this.city);
	}

}
