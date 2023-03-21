package homework_projects;

import java.util.Scanner;

/**
 * 20. Write a Java program to test if an array contains a specific value
 */
public class programme20 {                   //class name

    public static void main(String[] args) {  //main method
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number  :  ");  // user input
        int num1 = scan.nextInt();                      //user input stores
        System.out.println("Enter second number  :  ");  // user input
        int num2 = scan.nextInt();                      //user input stores
        System.out.println("Enter third number  :  ");  // user input
        int num3 = scan.nextInt();                      //user input stores
        System.out.println("Enter fourth number  :  ");  // user input
        int num4 = scan.nextInt();                      //user input stores
        System.out.println("Enter fifth number  :  ");  // user input
        int num5 = scan.nextInt();                      //user input stores

        int [] numbers = {num1, num2, num3, num4, num5}; // value difining
        System.out.println("Enter the number : "); //print statement
        int ave = scan.nextInt();

        boolean containValue = false;
        for (int i = 0 ; i < numbers.length; i++){  //logial statement
            if (numbers[i] == ave) {                // condition apply
                containValue = true;                //validate of value
                break;                              // break statement
            }

        }

        if(containValue){
            System.out.println("The array contains " + ave); // print result at console

        }else {
            System.out.println("The array does not contain :  "  + ave); // // print result at console
        }

        scan.close();
    }

}
