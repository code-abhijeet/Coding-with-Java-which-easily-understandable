package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InputNoutput {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int n = in.nextInt();
        int arr[] = new int[n];
        
       /*  int [] arr = new int[5];
        arr[0] = 243;
        arr[1] = 2354;
        arr[2] = 545;
        arr[3] = 235;
        arr[4] = 67;

        // internally it stored like this [243, 2345,545,235,67]

        System.out.println(arr[0]);

        // its very time consuming task so 
        */

        // input using for loop
        System.out.println("Enter the Element of Array");
        for (int i =0; i<arr.length; i++){
            arr[i] = in.nextInt();

        }

        // Print using array in-built method "Arrays.toString(arr)"

        System.out.println("The entered elements are : " + Arrays.toString(arr));


        /*// output all elements of an array  
        for (int i=0; i < arr.length ; i++){
          System.out.print(arr[i]+" ");     
        }  */
        
        // input using for each loop

       /*  for(int num: arr){ // here it's a for ecah element which get every element from array

            // num represent  current element of array 
            System.out.print(num + " ");
        }
        */
        in.close();

        // it can esily modify the accessed element  of array i.e. arr[1]=987;
        // Java is Pass by value
    }
}
