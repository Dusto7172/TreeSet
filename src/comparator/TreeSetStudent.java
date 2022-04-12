package comparator;

import java.util.TreeSet;

public class TreeSetStudent {
	public static void main(String[] args) {

		StudentRollNoComparator stdRollNo = new StudentRollNoComparator();
		
		TreeSet treeset = new TreeSet(stdRollNo);

		Student s1 = new Student(10, "Raj", "Pune");
		Student s2 = new Student(12, "Dev", "Mumbai");
		Student s3 = new Student(11, "Bob", "Thane");

		treeset.add(s1);
		treeset.add(s2);
		treeset.add(s3);

		System.out.println("Sorting by Roll No: " + treeset);

		StudentNameComparator stdName = new StudentNameComparator();

		TreeSet treeset1 = new TreeSet(stdName);

		treeset1.add(s1);
		treeset1.add(s2);
		treeset1.add(s3);

		System.out.println("Sorting by Name: " + treeset1);

		StudentCityComparator stdCity = new StudentCityComparator();

		TreeSet treeset2 = new TreeSet(stdCity);

		treeset2.add(s1);
		treeset2.add(s2);
		treeset2.add(s3);

		System.out.println("Sorting by City: " + treeset2);

	}

}
