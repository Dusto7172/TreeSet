package comparable;

import java.util.TreeSet;

public class TreeSetSortByRollNo {
	public static void main(String[] args) {
		
		TreeSet t1 = new TreeSet();
		
		StudentSortByRollNo std1 = new StudentSortByRollNo(10, "Raj", "Pune");
		StudentSortByRollNo std2 = new StudentSortByRollNo(12, "Dev", "Mumbai");
		StudentSortByRollNo std3 = new StudentSortByRollNo(11, "Bob", "Thane");

		t1.add(std1);
		t1.add(std2);
		t1.add(std3);
		
		System.out.println("Sorting By Roll NO: " + t1);

	}

}
