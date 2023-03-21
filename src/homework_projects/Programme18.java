package homework_projects;

import java.util.Scanner;

/**
 * 18. Write a Java program to sum values of an array.
 */
public class Programme18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // scanner calling statement
        System.out.println("Enter first number  :");
        int num1 = scan.nextInt();
        System.out.println("Enter second number  :");
        int num2 = scan.nextInt();
        System.out.println("Enter third number  :");
        int num3 = scan.nextInt();
        System.out.println("Enter fourth number  :");
        int num4 = scan.nextInt();
        System.out.println("Enter fifth number  :");
        int num5 = scan.nextInt();

        int [] abc = new int[]{num1,num2,num3,num4,num5};
        int add = 0;
        for (int i=0; i < abc.length; i++){

            add = add+abc[i];
        }
        System.out.println("sum of the eleiments of an array :"  +  add);
        scan.close();
    }


}
