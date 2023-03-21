package homework_projects;
/**
 * 1. Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */

import java.util.Scanner;

public class Programme1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number in console :");
        int num1 = scan.nextInt();
        Programme1 obj = new Programme1();
        obj.instance(num1);

        //if user enter any number will devide by /2 ==> 1==0 then print enven and any reminder will
        //give odd number print
        //String result = num1 % 2 == 0 ? "Even number" : "Odd number";
        //System.out.println(result);
        scan.close();
    }

    public void instance(int num1){
        //if user enter any number will devide by /2 ==> 1==0 then print enven and any reminder will
        //give odd number print
        String result = num1 % 2 == 0 ? "Even number" : "Odd number";
        System.out.println(result);
        }
    }
