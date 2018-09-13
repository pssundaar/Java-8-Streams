package streamsCon;

import java.util.Arrays;
import java.util.List;

public class findbyname {
	
	
	public static void main(String[] args) {
		
	List<String> B = Arrays.asList("Melisandre","Sansa1","Jon","Daenerys","Joffery");
	
	
	System.out.println(
						B.stream()
								.filter(i-> {
													if(i.equals("Sansa1"))
															{
														
														return true;
														
															}
													return false;
															}
										)
					.findAny()
						.orElse(null));
	}
}