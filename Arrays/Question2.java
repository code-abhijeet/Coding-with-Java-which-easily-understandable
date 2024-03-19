package Arrays;

public class Question2 {

    // Returning maax value of Array

    public static void main(String[] args) {
        int arr[] = {1,2,2,4,23,443,2324};
        System.out.println("Max Value is : " + max(arr));


    }
    static int max (int [] arr){

        int  max_value=arr[0];
        for (int i=1; i<arr.length; i++){
            if(arr[i]>max_value){
                max_value=arr[i];
            }
        }
        return max_value;
    }
    
}
