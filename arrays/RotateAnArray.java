// Problem: Rotate an array by k positions (rotate: left, rotateRight: right).
// Approach (brute force): Rotate by one position, repeat k times.
// Time: O(n*k), Space: O(1).
public class RotateAnArray {

    static void rotateONE(int[] a){
        int temp=a[0];
        for(int i=1; i<a.length; i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;
    }

    static void rotate(int[] a, int k){

        if(a.length == 0) return;

        k = k % a.length;
        if(k<0){
            k = k + a.length;
        }

        for(int i=1; i<=k; i++){
            rotateONE(a);
        }
    }

    static void rotateRight( int[] a, int k){
        rotate(a, -k);
    }

    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5};
        rotate(a, 2);
        System.out.print("Left Rotation: ");
        for(int x:a){
            System.out.print(x + " ");
        }
        System.out.println();

        int[] b = {1, 2, 3, 4, 5};
        rotateRight(b, 2);
        System.out.print("Right Rotation: ");
        for(int x:b){
            System.out.print(x + " ");
        }

    }
}
