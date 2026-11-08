package strings;

// Problem: Count uppercase letters, lowercase letters, digits and special characters.
// Approach: Check every character using ASCII ranges. Also keep the sum of the digits.
// Time: O(n), Space: O(1)
public class CountCharTypes {

    public static void main(String[] args){

         String s = "Hello @123 Abc!";

         int upper = 0, lower = 0, digits = 0, special = 0;
         int sum = 0;                  // Sum of all digit characters
         
         for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch>='A' && ch<='Z'){
                upper++;
            }else if(ch>='a' && ch<='z'){
                lower++;
            }else if(ch>='0' && ch<='9'){
                digits++;
                sum+= ch - '0';      // convert the digit charcter to its number
            }else if(ch!=' '){       // spaces are not counted as special characters
                special++;
            }
         }

         System.out.println("Uppercase: " + upper);
         System.out.println("Lowercase: " + lower);
         System.out.println("Digits: " + digits +";" + " Sum of digits: " + sum);
         System.out.println("Special characters: " + special);
         System.out.println("Length: " + s.length());
    }
}
