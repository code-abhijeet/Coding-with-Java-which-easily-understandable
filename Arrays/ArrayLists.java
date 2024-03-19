package Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax:
        ArrayList<Integer> list = new ArrayList<>(10);

       // list.add(10);
       // list.add(20);

       // list.set(1, 50);   //Updates

        // to get an input
        for(int i=0; i<10; i++){
            list.add(in.nextInt());
        }
        // Size is fixed internally
        // we can add more than defined  capacity using .add() method, it will automatically  increase the size of arraylist
        System.out.println(list); 
        
        in.close();
    }
}
