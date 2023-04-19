import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please Enter any arrays to sort it sapereting by ','");
        String ar = scanner.nextLine();//input
        String[] s1 = ar.split(",");
        int size = s1.length;
        int [] arr = new int [size];
        for(int i=0; i<size; i++) {//lenght up to entered by user
            arr[i] = Integer.parseInt(s1[i]);
        }
        Arrays.sort(arr);//sorting
            System.out.println(Arrays.toString(arr));//answer display
 }}