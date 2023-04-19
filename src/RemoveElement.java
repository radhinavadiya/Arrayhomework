import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter elements:");
        String a = scanner.nextLine();
        String[] element = a.split(" ");
        System.out.println("Enter position number to remove that elements");
        int position = scanner.nextInt();
        System.out.println("Original array element is " + Arrays.toString(element));
        if (position <= element.length) {
            String[] copyArray = new String[element.length - 1];
            // copy elements from original array from beginning till index into copyArray
            System.arraycopy(element, 0, copyArray, 0, position);
            System.arraycopy(element, position + 1, copyArray, position, element.length - position - 1);
            System.out.println("New array elements " + Arrays.toString(copyArray));

        } else {
            System.out.println("element not found");
        }
    }
}
