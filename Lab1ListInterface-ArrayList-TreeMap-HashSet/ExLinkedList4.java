package lab1;
import java.util.*;
public class ExLinkedList4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ls = new LinkedList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		ls.add("Blue");
		//using for each loop for iteration
		for(int i=0;i<ls.size();i++) {
			System.out.println("index: "+i+" value:"+ls.get(i));
		}
	}
}
