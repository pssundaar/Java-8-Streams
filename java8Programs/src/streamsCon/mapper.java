package streamsCon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.sun.jna.Function;

public class mapper {
	public static boolean isNotSame(String s){
		return !s.equals("shyam");
	}
	public static void main(String[] args) {
		
	// here we know the names dono the ages
		List<String> l= Arrays.asList("shyam","dinesh","naveen","harish","Kranthi");  System.out.println("1--------------------------------------------------");
			
		
		l.stream()
		.filter(mapper::isNotSame)
		.map(user::new)// converting one type to another
			
		.forEach(System.out::println);

}
}
 class user{
	private String name;
	private int age=90;
	public user(String name) {
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
		return "user [name=" + name + ", age=" + age + "]";
	}
	
	
}