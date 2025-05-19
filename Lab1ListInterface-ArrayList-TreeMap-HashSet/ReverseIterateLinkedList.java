//Write a Java program to iterate a linked list in reverse order (using objlist.descendingIterator()) 
package lab1;
import java.util.*;
public class ReverseIterateLinkedList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>	ls = new LinkedList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		//Accessing all the elements from the previous order
		ListIterator<String> listIterator = ls.listIterator(ls.size());
       while (listIterator.hasPrevious()) {
           System.out.println(listIterator.previous());
       }
		
	}
}
