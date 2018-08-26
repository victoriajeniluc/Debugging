/**
 * TODO:
 * 1. trim leading and trailing whitespace rom above string
 * 2. convert all the characters of the trimmed string to upper case
 * 3. print the character value at index 2 of upper case String
 * @author Udayan Khattry
 */

public class StringTest {
    public static void main(String[] args) {
        String str = "   \nCore Java   \t";
       /* String trimmedStr = str.trim(); // Core Java
        String upperCaseStr = trimmedStr.toUpperCase(); // CORE JAVA
        char ch1 = upperCaseStr.charAt(2);
        System.out.println("ch1: " + ch1);
        */

        char ch2 = str.trim().toUpperCase().charAt(2); // does the same thing as line 12 - 16
        System.out.println(ch2);
    }
}
