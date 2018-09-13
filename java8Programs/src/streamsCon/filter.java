package streamsCon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class filter {

	   public static boolean isNotSame(String name){
		return !name.equals("shyam");
	              }
	public static void main(String[] args) {
		List<String> l= Arrays.asList("shyam","dinesh","naveen","harish","Kranthi");  System.out.println("1--------------------------------------------------");
		
		System.out.println("old style");
		for (String e : l) {
			if(!e.equals("shyam")){
				System.out.println(e);
			}
			
		}
		System.out.println("2------------------another way--------------------------------");System.out.println("new style java 8");
		
		l.stream()
		.filter(i-> !i.equals("naveen"))// true or false
		.forEach(System.out::println);
			
			
		System.out.println("3----another way---------------------");
		l.stream()
		.filter(i-> isNotSame(i))
		.forEach(System.out::println);
		System.out.println("4----another way---------------------");
		
	l.stream()
	.filter(filter::isNotSame)
	.forEach(System.out::println);
		//another way method reference
	
	
	
	
	// To perform print operation on each element of reversely sorted stream
	
	 List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
	 list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	 
	 
	 
	 
	 Stream<String> stream = Stream.of("GFG", "Geeks",
             "for", "GeeksforGeeks");

//Using forEach(Consumer action) to print
//Character at index 1 in reverse order
stream.sorted(Comparator.reverseOrder())
.flatMap(str -> Stream.of(str.charAt(1)))
.forEach(System.out::println);
		
}
}

