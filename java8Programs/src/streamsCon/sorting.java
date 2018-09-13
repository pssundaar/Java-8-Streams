package streamsCon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sorting {
	private void sortUsingJava7(List<String> names){
		 //sort using java 7
		 Collections.sort(names, new Comparator<String>() {
		 @Override
		 public int compare(String s1, String s2) {
		 return s1.compareTo(s2);
		 }
		 });
		 }

	private void sortUsingJava8(List<String> names){
		 // sort using java 8
		 Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
		 }
	public static void main(String args[]){
		 List<String> names1 = new ArrayList<String>();
		 names1.add("d");
		 names1.add("g ");
		 names1.add("c ");
		 names1.add("f");
		 names1.add("b ");
		 names1.add("e ");
		 names1.add("a ");
		 Collections.sort(names1);
		 System.out.println("-----------------------------------");
		 System.out.println(names1);
		 System.out.println("-----------------------------------");
		
		 List<String> names2 = new ArrayList<String>();
		 names2.add("d ");
		 names2.add("g ");
		 names2.add("c ");
		 names2.add("f ");
		 names2.add("b ");
		 names2.add("e ");
		 names2.add("a ");
		 
		 
		 sorting tester= new sorting();
		 System.out.println("Sort using Java 7 syntax: ");
		 tester.sortUsingJava7(names1);
		 System.out.println(names1);

		 System.out.println("Sort using Java 8 syntax: ");
		 tester.sortUsingJava8(names2);
		 System.out.println(names2);

	}
}
