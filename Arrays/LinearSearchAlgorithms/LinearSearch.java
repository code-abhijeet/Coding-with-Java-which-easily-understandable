package Arrays.LinearSearchAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int arr [] = {1, 232 ,12, 13, 23 , 134, 435, 546 };
        System.out.println(Arrays.toString(arr));
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number you want to search for ");
        int num = in.nextInt();
        int ans=  search(arr,num);
        if  (ans != -1){
            System.out.println( "Element is present at index "+ans);
        }else{
            System.out.println( "Element is not present");
        }
        

        in.close();


    }
    static int search(int  arr[], int x)
    {

        if(arr.length==0)
        {
            return -1;
        }

        for(int index =0; index<arr.length ; index++)
        {
            int element = arr[index];
            if (element == x){
                return index;
            }
        }
        return -1;
}
}
