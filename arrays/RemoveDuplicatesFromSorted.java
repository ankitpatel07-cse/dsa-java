import java.util.*;

// Problem : Remove duplicates from a sorted array in place and return the new length.

public class RemoveDuplicatesFromSorted{

    // Approach 1 : Brute force (use a temp array to store unique elements).
    // Time : O(n), Space : O(n).

    static int removeDuplicateBrute(int[] ar){
        if(ar.length==0){
            return 0;
        }

        int[] temp = new int[ar.length];
        int rd = 0;  // index of the last unique element in temp
        temp[rd] = ar[0];

        for(int i=1; i<ar.length; i++){
            if(temp[rd] != ar[i]){
                rd++;
                temp[rd]=ar[i];
            }
        }
        
        for(int i=0; i<=rd; i++){
            ar[i]=temp[i];
        }
        return rd+1; // count of unique elements
    }

    // Approach 2 : Optimized (two pointers, in place).
    // Time : O(n), Space : O(1). 

    static int removeDuplicate(int[] ar){
        if(ar.length==0){
            return 0;
        }
        int rd = 0;  // index of the last unique element in ar
        for(int i=1; i<ar.length; i++){
            if(ar[rd] != ar[i]){  
                rd++;
                ar[rd]=ar[i];
            }
        }
        return rd+1; // count of unique elements
    }

    public static void main(String[] args){
        int[] a = {2, 2, 3, 3, 4, 6, 6};
        int len1 = removeDuplicateBrute(a);
        System.out.println("Brute force length : " + len1); // 4
        System.out.println(Arrays.toString(Arrays.copyOf(a, len1))); // [2, 3, 4, 6]

        int[] b = {2, 2, 3, 3, 4, 6, 6};
        int len2 = removeDuplicate(b);
        System.out.println("Optimized length : " + len2); // 4
        System.out.println(Arrays.toString(Arrays.copyOf(b, len2))); // [2, 3, 4, 6]
    }
}
