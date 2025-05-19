package Stringop;

public class StringEx8 {
	 public static boolean isNullOrEmpty(String str) {
		 // this is used to  trim the string
	        return str == null || str.trim().isEmpty();
	    }
	  public static boolean isNumeric(String str) {
	        if (isNullOrEmpty(str)) {
	            return false;
	        }
			// converts it to numeric values 
	        for (int i = 0; i < str.length(); i++) {
	            if (!Character.isDigit(str.charAt(i))) {
	                return false;
	            }
	        }
	        return true;
	    }
	    public static void main(String[] args) {
	        String str1 = "7666";
	      String str2 ="Shravya";
	        System.out.println(str1 + "' is numeric: " + isNumeric(str1)); 
	        System.out.println(str2 + "' is numeric: " + isNumeric(str2)); 
	    }
}
