// Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index
package lab1;
import java.util.*;
public class DeleteNthElementArrayList {
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
