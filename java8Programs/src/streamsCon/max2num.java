package streamsCon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class max2num {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		HashMap<String , Integer> hs= new HashMap();
		  
		hs.put("shyam", 1);
		hs.put("q", 2);
		hs.put("w", 3);
		hs.put("e", 4);
		hs.put("r", 5);
		
		
		hs.forEach((key, value) -> System.out.println(key + " -> " + value));
	}
		
		
		/*
		
		Scanner s= new Scanner(System.in);
		//System.out.println("enter number");
		int a;
		 while ((a = s.nextInt()) != 0) {
			 System.out.println("enter number");
		 
		int n=s.nextInt();
		
		int num=n/2;
		
		for(int i=2;i<=num;i++){
			if(n%i==0){
				a++;
				break;
			}
			
		}
		if(a==0){
			System.out.println("prime");
		}
		else			System.out.println("not prime");
		
	}
		
		
	}*/
		/*int[] arr={1,56,7};
		int f=0;
		int s=0;
		
		for (int num : arr) {
			if(f<num){
				s=f;
				f=num;
			}
			else if(s<num){
				s=num;
			}
		}
		
		System.out.println(f);
		System.out.println(s);
	}*/
}
