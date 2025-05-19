package Stringop;

public class StringEx1 {
	public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
    public static void main(String[] args) {
        String str1 = null;
        String str2 = "shravya";
        String str3 = "   ";
		//to check whether the string is empty or not  using ans userDefined function
        System.out.println("String 1 is null or empty: " + isNullOrEmpty(str1)); 
        System.out.println("String 2 is null or empty: " + isNullOrEmpty(str2)); 
        System.out.println("String 3 is null or empty: " + isNullOrEmpty(str3));   
    }
}
