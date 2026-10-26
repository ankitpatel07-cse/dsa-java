// Problem: Check if an array is sorted (ascending order).
// Approach: Compare each element with the next one.
// Time:O(n), Space:O(1)
public class CheckIfSorted{
    static boolean isSorted(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    } 
    public static void main(String[] args){
       int[] sortedArr = {2, 4, 6, 8, 10};
       int[] unsortedArr = {2, 4, 66, 8, 10};
       
       System.out.println(isSorted(sortedArr)); //  true
       System.out.println(isSorted(unsortedArr)); // false
    }
}