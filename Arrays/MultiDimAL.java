package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimAL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();


        // Initialization
        for(int i=0; i<3; i++){
            arrList.add(new ArrayList<>());
        }

        for(int i =0; i<3; i++){
            for(int j=0; j<3; j++){
                arrList.get(i).add(in.nextInt());
            }
        }
        System.out.println(arrList);
        System.out.println(arrList.get(1));
        in.close();
    }
}
