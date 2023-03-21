package homework_projects;

import java.util.Scanner;

/**
 * 19. Write a Java program to calculate the average value of array elements
 */
public class Programme19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number : ");
        int num2 = scan.nextInt();
        System.out.println("Enter third number : ");
        int num3 = scan.nextInt();
        System.out.println("Enter fourth number : ");
        int num4 = scan.nextInt();
        System.out.println("Enter fifth number : ");
        int num5 = scan.nextInt();
        System.out.println("Enter sixth number : ");
        int num6 = scan.nextInt();
        System.out.println("Enter seventh number : ");
        int num7 = scan.nextInt();

        int[] num = new int[]{num1, num2, num3, num4, num5, num6, num7};
        int sum = 0;
        int i;
        for (i = 0; i < num.length; i++) {
            ;
            sum = sum + num[i];
            double average = sum / num.length;
            System.out.println("Average value of the array element is : " + average);
            scan.close();

        }

    }
}