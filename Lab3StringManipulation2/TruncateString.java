// Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()
package Stringop;

public class TruncateString {
	public static String truncate(String str, int maxLength) {
        if (str == null) {
            return null;
        }
        if (str.length() <= maxLength) {
            return str;
        }
		// this is used to truncate the string  
        else {
            return str.substring(0, maxLength) + "...";
        }
    }

    public static void main(String[] args) {
        String str= "hello i am Shravya Kulal";
        int maxLength = 10;
        System.out.println("Original: " +str);
        System.out.println("Truncated to " + maxLength + ": " + truncate(str, maxLength) ); 
    }
}
