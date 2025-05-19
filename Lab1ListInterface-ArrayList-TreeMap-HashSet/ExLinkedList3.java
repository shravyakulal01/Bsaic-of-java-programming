package lab1;
import java.util.*;
public class ExLinkedList3 {
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
