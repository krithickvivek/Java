package Armstrong.ArmstrongSingle;
import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int temp = num;
        int ld = 0;
        int sum = 0;
        int pow = (int) Math.log10(num) + 1;
        while (temp > 0) {
            ld = temp % 10;
            sum += Math.pow(ld, pow);
            temp /= 10;
        }
        if (num == sum) {
            System.out.println(num + " is a armstrong");
        } else {
            System.out.println(num + " is not a armstrong");
        }
        input.close();
    }
}
