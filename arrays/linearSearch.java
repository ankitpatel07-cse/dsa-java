public class linearSearch {
    
    static void linearsearch(int arr[], int element){

        boolean  found = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==element){
                System.out.println("Element found at "+ (i+1) +"th position.");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not found");
        }
    }
    public static void main(String[] args){

        int[] arr = {50, 30, 40, 70, 20, 80};

        int element = 70;

        linearsearch(arr, element);

    }
    
}
