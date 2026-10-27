// Problem: Rotate an array by k positions (k>0: left, k<0: right).
// Approach (Optimal): Reverse first k, reverse the rest, then reverse the whole array.
// Time: O(n), Space: O(1).
public class RotateAnArrayOptimal {
   static void reverse(int[] a, int start, int end){
     while(start<end){
        int temp = a[start];
        a[start] = a[end];
        a[end]   = temp;
        start++;
        end--;
     } 
   }

   static void rotate(int[] a, int k){
        if(a.length == 0) return;

        k = k % a.length;
        if(k<0){
            k = k + a.length;
        }

        reverse(a, 0, k-1);
        reverse(a, k, a.length-1);
        reverse(a, 0, a.length-1);    
   }

   public static void main(String[] args){
       int[] a = {1, 2, 3, 4, 5};
       rotate(a, 2);   // Left by 2
       System.out.print("Array left Rotation: ");
       for(int x : a){
        System.out.print(x + " ");
       }
       System.out.println();

       int[] b = {1, 2, 3, 4, 5};
       rotate(b, -2);   // Right by 2
       System.out.print("Array Right Rotation: ");
       for(int x : b){
        System.out.print(x + " ");
       }   
   }
}