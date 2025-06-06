//Write a Java Program for Capitalizing the first letter of each word. using user defined function capitalizeWords()
package Stringop;

public class CapitalizeWords {
	public static String capitalizeWords(String str) {
        String result = "";
        boolean firstletter = true;
        // this is used to citalize the first letter of each word
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                result += c;
                firstletter = true;
            } 
            else if (firstletter) {
            	// here the first letter is converted to capital
                result += Character.toUpperCase(c);
                firstletter = false;
            } 
            else {
                result += c;
            }
        }
        return result;
    }
	public static void main(String[]args) {
		String str = "Hi i Shravya Kulal here ";
	System.out.println( str + ": " + capitalizeWords(str));
}
}
