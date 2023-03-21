package homework_projects;

import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
public class Programme16 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number  :   ");
        int num1 = scan.nextInt();
        instance(num1);
        scan.close();
    }

    static void instance(int num1) {

        if (num1 > 0) {
            System.out.println(num1 + "  is a positive number");
        } else if (num1 < 0) {
            System.out.println(num1 + " is a negative number");
        } else {
            System.out.println(num1 + "  is a zero  ");

        }

    }


}
