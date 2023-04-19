import java.util.Arrays;
import java.util.Scanner;

public class ArrayEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array 1");//instruction to get input
        String a = scanner.nextLine();//input
        String[] s1 = a.split(",");
        System.out.println("Enter array 2");
        String b = scanner.nextLine();
        String[] s2 = b.split(",");//splits  elements
                if ((Arrays.toString(s1).equals(Arrays.toString(s2))))
                    System.out.println("Both Arrays are equal");// display result
                else {
                    System.out.println("Both Arrays are not equal");
                }
            }
        }