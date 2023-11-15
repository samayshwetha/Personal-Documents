package PracticeAssignments;

import java.util.LinkedList;

public class PrintNameAndAgeSideBySide {

	public static void main(String[] args) {
		
	 LinkedList ls = new LinkedList();
	 ls.add("Shwetha");
	 ls.add(10);
	 ls.add("Naveen");
	 ls.add(35);
	 System.out.println("Name is : "+ls.get(0)+"\t"+"Age is : "+ls.get(1));
	 System.out.println("Name is : "+ls.get(2)+"\t"+"Age is: "+ls.get(3));
	 
	}

}
