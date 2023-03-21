package homework_projects;

import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Scanner calling
        System.out.println("Enter a number : "); //user input
        int num = reader.nextInt();
        if(num % 2 == 0) {                      // if condition
            System.out.println(num + " is even number."); //result on console
        }else {
            System.out.println(num + "is odd number");

            }
        }
    }



