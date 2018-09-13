package streamsCon;

import java.util.stream.Stream;

public class IteratorStream{
	public static void main(String[] args) {
		
	/*	Stream.iterate(2L, n->n*n)
		.limit(6)
		.forEach(System.out::println);
		*/
		Stream.iterate(1, n->n+1)
		.limit(6)
		.forEach(System.out::println);
	}
}