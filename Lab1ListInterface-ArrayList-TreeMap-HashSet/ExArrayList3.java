package lab1;
import java.util.*;
public class ExArrayList3 {
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
