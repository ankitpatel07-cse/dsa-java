public class SecondMinimum {

        static int findSecondMinimum(int[] a){

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=0; i<a.length; i++){
            if(a[i]<smallest){
                secondSmallest=smallest;
                smallest=a[i];
            }
            else if(a[i]>secondSmallest && a[i]!=smallest){
                secondSmallest=a[i];
            }
        }
        return secondSmallest;
    }
    public static void main(String[] args){

      //  int[] a = {6, 8, 2, 4, 3, 1, 5, 7};

         int[] a = {5, 5, 5};
      
     //  int[] a = {5, -2147483648};

        System.out.println("Second minimum element is " + findSecondMinimum(a));
    }
    
}