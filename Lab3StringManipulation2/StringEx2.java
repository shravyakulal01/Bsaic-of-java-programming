package Stringop;

public class StringEx2 {
	public static int countOccurrences(String mainString, String subString) {
        if (mainString == null || subString == null || subString.isEmpty()) {
            return 0;
        }
        int count = 0;
        int index = 0;
		//to count the occurance of the subSting inside the string 
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length(); 
        }
        return count;
    }
    public static void main(String[] args) {
        String mainStr = "Shravya kulal Shravya";
        String subStr = "Shravya";
        String subStr2 = "class";
        // calls an user defined function to count number of substring
        System.out.println("Occurrences of '" + subStr + "': " + countOccurrences(mainStr, subStr)); 
        System.out.println("Occurrences of '" + subStr2 + "': " + countOccurrences(mainStr, subStr2)); 
    }
}
