package streamsCon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class conc {
	public static void main(String[] args) {
		int num1=1;
		int m=3;
		int num2 =(m*m)+m;
		List list = new ArrayList<>();
		for(int sh=1;sh<=m;sh++){
			for(int j=m;j>=sh;j--)
			{
				System.out.print(num1+" ");
				System.out.print(" ");
				num1++;
						}
			for(int y=m;y>=sh;y--){
				list.add(num2);
				num2--;
				}	
			Collections.sort(list);
			for(int y=m;y>=sh;y--){
					System.out.print(list.get(0)+" ");
					System.out.print(" ");
					list.remove(0);
								}	
			System.out.println("");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		HashMap<Character, Integer> cst= new  HashMap<Character, Integer>();
		
		{
			char c= s.charAt(i);
			if(cst.get(c)!=null){
				cst.put(c, cst.get(c)+1);
			}
			else{
			cst.put(c, 1);
			}
		}
		System.out.println(cst);
		
		
		
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.println(sin);
		HashMap<String,Integer> hm= new HashMap<String, Integer>();
		for (String temp : sin) {
			if(hm.get(temp)!=null){
				hm.put(temp, hm.get(temp)+1);
			}
			else{
				hm.put(temp,1);
			}
			
		}
		
		System.out.println(hm);
		*/
	}

}
