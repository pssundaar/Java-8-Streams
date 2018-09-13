package hi;

import java.math.BigInteger;
import java.util.Scanner;

public class PerfectPower  {
	public static void main(String[] args) throws Exception {
		System.out.println("1");
		 //BigInteger result = (new BigInteger("2")).pow((int) 10.241111111);
		//int result = (int)Math.pow(2, 1024);
		

		      // get two double numbers
		    //  double x = 2.0;
		      //double y = 56693;
		   
		      // print x raised by y and then y raised by x
		      //System.out.println("Math.pow(" + x + "," + y + ")=" + Math.pow(x, y));
		   //   System.out.println("Math.pow(" + y + "," + x + ")=" + Math.pow(y, x));
		     
	//	System.out.println(result);
		//System.out.println(Math.pow(2,27830457));
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int numrows =in.nextInt();
		for(int i =0; i < numrows;i++){
			int num= 1;
			System.out.format("%"+(numrows-i)*2+"s","");
			for(int j=0;j <= i;j++) {
				System.out.format("%4d",num);
				num= num* (i - j) / (j + 1);
			}
			System.out.println(); 
		}
    }

}