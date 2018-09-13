package streamsCon;

import java.util.Random;

public class randomNumberGenerator{

	
	public static void main(String[] args) {
	int f=2;
	Random n= new Random();
	n.ints(0,99)
	.limit(5)
	.forEach(System.out::println);
	
	}
	}