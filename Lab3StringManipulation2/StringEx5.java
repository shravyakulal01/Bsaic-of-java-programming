package Stringop;

public class StringEx5 {
	public static String removeWhitespace(String str) {
        if (str == null) {
            return null;
        }
		// this replace all is used to removewhite spaces 
        return str.replaceAll("\\s+", "");
    }
    public static void main(String[] args) {
        String str = " Hello I am Shravya  ";
        System.out.println("Without whitespace: '" + removeWhitespace(str) + "'"); 
    }
}
