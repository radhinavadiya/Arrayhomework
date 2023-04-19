import java.util.Scanner;
public class ArmStrongNum {
    static boolean isArmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;// a temp variable
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {//get the last digit from the number
            last = temp % 10;
//calculates the power of a number up to digit times and add
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }
        if (n == sum)
            return true;
        else return false;
    }
    public static void main(String args[]) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
//reads the limit from the user
        num = sc.nextInt();
        if (isArmstrong(num)) {
            System.out.print("Armstrong ");
        } else {
            System.out.print("Not Armstrong ");
        }
    }
}
