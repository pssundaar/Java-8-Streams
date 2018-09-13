package hi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class amc {
	public static int abc(int[] arr){
		//int[] arr={1,2,3,4,4,3,2,3,4,4,4,4,4,3,3,3,3,5,5,5,5,1,1,1,9,9};
		
		
		List l= new ArrayList<>();
		
		for(int i=0;i<arr.length;i++){
			l.add(arr[i]);
		}
		Object lt= l.stream().distinct().collect(Collectors.toList());
		System.out.println(lt);
		int i=0;
		for(int j=0;j<((List) lt).size();j++){
			int mn=i;
			int ans=(int) ((List) lt).get(j);
			i=ans+mn;
		}
	System.out.println(i);	
	return i;
	}
	
	
	public static int bcd(){
		String[] arr={"NYYY","YYYY","YYNY","YNNY","YYYY","YYYY"};
		int count =0;
		for(int i=0;i<arr.length;i++){
		if(arr[i].equals("YYYY")){
			count++;
		}
		}
		System.out.println(count);
		
		return count;
	}
	public static void inc(){
		//char c='a';
		
		for(int i = 1; i < 5; i++)
		{
			if(i==5){
				i=1;
				
				
			}
		  
		}
		
	}
	
	
	public static void main(String[] args) {
		int[] arr={1,2,3,4,4,3,2,3,4,4,4,4,4,3,3,3,3,5,5,5,5,1,1,1,9,9};
		amc.abc(arr);
		amc.bcd();
		amc.inc();
	}
	
}
