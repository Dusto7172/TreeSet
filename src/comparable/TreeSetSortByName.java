package comparable;

import java.util.TreeSet;

public class TreeSetSortByName {
	public static void main(String[] args) {

		TreeSet t2 = new TreeSet();

		StudentSortByName stdN1 = new StudentSortByName(10, "Raj", "Pune");
		StudentSortByName stdN2 = new StudentSortByName(12, "Dev", "Mumbai");
		StudentSortByName stdN3 = new StudentSortByName(11, "Bob", "Thane");

		t2.add(stdN1);
		t2.add(stdN2);
		t2.add(stdN3);

		System.out.println("Sorting By Name: " + t2);
	}

}
