package strings;
// Problem: Remove all spaces from a string.
public class RemoveSpaces {

    // Approach 1: Built-in replace
    // Time: O(n), Space: O(n)
    static String removeSpacesBuiltIn(String s){
        return s.replace(" ", "");
    }
    
    // Approach 2: Manual loop, copy every character except a space.
    // Time: O(n), Space: O(n)
    static String removeSpacesManual(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        String s = "Hello World Java Programming";

        System.out.println("Original String: " + s);
        System.out.println("After Removing Spaces (replace): " + removeSpacesBuiltIn(s));
        System.out.println("After Removing Spaces (loop): " + removeSpacesManual(s));    
    }

    
}
