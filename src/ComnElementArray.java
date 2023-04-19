import java.util.Scanner;

public class ComnElementArray {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Please enter array1 element:");
        String array1=scanner.nextLine();//input
        String element1[]=array1.split(" ");//to split
        System.out.print("Please enter array2 element:");//get input
        String array2=scanner.nextLine();
        String[]element2=array2.split(" ");
        for (int i = 0; i < element1.length ; i++) {
            for (int j = 0; j < element2.length ; j++) {
                if (element1[i].equals(element2[j]))//compare the elements
                System.out.print("Common element: "+element1[i]);//display result

            }

        }

    }
}
