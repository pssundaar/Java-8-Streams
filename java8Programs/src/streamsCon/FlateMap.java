package streamsCon;






import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.sun.jna.Function;

public class FlateMap {

	public static void main(String[] args) {
		List<user3> us= Arrays.asList(
				new user3("dinesh",22, Arrays.asList("5","4")),
				new user3("harsih",20, Arrays.asList("2","7")),
				new user3("shyam",20, Arrays.asList("1","3"))
				);
				
	us.stream()
			.map(user-> user.getPhno().stream())
								
					
			.flatMap(ph->ph.filter(num-> num.equals("3")))
			.forEach(System.out::println);
			
			
				
	}
}
 class user3{
	private String name;
	private int age=90;
	private List<String> phno;
	public user3(String name, int age, List<String> phno) {
		super();
		this.name = name;
		this.age = age;
		this.phno = phno;
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
	public List<String> getPhno() {
		return phno;
	}
	public void setPhno(List<String> phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		final int maxLen = 10;
		return "user3 [name=" + name + ", age=" + age + ", phno="
				+ (phno != null ? phno.subList(0, Math.min(phno.size(), maxLen)) : null) + "]";
	}
	
	
	
	
}