package comparable;

import java.util.TreeSet;

public class TreeSetSortByCity {
	public static void main(String[] args) {

		TreeSet t3 = new TreeSet();

		StudentSortByCity stdC1 = new StudentSortByCity(10, "Raj", "Pune");
		StudentSortByCity stdC2 = new StudentSortByCity(12, "Dev", "Mumbai");
		StudentSortByCity stdC3 = new StudentSortByCity(11, "Bob", "Thane");

		t3.add(stdC1);
		t3.add(stdC2);
		t3.add(stdC3);

		System.out.println("Sorting By City: " + t3);
	}

}
