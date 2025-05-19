//2.b. Develop a Java program to make a Performance Test on StringBuffer and StringBuilder for
//appending the string ‘AIET’ for 10000 times both in the StringBuffer and StringBuilder. Justify 
//your answer which one is better.
package lab1;

public class PerformanceTest{ 
	 public static void main(String[] args){ 
	 long startTime = System.currentTimeMillis(); 
	 StringBuffer sb = new StringBuffer("Java"); 
	 for (int i=0; i<10000; i++){ 
	 sb.append("AIET"); 
	 } 
	 System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + 
	"ms"); 
	 startTime = System.currentTimeMillis(); 
	 StringBuilder sb2 = new StringBuilder("Java"); 
	 for (int i=0; i<10000; i++){ 
	 sb2.append("AIET"); 
	 } 
	 System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + 
	"ms"); 
	 } 
	} 