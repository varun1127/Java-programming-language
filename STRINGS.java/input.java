import java.util.Scanner;

public class input {
     public static void main(String args[]) {
        char arr[] = {'a','b','c'};
        String str = "abcd";

        //strings are immutable

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.print(name);
    }
}
