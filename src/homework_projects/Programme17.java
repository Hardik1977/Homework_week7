package homework_projects;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */

public class Programme17 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("------------------------");
        System.out.println("     String array       ");
        System.out.println("------------------------");
        System.out.println(" Enter first word       ");  //user enter umber
        String aa = scan.nextLine();
        System.out.println(" Enter second word      ");  //user enter umber
        String bb = scan.nextLine();
        System.out.println("  Enter third word      ");  //user enter umber
        String cc = scan.nextLine();
        System.out.println("  Enter fourth word      ");  //user enter umber
        String dd = scan.nextLine();
        System.out.println("  Enter fifth word      ");  //user enter umber
        String ee = scan.nextLine();

        String [] words = { aa, bb, cc, dd, ee};
        Arrays.sort(words);
        System.out.println("Sorted string arrays   : " + Arrays.toString(words));
        System.out.println("-------------------------");
        System.out.println("Numeric Arrays");
        System.out.println("-------------------------");
        System.out.println("Enter first number num1 :   "); //user enter umber
        int num1 = scan.nextInt();
        System.out.println("Enter second number num2 :   ");  //user enter umber
        int num2 = scan.nextInt();
        System.out.println("Enter third number num3 :   ");  //user enter umber
        int num3 = scan.nextInt();
        System.out.println("Enter fourth number num4 :   ");  //user enter umber
        int num4 = scan.nextInt();
        System.out.println("Enter fifth number num5 :   ");  ////user enter umber
        int num5 = scan.nextInt();

        int [] nums = {num1, num2 ,num3, num4, num5};
        Arrays.sort(nums);
        System.out.println("sorted numeric array :  " + Arrays.toString(nums));
        scan.close();
    }

}
