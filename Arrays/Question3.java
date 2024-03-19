package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {
    // Reverse an array

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = in.nextInt();
        int [] arr =  new int[n];

        for( int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println( "Original array is : "+ Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed Array is "+ Arrays.toString(arr));
        in.close();

    }
    static void reverse(int arr[]){
        int start =0;
        int end = arr.length-1;

        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int arr[], int  i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }
    
}
