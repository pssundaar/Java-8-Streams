package streamsCon;
import java.util.*;
import java.util.stream.IntStream;
 
public class StringRoller {
 
    
    	public static void main(String[] args)
    	{
    		/*String s= " i am ama learning java java";
    		String sin[]=s.split(s);
    		
    		HashMap<String,Integer> hm= new HashMap<String, Integer>();
    		for (String temp : sin) {
				if(hm.get(temp)!=null){
					hm.put(temp, hm.get(temp)+1);
				}
				else{
					hm.put(temp,1);
				}
				
			}
    		
    		System.out.println(hm);*/
    		
    		
    	/*String[] s={"ssshhhyyyaaammm","ssuunnddaarr"};
    	Arrays.stream(s).distinct().forEach( System.out::println);*/
    	char c = 'z';
    	c = (char) (((c - 'a' + 5) % 26) + 'a');
    	System.out.println(c);	
    	}
    }
