package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
        
        // taking input for 2DArray 

        int [][] arr2d =  new int[3][3];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements of array");

        for(int row=0; row<arr2d.length; row++){
            for(int col=0; col<arr2d[row].length; col++){
                arr2d[row][col] = in.nextInt();
            }
        }
            // Array  with no fixed col can be printed and take input from above specified size

        // Printing the array
        /*
         Normal MEthod

        for(int row=0; row<arr2d.length; row++){
            for(int col=0; col<arr2d[row].length; col++){
                System.out.print(arr2n[row][col]+" ");
            }
        } */

        /*
         for(int row=0; row,arr2d.lenth; row++){
            System.out.println(Arrays.toString(arr2d[row]));
         }
         */

         // for each loop 
         for(int [] a: arr2d){
            System.out.println(Arrays.toString(a));
         }
      in.close();
    }
}
