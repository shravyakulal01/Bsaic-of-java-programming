package lab1;
import java.util.*;
public class ExArrayList5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("green");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		// provide element as data type
		String Str="green";
		System.out.println(ls);
		//to remove an element that is 3 at the specified position
		System.out.println("Removing the nth Element:"+ls.remove(Str));
		System.out.println(ls);
	}
}
