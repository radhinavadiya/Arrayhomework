import java.util.Scanner;

public class CmnElmtStringValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    //scanner class
        System.out.print("Please enter words separating by space:");
        String array1 = scanner.nextLine();
        String[] s1 = array1.split(" ");//separate the element
        System.out.print("Please enter words separating by space:");
        String array2 = scanner.nextLine();// get input
        String[] s2 = array2.split(" ");//second input
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i].equals(s2[j])) System.out.println(s1[i]);
            }
        }
    }
}

