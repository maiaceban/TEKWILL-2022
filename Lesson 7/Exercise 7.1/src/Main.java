import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Write a program that reads a string and replaces all occurrences of the letter 'a'
        with the letter 'b'. The program should print out the resulting string.
        Sample Input 1: aaa          Sample Output 1: bbb
        Sample Input 2: bca          Sample Output 2: bcb
        */

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        // Replace all the 'a' characters with 'b' characters.
        String replace = str1.replace('a', 'b');

        System.out.println(replace);
    }
}