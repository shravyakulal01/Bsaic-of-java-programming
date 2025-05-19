package Stringop;

public class StringEx3 {
	public static String reverseString(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder reverseStr = new StringBuilder(str);
		// an inbuilt function is used to reverse the whole string
        return reverseStr.reverse().toString();
    }

    public static void main(String[] args) {
        String str1 = "Hi I am Shravya";
        // an user defined function to reverse the string
        System.out.println("Reversed '" + str1 + "': " + reverseString(str1)); 
    }
}
