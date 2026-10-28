 // Problem : Move all zeros to the end, keeping the order of non-zero elements
import java.util.*;
public class MoveZeroes {
    // Approach : Brute Force (copy the non-zero element into a next array).
    // Time : O(n), Space : O(n).
    static void moveZeroesBrute(int[] arr){
        int[] temp = new int[arr.length];
        int idx = 0;
        for(int x : arr){
            if(x != 0){
                temp[idx]=x;
                idx++;
            }
        }
        for(int i=0; i<arr.length; i++){
            arr[i]=temp[i];
        }
    }

    // Approach 2: Two pointers, in place
    // Time : O(n), Space : O(1).

    static void moveZeroes(int[] arr){
        int size = arr.length;
        if(size==0 || size==1){
            return;
        }
        
        int nz=0, z=0;
        while(nz<size){
            if(arr[nz]!=0){
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz++;
                z++;
            } else{
                nz++;
            }
        }
    }
    public static void main(String[] args){
        int[] a = {0, 1, 0, 3, 12};
        moveZeroesBrute(a);
        System.out.println(Arrays.toString(a)); // [1, 3, 12, 0, 0]

        int[] b = {0, 1, 0, 3, 12};
        moveZeroes(b);
        System.out.println(Arrays.toString(b)); // [1, 3, 12, 0, 0] 
    }
}
