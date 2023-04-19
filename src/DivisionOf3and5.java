import java.util.Scanner;
public class DivisionOf3and5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 or 5 to see division number uo to 100");
        int a = scanner.nextInt();
        if (a == 3) {//if user enter 3
            int i = 1;
            do {
                if (i % 3 == 0) {
                    System.out.println(i);
                }  i++;
            }
            while (i <= 100);// up to 100
        }
        if (a == 5) {// if user enter 5
            int i = 1;
            do {
                if (i % 5 == 0) {
                    System.out.println(i);
                } i++;
            } while (i <= 100);
        }
    }
}