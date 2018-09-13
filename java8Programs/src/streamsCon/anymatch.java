package streamsCon;

import java.util.stream.Stream;

public class anymatch{
			public static void main(String[] args) {
	//anyMatch() function to check whether any element in list having UpperCase at 1st index.
			
		Stream<String> stream = Stream.of("geeks", "fOr",
                "gEEKSQUIZ", "geeksforGeeks");

		
					boolean ans =stream.anyMatch(str -> Character.isUpperCase(str.charAt(1)));

					System.out.println(ans);	
		}
		}