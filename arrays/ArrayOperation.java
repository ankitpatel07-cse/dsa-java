
public class ArrayOperation{
    
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};

        //-->TRAVERSAL<---

        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }

    //   for(int no:arr){
    //     System.out.print(no+" ");
    //   }

       //--->INSERTION<---

    //    int indexpos=2;
    //    int element = 100;
    //    int[] newArry = new int[arr.length+1];

    //    for(int i=0; i<indexpos; i++){
    //         newArry[i]=arr[i];
    //    }

    //    newArry[indexpos]=element;

    //    for(int i=indexpos; i<arr.length; i++){
    //         newArry[i+1]=arr[i];
    //    }

    //    for(int no:newArry){
    //     System.out.print(no+" ");
    //    }

         //--->DELETION<---
        
         int indexpos=2;
         int[] newArry = new int[arr.length-1];
         int j=0;
        for(int i=0; i<arr.length; i++){
            if(i==indexpos){
                continue;
            }
            newArry[j]=arr[i];
            j++;
        }
        for(int no:newArry){
            System.out.println(no+" ");
        }
    }

}
