package homework_projects;

import java.util.Scanner;

/**
 * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

public class Programme2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Kindly input any year to find out leap year or not : ");
        int year = scan.nextInt();
        Programme2 obj = new Programme2();  // object defining
        obj.instanceLeap(year);
        scan.close();
    }

    public void instanceLeap(int year) { //method creation
        boolean x = (year % 4) == 0; // variable defining
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));
        if (x && (y || z)) {                                    // if condition
            System.out.println(year + " is a leap year");       // print statement
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

}
