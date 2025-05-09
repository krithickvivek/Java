package SetOperations;

import java.util.ArrayList;
public class Intersection {
    public static void main(String[] args) {
        int[] arr1 = {1,5,9,33,56};
        int[] arr2 = {9,5,16,33,12};
        ArrayList<Integer> Out = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            int a = arr1[i];
            boolean flag=false;
            for(int j = 0;j<arr2.length;j++)
            {
                if(arr2[i]==a)
                {
                    flag=true;
                }
            }
            if(flag==true)
            {
                Out.add(arr2[i]);
            }
        }
        System.out.print("[");
        for (int j = 0; j < Out.size(); j++) {
            System.out.print(" "+Out.get(j));
        }
        System.out.println(" ]");
    }
    
}
