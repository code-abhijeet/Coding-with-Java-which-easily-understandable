package Arrays;

public class Dedclartion {

    public static void main(String[] args) {
        int [] arr ; // Declaration of array without specifying the size.
        // its happen at compile time 

        arr = new int[5];  // Allocation of memory for the array 
        // new keyword is used to create  an object in heap memory and returns reference to that object which is stored in variable "arr"
        // its happen at Runtime which also called as Dynamic Memory Alocation
        // array(refrence var) -> point the data  to some location in heap memory
        // heap object are not continues , runtime data area 
        // its automatically managed by JVM
        // java doesnt have pointer  concept like c or c++
        // Hence Array object in java may not be  continuous block of memory because its depend on JVM

        arr[0] = 1234;  
        System.out.println("Value at index 0: " + arr[0]);

        // Primitive(cant broken into other forms) are always  stored in Stack i.e. "int" , "char", "boolean" etc
        // Objects(can broken into samaller part) are always store in Heap i.e. Classes, Interfaces , String Arrays etc..
    }
    
}
