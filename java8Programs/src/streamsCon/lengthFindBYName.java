package streamsCon;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class lengthFindBYName {
	
	
	public static void main(String[] args) {
		
	
	
	
	List names= Arrays.asList("shyam","naven","Harish","qwertyuio");
	Stream<String> s= names.stream();
	s.filter(i-> i.length()>5).forEach(System.out::println);
	
	}
}


