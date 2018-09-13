package streamsCon;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class groupby{
	public static void main(String[] args) {
		
		
		List<String> l= Arrays.asList("shyam","dinesh","naveen","harish","shyam");  
		System.out.println(l.stream()
		  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		
	}
	}