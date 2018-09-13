package streamsCon;

import java.util.stream.Stream;

public class toUpperCase{
	
	//Stream<String> streamCountries = Stream.of("Germany", "England","China", "Denmark", "Brazil");
	public static void main(String[] args) {
		
	Stream<String> stream = Stream.of("Germany", "England", "China",
            "Denmark", "Brazil");
	
	
	
    stream.filter(s -> s.startsWith("D"))
                .peek(s -> System.out.println("Filtered value: " + s))
            .map(String::toUpperCase)
            .peek(s -> System.out.println("Uppercase value :" + s)).count();
	}
 }