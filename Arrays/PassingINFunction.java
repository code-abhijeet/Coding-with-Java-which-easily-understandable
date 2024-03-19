package Arrays;

import java.util.Arrays;

public class PassingINFunction {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,67,89};
        change(arr); // Muatbility
        System.out.println("After changing the array: "+ Arrays.toString(arr));
        
    }

    // Changing Array element from function 
    static void change(int[] arr){
       arr[1]=99;
    }
}
    // Strings are unmutable in java
    // And Arrays are mutable  in Java 
