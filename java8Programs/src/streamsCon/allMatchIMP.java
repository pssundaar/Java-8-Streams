package streamsCon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class allMatchIMP{
	
// allMatch() function to check whether all elements are divisible by 3.
	public static void main(String[] args) {
	List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);
   boolean b= list.stream().allMatch(i->i%3==0);
   System.out.println(b);
   
   
 //allMatch() function to check whether all strings have UpperCase character at 1st index.
	 
	 Stream<String> stream = Stream.of("Geeks", "For", 
           "GeeksQuiz", "GeeksforGeeks");
	 
	 boolean tf=stream.allMatch(i-> Character.isUpperCase(i.charAt(0)));
System.out.println(tf);
	}
	
}