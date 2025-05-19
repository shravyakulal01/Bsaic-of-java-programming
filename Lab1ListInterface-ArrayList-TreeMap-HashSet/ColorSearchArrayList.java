//Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not
package lab1;
import java.util.*;
public class ColorSearchArrayList {
public static void main(String[] args) {
		List<String> ls = new ArrayList<>();
		ls.add("Orange");
		ls.add("geen");
		ls.add("pink");
		ls.add("red");
		System.out.println(ls);
		//Contanins Red or not
		if(ls.contains("red")) {
			System.out.println("Contains Red");
		}else {
			System.out.println("Does Not contain Red");
		}
	}
}
