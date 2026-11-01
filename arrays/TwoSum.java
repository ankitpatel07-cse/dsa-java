import java.util.Arrays;
import java.util.HashMap;

// Problem: Two Sum
// Given an array and a target, find the indices of two elements whose sum equals the target.
// Return {-1, -1} if no such pair exists.
public class TwoSum {

    // Approach 1:Brute force (check every pair).
    // Time: O(n^2), Space: O(1).
    static int[] twoSumBrute(int[] arr, int target){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    // Approach 2:Two pointers (array must be SORTED).
    // If the sum is too big, move right pointer left; if two small, move left pointer right.
    // Time: O(n), Space: O(1).
    static int[] twoSumTwoPointers(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int sum = arr[left] + arr[right];

            if(sum==target){
                return new int[]{left, right};
            }else if(sum>target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{-1, -1};
    } 

    // Approach 3: HashMap (works on UNSORTED arrays too).
    // For each element, check if (target - element) was already seen.
    // Time: (n), Space: O(n).
    static int[] twoSumHashMap(int[] arr, int target){
        HashMap<Integer, Integer > seen = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int need = target - arr[i];
            if(seen.containsKey(need)){
                return new int[]{seen.get(need), i};
            }
            seen.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args){
        int[] arr = {2, 3, 4, 7, 11, 15};
        int target = 10;
        System.out.println("Brute Force : " + Arrays.toString(twoSumBrute(arr, target))); // [1, 3]
        System.out.println("Two Pointers : " + Arrays.toString(twoSumTwoPointers(arr, target))); // [1, 3]
        System.out.println("HasMap : " + Arrays.toString(twoSumHashMap(arr, target))); // [1, 3]

        System.out.println("Not Found : " + Arrays.toString(twoSumBrute(arr, 100))); // [-1, -1]
    }   
}
