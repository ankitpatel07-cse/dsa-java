public class SecondLargest {

//     static int findSecondMaximum(int[] a){

//         int largest = Integer.MIN_VALUE;
//         int secondLargest = Integer.MIN_VALUE;

//         for(int i=0; i<a.length; i++){
//             if(a[i]>largest){
//                 secondLargest=largest;
//                 largest=a[i];
//             }
//             else if(a[i]>secondLargest && a[i]!=largest){
//                 secondLargest=a[i];
//             }
//         }
//         return secondLargest;
//     }
//     public static void main(String[] args){

//       //  int[] a = {6, 8, 2, 4, 3, 1, 5, 7};

//       // int[] a = {5, 5, 5};
      
//          int[] a = {5, -2147483648};

//         System.out.println("Second largest element is " + findSecondMaximum(a));
//     }
       
        static long findSecondMaximum(int[] a){

        long largest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;

        for(int i=0; i<a.length; i++){
            if(a[i]>largest){
                secondLargest=largest;
                largest=a[i];
            }
            else if(a[i]>secondLargest && a[i]!=largest){
                secondLargest=a[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args){

           int[] a = {5, 5, 5};
      
      //   int[] a = {5, -2147483648};

         long result = findSecondMaximum(a);

         if(result==Long.MIN_VALUE)
            System.out.println("Second Maximum element does not exist.");
        else
        System.out.println("Second largest element is " + result);
    }    
 }
