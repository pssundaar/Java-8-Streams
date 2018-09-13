package streamsCon;



import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import com.sun.jna.Function;

public class MapToInt {
	public static boolean isNotSame(String s){
		return !s.equals("shyam");
	}
	public static void main(String[] args) {
		
	// here we know the names dono the ages
		List<String> l= Arrays.asList("shyam","dinesh","naveen","harish","Kranthi");  System.out.println("1--------------------------------------------------");
			
		
		List<user2> ulist=l.stream()
							.filter(MapToInt::isNotSame)
							.map(user2::new)// converting one type to another
								.collect(Collectors.toList());
		ulist.forEach(System.out::println);
		//   map to unt ------------------------------------------------
	int sum=	ulist.stream()
		.mapToInt(user2-> user2.getAge())
		.sum();
		System.out.println(sum);
		

}
}
 class user2{
	private String name;
	private int age=90;
	public user2(String name) {
		super();
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "user2 [name=" + name + ", age=" + age + "]";
	}
	
	
}