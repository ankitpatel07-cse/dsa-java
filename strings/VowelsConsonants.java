package strings;
// Problem: Count vowels and consonants in a string.
// Approach: Convert each character to lowercase, ignore non-letters, then check whether the letter is a vowel.
// Time: O(n), Space: O(1) 
public class VowelsConsonants {

    public static void main(String[] args){
        String s = "Hello World";

        int vowels = 0, consonants = 0;

        for(int i=0; i<s.length(); i++){
            char ch = Character.toLowerCase(s.charAt(i));

            if(ch>='a' && ch<='z'){         // Only letters (spaces, digits are ignored).
                if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }     
}