import java.util.Scanner;
    public class CountA {
        public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
            System.out.println("Write a text to count 'a' from text");
            String text = obj.next();  //get input
            char a='a';// variable declaration
            int total =0;
            for (int i = 0; i <text.length() ; i++)//
                if (text.charAt(i)==a){ //if true then go further and add one 'a'
                    total=total+1;}
            System.out.println("Total number of 'a' ="  +total);
        }
}
