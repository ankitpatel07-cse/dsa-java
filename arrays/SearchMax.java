public class SearchMax {

    static int findMax(int [] a){

        int max=a[0];

        for(int i=0; i<a.length; i++){
           if(max<a[i]){
            max=a[i];
           }
        }
        return max;
    }
    public static void main(String[] args){

        int[] a = {4, 3, 5, 1, 2, 6};
        System.out.println("Maximum element is : " + findMax(a));
    }
    
}

