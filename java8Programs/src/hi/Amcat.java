package hi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Amcat {
   

    // function to find the smallest number
    static long smallest(long n)
    {
    	int num=(int) n;
              // initialize frequency of each digit to Zero
              int[] freq = new int[10];
    
              // count frequency of each digit in the number
              while (num > 0)
              {
                              int d = num % 10; 
                              freq[d]++;
                              num = num / 10; 
              }
    
              // Set the LEFTMOST digit to minimum expect 0
              long result = 0;
              for (int i = 1 ; i <= 9 ; i++)
              {
                              if (freq[i] != 0)
                              {
                                              result = i;
                                              freq[i]--;
                                              break;
                              }
              }
    
              // arrange all remaining digits
              // in ascending order
              for (int i = 0 ; i <= 9 ; i++)
                              while (freq[i]-- != 0)
                                              result = result * 10;
              
              
              return result;
    }
    
    // Driver Program
    public  static void main(String args[])
    {
              int num = 918;
              System.out.println(smallest(num));
    }
}


