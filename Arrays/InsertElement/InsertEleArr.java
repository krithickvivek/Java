package Arrays.InsertElement;
import java.util.*;
import java.util.ArrayList;
public class InsertEleArr 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to insert in a sorted array : ");
        int val = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(24);
        arr.add(63);
        for (int i = 0; i < arr.size(); i++) 
        {
            if(arr.get(i)>val)
            {   
                arr.add(i,val);
                break;
            }
        }
        System.out.print('[');
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(" "+arr.get(i));
        }
        System.out.println(" ]");
    }
}
