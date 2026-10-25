public class SearchMin {

    static int findMin(int[] a){
        int min=a[0];
        for(int i=0; i<a.length; i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        
        int[] a = {4, 3, 5, 2, 1, 6};

        System.out.println("Minimum element is " + findMin(a));
    }
    
}
