package streamsCon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class noneMatch{
			public static void main(String[] args) {
						
		//To check that there is no string of length 4
					
					  Stream<String> no = Stream.of("CSE", "C++",
                              "Jav", "DS");
					  System.out.println(no.filter(i-> i.length()>4).findAny().orElse("not found"));
					  no.noneMatch(i->i.length()>4);
	//To check that there is no element less than 0.
	  List<Integer> list = Arrays.asList(4, 0, 6, 2);
	  
	 System.out.println(list.stream().noneMatch(num -> num < 0));
					  			  
			}
		}