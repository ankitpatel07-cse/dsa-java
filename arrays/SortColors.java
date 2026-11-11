import java.util.Arrays;

// Problem: Sort an array that contains only 0s, 1s and 2s (Sort Colors).
public class SortColors {

    // Approach 1: Brute force (counting), two passes
    // Count how many 0s, 1s and 2s there are, then overwrite the array in order.
    // Time: O(n), Space: O(1)
    static void sortColorsBrute(int[] nums){
        int n = nums.length;
        int countZero = 0, countOne = 0, countTwo = 0;

        // Pass 1: count each value
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                countZero++;
            } else if(nums[i] == 1){
                countOne++;
            }else{
                countTwo++;
            }
        } 

        // Pass 2: overwrite the array in sorted order
        int idx = 0;

        while (countZero > 0){
            nums[idx]=0;
            idx++;
            countZero--;           
        }

        while(countOne > 0){
            nums[idx]=1;
            idx++;
            countOne--;
        }

        while(countTwo > 0){
            nums[idx]=2;
            idx++;
            countTwo--;
        }
    }

    // Approach 2: Optimal (Dutch National Flag), single pass, three pointers
    // low  -> next position where a 0 should go
    // mid  -> the element we are checking now
    // high -> next position where a 2 should go
    // The unsorted part is always from mid to high.
    // Time: O(n), Space: O(1)
    static void sortColorsOptimal(int[] nums){
        int low = 0, mid = 0, high = nums.length - 1;

        while(mid <= high){
            if(nums[mid]==0){
                swap(nums, mid, low);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums, mid, high);
                high--;             // do not move mid: the swapped-in value is not checked yet
            }
        }
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args){
        int[] a = {1, 1, 0, 2, 0, 1, 2, 0, 2};
        int[] b = {1, 1, 0, 2, 0, 1, 2, 0, 2};

        System.out.println("Before: " + Arrays.toString(a));
        
        sortColorsBrute(a);
        System.out.println("Brute: " + Arrays.toString(a)); // [0, 0, 0, 1, 1, 1, 2, 2, 2]

        sortColorsOptimal(b);
        System.out.println("Optimal: " + Arrays.toString(b)); // [0, 0, 0, 1, 1, 1, 2, 2, 2]
    }
    
}
