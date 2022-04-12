package comparator;

public class Student {

	int rollNo;
	String name;
	String city;

	public Student() {
		super();
	}

	public Student(int rollNo, String name, String city) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "[rollNo=" + rollNo + ", name=" + name + ", city=" + city + "]";
	}

}
