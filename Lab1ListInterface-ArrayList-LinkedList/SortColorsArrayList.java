//Write a java program for getting different colors through ArrayList interface and sort them using Collections.sort( ArrayListObj)
package lab1;
import java.util.*;
public class SortColorsArrayList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("bluee");
		ls.add("red");
		//before sorting
		System.out.println("Before sorting:");
		System.out.println(ls);
		//inbuilt function to sort
		Collections.sort(ls);
		System.out.println("After sorting:");
		System.out.println(ls);
	}
}
