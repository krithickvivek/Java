import java.util.ArrayList;
import java.util.Scanner;

public class MergeSortedArr 
{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(4);
        arr1.add(9);
        arr1.add(13);
        arr1.add(42);
        System.out.print("First Array : [");
        for (int i = 0; i < arr1.size(); i++) 
        {
            System.out.print(" "+arr1.get(i));
        }
        System.out.println(" ]");
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(3);
        arr2.add(5);
        arr2.add(7);
        arr2.add(24);
        arr2.add(63);
        System.out.print("Second Array : [");
        for (int i = 0; i < arr2.size(); i++) 
        {
            System.out.print(" "+arr2.get(i));
        }
        System.out.println(" ]");
        ArrayList<Integer> Output = new ArrayList<>();
        for (int i = 0; i < arr1.size(); i++) 
        {
            Output.add(arr1.get(i));
            Output.add(arr2.get(i));
        }
        System.out.print("Output Array : [");
        for (int i = 0; i < Output.size(); i++) 
        {
            System.out.print(" "+Output.get(i));
        }
        System.out.println(" ]");

    }
    
}
