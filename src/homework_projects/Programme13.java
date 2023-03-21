package homework_projects;

import java.util.Scanner;

/**
 * 3. Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
public class Programme13 {
    public static void main(String[] args) {
        System.out.println("Enter number between 1 to 7 :  ");
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");   //if condition matches
                break;
            case 2:
                System.out.println("Tuesday");  //if condition matches
                break;
            case 3:
                System.out.println("Wednesday"); //if condition matches
                break;
            case 4:
                System.out.println("Thursday");  //if condition matches
                break;
            case 5:
                System.out.println("Friday");   //if condition matches
                break;
            case 6:
                System.out.println("Saturday");  //if condition matches
                break;
            case 7:
                System.out.println("Sunday");  //if condition matches
                break;
            default:
                System.out.println("invalid weekday number");
                scan.close();
        }


    }


}
