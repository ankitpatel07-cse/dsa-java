package strings;

// Problem: Print every character of a string with its index, and print the length
// Approach: Loop for index 0 to length - 1 and use charAt(i)
// Time: O(n), Space: O(1)
public class CharIndexLength {

    public static void main(String[] args){
        String s = "Hello";

        for(int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i) + " : " + i);
        }

        System.out.println("Length: " + s.length());
        System.out.println("String: " + s);
    }  
}
