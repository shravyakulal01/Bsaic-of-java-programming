// Write a Java program to insert the specified element at the end of a linked list.( using l_listobj.offerLast("Pink"))
package lab1;
import java.util.*;
public class InsertEndLinkedList {
	public static void main(String[] args) {
		LinkedList<String> ls = new LinkedList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		System.out.println(ls);
		ls.addLast("pink");
		//add element at the last
		System.out.println(ls);
	
	}
}
