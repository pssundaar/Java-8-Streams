package streamsCon;

import java.util.stream.Stream;

public class FindByCharacterStartChar {
			
			
			public static void main(String[] args) {
				

	Stream<String> streamCountries = Stream.of("Germany", "England","China", "Denmark", "Brazil");
		
    	System.out.println(streamCountries.filter(s->s.startsWith("E")).findAny().orElse(null));
    	
			}}